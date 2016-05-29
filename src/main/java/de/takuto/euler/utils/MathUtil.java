package de.takuto.euler.utils;

/**
 * Problem-wide math utilitiy class
 */
public class MathUtil {
    /**
     * Checks, whether or not the given number is a prime number
     * @param number to check
     * @return True if it is, otherwise false
     */
    public static boolean isPrime(long number) {
        if(number < 2) {
            return false;
        }
        for(long i = 2; i < number; i++) {
            if(number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
