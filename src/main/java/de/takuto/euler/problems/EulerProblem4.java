package de.takuto.euler.problems;


import de.takuto.euler.EulerProblem;

/**
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 *
 * See https://projecteuler.net/problem=4
 */
public class EulerProblem4 implements EulerProblem {


    public String solve() {
        int largestPalin = 0;

        for(int x = 100; x <= 999; x++) {
            for(int y = 100; y <= 999; y++){
                int product = x * y;
                if(isPalindrome(product) && largestPalin < product) {
                    largestPalin = product;
                }
            }
        }

        return "The largest palindrome made from the product of two three digit numbers is: " + largestPalin;
    }

    private String reverse(String toReverse) {
        char[] arr = toReverse.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i = arr.length - 1; i >= 0; i--) {
            sb.append(arr[i]);
        }

        return sb.toString();
    }

    private boolean isPalindrome(int number) {
        String num = "" + number;
        String palin = reverse(num);
        return num.equals(palin);
    }


    public int getNumber() {
        return 4;
    }
}
