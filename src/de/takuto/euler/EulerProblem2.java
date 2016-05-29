package de.takuto.euler;

/**
 * Created by lennart on 29.05.16.
 */
public class EulerProblem2 {

    /**
     * Finds the sum of all even Fibbonaci numbers < 4 Million
     * and returns a human readable string
     *
     * @return Human readable answer
     */
    public static String solve() {
        int firstPrevious = 1;
        int secondPrevious = 2;
        int current = 0;

        int sumOfAllEven = 2;

        boolean assignToFirst = true;

        do {
            current = firstPrevious + secondPrevious;
            if(assignToFirst) {
                firstPrevious = current;
            } else {
                secondPrevious = current;
            }
            assignToFirst = !assignToFirst;

            if(current % 2 == 0) {
                sumOfAllEven += current;
            }

        } while(current < 4000000);
        return "The sum of all even evaluated terms smaller than 4 Million is " + sumOfAllEven;
    }

}
