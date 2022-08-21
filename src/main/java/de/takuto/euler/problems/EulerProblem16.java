package de.takuto.euler.problems;

import de.takuto.euler.EulerProblem;

import java.math.BigInteger;

/**
 * 2 to the power of 15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
 * What is the sum of the digits of the number 2 to the power of 1000?
 */
public class EulerProblem16 implements EulerProblem {

    private static final int EXPONENT = 1000;

    public String solve() {
        final var strRes = BigInteger.valueOf(2).pow(EXPONENT).toString();
        var sum = 0;

        for (final var c : strRes.toCharArray()) {
            sum += Integer.parseInt("" + c);
        }

        return "The sum of all digits of 2 to the power of " + EXPONENT + " is: " + sum;
    }

    public int getNumber() {
        return 16;
    }
}
