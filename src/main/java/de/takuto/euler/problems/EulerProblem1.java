package de.takuto.euler.problems;

import de.takuto.euler.EulerProblem;


/**
 *
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 *
 * See: https://projecteuler.net/problem=1
 */

public class EulerProblem1 implements EulerProblem {


    public String solve() {
        int min = 0;
        int max = 999;
        int sum = 0;

        for(int i = min; i <= max; i++) {
            if(i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }

        return "The sum of all multipliers between 3 and 5 below 1000 is: " + sum;
    }

    public int getNumber() {
        return 1;
    }
}
