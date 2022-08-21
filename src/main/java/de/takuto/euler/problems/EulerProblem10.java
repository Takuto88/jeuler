package de.takuto.euler.problems;

import de.takuto.euler.EulerProblem;
import de.takuto.euler.utils.MathUtil;

/**
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * Find the sum of all the primes below two million.
 */
public class EulerProblem10 implements EulerProblem {
    private final static int FIND_SUM_OF_PRIMES_BELOW_N = 2000000;

    public String solve() {
        var sumOfPrimes = 0L;
        for(var i = 1; i < FIND_SUM_OF_PRIMES_BELOW_N; i++) {
            if(MathUtil.isPrime(i)){
                sumOfPrimes += i;
            }
        }
        return "The sum of all primes below " + FIND_SUM_OF_PRIMES_BELOW_N + " is: " + sumOfPrimes;
    }

    public int getNumber() {
        return 10;
    }
}
