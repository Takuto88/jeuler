package de.takuto.euler.problems;

import de.takuto.euler.EulerProblem;

/**
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 * <p>
 * See: <a href="https://projecteuler.net/problem=5">EulerProblem #5</a>
 * </p>
 */
public class EulerProblem5 implements EulerProblem {

    public String solve() {

        var currentNumber = 0;
        do {
            currentNumber++;
        } while (!isEvenlyDivisibleBy1to20(currentNumber));

        return "The smallest positive number that is evenly divisible by numbers from 1 to 20 is: " + currentNumber;
    }

    private boolean isEvenlyDivisibleBy1to20(final int number) {
        for(var i = 1; i <= 20; i++) {
            if(number % i != 0) {
                return false;
            }
        }

        return true;
    }

    public int getNumber() {
        return 5;
    }
}
