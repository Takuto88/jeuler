package de.takuto.euler.problems;

import de.takuto.euler.EulerProblem;

import java.math.BigInteger;

/**
 * <p>
 *  n! means n × (n − 1) × ... × 3 × 2 × 1
 * </p>
 * <p>
 *  For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
 *  and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.
 * </p>
 * <p>
 *  Find the sum of the digits in the number 100!
 * </p>
 */
public class EulerProblem20 implements EulerProblem {

    private static final int FACTORIAL_DIGIT = 100;

    @Override
    public String solve() {
        var multiplicationResult = BigInteger.valueOf(1);

        for (var i = (long) FACTORIAL_DIGIT; i > 1; i--) {
            multiplicationResult = multiplicationResult.multiply(BigInteger.valueOf(i));
        }

        final var resultChars = multiplicationResult.toString().toCharArray();
        var sum = 0;
        for (final var resultChar : resultChars) {
            sum += Integer.parseInt(String.format("%s", resultChar));
        }

        return String.format("The factorial digit sum for %d is %d", FACTORIAL_DIGIT, sum);
    }

    @Override
    public int getNumber() {
        return 20;
    }
}
