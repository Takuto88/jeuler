package de.takuto.euler;

import org.apache.commons.cli.*;
import org.reflections.Reflections;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Set;

/**
 * Main class to execute all problems
 */
public class App {

    private static App instance;
    private static final int RUN_ALL = -1;
    private static final int MAX_NUMBER_OF_EULER_PROBLEMS = 552;

    private EulerProblem[] problems;

    public static App getInstance() {
        if(instance == null) {
            instance = new App();
        }

        return instance;
    }

    private App() {
        Reflections reflections = new Reflections("de.takuto.euler.problems");
        Set<Class<? extends EulerProblem>> problemSet = reflections.getSubTypesOf(EulerProblem.class);
        problems = new EulerProblem[MAX_NUMBER_OF_EULER_PROBLEMS];
        for(Class problemClass : problemSet) {
            try {
                if(EulerProblem.class.isAssignableFrom(problemClass) ) {
                    Constructor<?> constructor = problemClass.getConstructor();
                    EulerProblem problem = (EulerProblem) constructor.newInstance();
                    problems[problem.getNumber() - 1] = problem;
                }
            } catch (NoSuchMethodException e) {
                System.err.println("EulerProblem class " + problemClass.getCanonicalName() + " does not have default constructor!");
                System.exit(1);
            } catch (Throwable t) {
                System.err.println("An unknown error occured!");
                t.printStackTrace();
                System.exit(1);
            }
        }
    }

    public void run(int problemNo) {
        if(problemNo == RUN_ALL) {
            for(EulerProblem problem : problems) {
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

        EulerProblem problem = problems[problemNo - 1];
        if(problem == null) {
            System.err.println("Problem number " + problemNo + " not (yet) implemented!");
            System.exit(1);
        }
        System.out.println("EulerProblem " + problem.getNumber() + ": " + problem.solve());
    }

    public static void main(String args[]) {
        Options options = new Options();

        options.addOption("h", "help", false, "Displays help message");
        Option runOpt = new Option("r", "run", true, "Runs the given EulerProblem");
        runOpt.setArgName("no");
        options.addOption(runOpt);
        options.addOption("a", "all", false, "Runs all Euler problems");

        try {
            CommandLine cli = new DefaultParser().parse(options, args);
            App app = App.getInstance();
            if(!cli.hasOption("r") && !cli.hasOption("a") ||cli.hasOption("h")) {
                printHelp(options);
                System.exit(1);
            } else if(cli.hasOption("a")) {
                app.run(RUN_ALL);
                return;
            }

            int problemNo = 0;
            try {
                problemNo = Integer.parseInt(cli.getOptionValue("r"));
                app.run(problemNo);
            } catch(NumberFormatException e) {
                printHelp(options);
                System.exit(1);
            }

        } catch (MissingArgumentException e) {
            System.err.println(e.getMessage());
            printHelp(options);
            System.exit(1);

        } catch (ParseException e) {
            System.err.println("Error parsing command line!");
            e.printStackTrace();
            System.exit(1);
        }


    }

    private static void printHelp(Options options) {
        System.out.println("Usage jeuler [OPTIONS]");
        for(Option option : options.getOptions()) {
            if(option.hasArg() || option.hasOptionalArg()) {
                System.out.println("-" + option.getOpt() + " --" + option.getLongOpt() + " [" +  option.getArgName() + "]: \t\t\t" + option.getDescription());
            } else {
                System.out.println("-" + option.getOpt() + " --" + option.getLongOpt() + ": \t\t\t\t" + option.getDescription());
            }

        }
    }

}
