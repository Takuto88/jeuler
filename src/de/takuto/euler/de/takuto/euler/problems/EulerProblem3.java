package de.takuto.euler.de.takuto.euler.problems;

import de.takuto.euler.EulerProblem;

/**
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 *
 * @see https://projecteuler.net/problem=3
 */
public class EulerProblem3 implements EulerProblem {

    private static long TARGET = 600851475143L;

    @Override
    public String solve() {

        long product = TARGET;
        long i = 1;
        long largestFactor = 2;

        while(product != 1){
            i++;
            if(!isPrime(i)) {
                continue;
            }
            while(product % i == 0) {
                largestFactor = i;
                product = product / i;
            }
        }

        return "Largest factor of " + TARGET + " is: " + largestFactor;
    }

    @Override
    public int getNumber() {
        return 3;
    }

    private boolean isPrime(long number) {
        for(long i = 3; i < number; i++) {
            if(number % i == 0) {
                return false;
            }
        }
        return true;
    }

}
