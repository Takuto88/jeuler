package de.takuto.euler.problems;

import de.takuto.euler.EulerProblem;
import de.takuto.euler.utils.MathUtil;

/**
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 *
 * See: https://projecteuler.net/problem=3
 */
public class EulerProblem3 implements EulerProblem {

    private static final long TARGET = 600851475143L;

    public String solve() {

        long product = TARGET;
        long i = 1;
        long largestFactor = 2;

        while(product != 1){
            i++;
            if(!MathUtil.isPrime(i)) {
                continue;
            }
            while(product % i == 0) {
                largestFactor = i;
                product = product / i;
            }
        }

        return "Largest factor of " + TARGET + " is: " + largestFactor;
    }

    public int getNumber() {
        return 3;
    }

}
