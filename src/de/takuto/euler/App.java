package de.takuto.euler;

/**
 * Created by lennart on 29.05.16.
 */
public class App {

    private static App instance;

    public static App getInstance() {
        if(instance == null) {
            instance = new App();
        }

        return instance;
    }

    public void run() {
        //int result = EulerProblem1.findSumOfMultiples(1, 999);
        //System.out.println("The sum of all multiples below 1000 is " + result);

        System.out.println(EulerProblem3.solve());

    }

    public static void main(String args[]) {
        App.getInstance().run();;
    }

}
