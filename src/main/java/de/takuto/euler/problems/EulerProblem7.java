package de.takuto.euler.problems;

import de.takuto.euler.EulerProblem;
import de.takuto.euler.utils.MathUtil;

/**
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 * What is the 10 001st prime number?
 */
public class EulerProblem7 implements EulerProblem {

    private static final int NTH_PRIME_NUMBER = 10001;

    public String solve() {
        int primeCounter = 0;
        long currentNumber = 0;
        long primeNumber = 0;

        do{
            if(MathUtil.isPrime(currentNumber)) {
                primeNumber = currentNumber;
                primeCounter++;
            }
            currentNumber++;
        } while(primeCounter != NTH_PRIME_NUMBER);

        return "The " + NTH_PRIME_NUMBER + "th prime number is: " + primeNumber;
    }

    public int getNumber() {
        return 7;
    }
}
