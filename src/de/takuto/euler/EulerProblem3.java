package de.takuto.euler;

/**
 * Created by lennart on 29.05.16.
 */
public class EulerProblem3 {

    private static long TARGET = 600851475143L;

    public static String solve() {

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

    private static boolean isPrime(long number) {
        for(long i = 3; i < number; i++) {
            if(number % i == 0) {
                return false;
            }
        }
        return true;
    }

}
