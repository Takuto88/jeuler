package de.takuto.euler;

import org.apache.commons.cli.*;
import org.reflections.Reflections;

/**
 * Main class to execute all problems
 */
public class App {

    private static App instance;
    private static final int RUN_ALL = -1;
    private static final int MAX_NUMBER_OF_EULER_PROBLEMS = 552;

    private final EulerProblem[] problems;

    public static App getInstance() {
        if(instance == null) {
            instance = new App();
        }

        return instance;
    }

    private App() {
        final var reflections = new Reflections("de.takuto.euler.problems");
        final var problemSet = reflections.getSubTypesOf(EulerProblem.class);
        problems = new EulerProblem[MAX_NUMBER_OF_EULER_PROBLEMS];
        for(final var problemClass : problemSet) {
            try {
                if(EulerProblem.class.isAssignableFrom(problemClass) ) {
                    final var constructor = problemClass.getConstructor();
                    final var problem = (EulerProblem) constructor.newInstance();
                    problems[problem.getNumber() - 1] = problem;
                }
            } catch (final NoSuchMethodException e) {
                System.err.println("EulerProblem class " + problemClass.getCanonicalName() + " does not have default constructor!");
                System.exit(1);
            } catch (final Throwable t) {
                System.err.println("An unknown error occurred!");
                t.printStackTrace();
                System.exit(1);
            }
        }
    }

    public void run(final int problemNo) {
        if(problemNo == RUN_ALL) {
            for(final var problem : problems) {
                if(problem == null) {
                    continue;
                }
                System.out.println("EulerProblem " + problem.getNumber() + ": " + problem.solve());
            }
            return;
        }

        if(problemNo > problems.length) {
            System.err.println("Problem number " + problemNo + " not (yet) implemented!");
            System.exit(1);
        }

        final var problem = problems[problemNo - 1];
        if(problem == null) {
            System.err.println("Problem number " + problemNo + " not (yet) implemented!");
            System.exit(1);
        }
        System.out.println("EulerProblem " + problem.getNumber() + ": " + problem.solve());
    }

    public static void main(final String[] args) {
        final var options = new Options();

        options.addOption("h", "help", false, "Displays help message");
        final var runOpt = new Option("r", "run", true, "Runs the given EulerProblem");
        runOpt.setArgName("no");
        options.addOption(runOpt);
        options.addOption("a", "all", false, "Runs all Euler problems");

        try {
            final var cli = new DefaultParser().parse(options, args);
            final var app = App.getInstance();
            if(!cli.hasOption("r") && !cli.hasOption("a") ||cli.hasOption("h")) {
                printHelp(options);
                System.exit(1);
            } else if(cli.hasOption("a")) {
                app.run(RUN_ALL);
                return;
            }

            var problemNo = 0;
            try {
                problemNo = Integer.parseInt(cli.getOptionValue("r"));
                app.run(problemNo);
            } catch(final NumberFormatException e) {
                printHelp(options);
                System.exit(1);
            }

        } catch (final MissingArgumentException e) {
            System.err.println(e.getMessage());
            printHelp(options);
            System.exit(1);

        } catch (final ParseException e) {
            System.err.println("Error parsing command line!");
            e.printStackTrace();
            System.exit(1);
        }


    }

    private static void printHelp(final Options options) {
        System.out.println("Usage jeuler [OPTIONS]");
        for(final var option : options.getOptions()) {
            if(option.hasArg() || option.hasOptionalArg()) {
                System.out.println("-" + option.getOpt() + " --" + option.getLongOpt() + " [" +  option.getArgName() + "]: \t\t\t" + option.getDescription());
            } else {
                System.out.println("-" + option.getOpt() + " --" + option.getLongOpt() + ": \t\t\t\t" + option.getDescription());
            }

        }
    }

}
