package de.takuto.euler.problems;

import de.takuto.euler.EulerProblem;

/**
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 *
 * a2 + b2 = c2
 * For example, 32 + 42 = 9 + 16 = 25 = 52.
 *
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 */
public class EulerProblem9 implements EulerProblem {
    public String solve() {
        for(int c = 3; c <= 1000; c++) {
            for(int b = 2; b <= c; b++) {
                for(int a = 1; a <= b; a++) {
                    if(a + b + c == 1000 && (a*a) + (b*b) == (c*c) && ((a < b) && b < c) ) {
                        return "The Pythagorean is " + a + " + " + b + " + " + c + " and the product is: " + (a*b*c);
                    }
                }
            }
        }
        return null;
    }

    public int getNumber() {
        return 9;
    }
}
