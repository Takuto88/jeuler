package de.takuto.euler.utils;

/**
 * Problem-wide math utility class
 */
public class MathUtil {
    /**
     * Checks, whether the given number is a prime number
     * @param number to check
     * @return True if it is, otherwise false
     */
    public static boolean isPrime(final long number) {
        if (number < 2 || (number != 2 && number % 2 == 0)) {
            return false;
        }
        for(long i = 3;i * i <= number; i += 2) {
            if(number %i == 0) {
                return false;
            }
        }
        return true;
    }
}
