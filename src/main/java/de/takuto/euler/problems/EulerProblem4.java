package de.takuto.euler.problems;


import de.takuto.euler.EulerProblem;

/**
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 * <p>
 * See <a href="https://projecteuler.net/problem=4">EulerProblem #4</a>
 * </p>
 */
public class EulerProblem4 implements EulerProblem {


    public String solve() {
        var largestPalindrome = 0;

        for(var x = 100; x <= 999; x++) {
            for(var y = 100; y <= 999; y++){
                final var product = x * y;
                if(isPalindrome(product) && largestPalindrome < product) {
                    largestPalindrome = product;
                }
            }
        }

        return "The largest palindrome made from the product of two three digit numbers is: " + largestPalindrome;
    }

    private String reverse(final String toReverse) {
        final var arr = toReverse.toCharArray();
        final var sb = new StringBuilder();
        for(var i = arr.length - 1; i >= 0; i--) {
            sb.append(arr[i]);
        }

        return sb.toString();
    }

    private boolean isPalindrome(final int number) {
        final var num = "" + number;
        final var palindrome = reverse(num);
        return num.equals(palindrome);
    }


    public int getNumber() {
        return 4;
    }
}
