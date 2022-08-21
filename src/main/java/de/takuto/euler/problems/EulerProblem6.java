package de.takuto.euler.problems;

import de.takuto.euler.EulerProblem;

/**
 * The sum of the squares of the first ten natural numbers is,
 * <p>
 * 12 + 22 + ... + 102 = 385
 * The square of the sum of the first ten natural numbers is,
 * </p>
 * <p>
 * (1 + 2 + ... + 10)2 = 552 = 3025
 * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
 * </p>
 * <p>
 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 * </p>
 */
public class EulerProblem6 implements EulerProblem {
    public String solve() {
        var sumOfSquares = 0;
        var sumOfNumbers = 0;
        for(var i = 1; i <= 100; i++) {
            sumOfSquares += (i * i);
            sumOfNumbers += i;
        }

        final var squareSumOfSum = (sumOfNumbers * sumOfNumbers);
        final var difference =squareSumOfSum - sumOfSquares;

        return "The difference between the sum of the squares of the first 100 natural numbers and the square of the sum is: " + squareSumOfSum + " - " + sumOfSquares + " = " + difference;
    }

    public int getNumber() {
        return 6;
    }
}
