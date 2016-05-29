package de.takuto.euler;

/**
 * All projecteuler.net problem solutions should implement this
 *
 * @author Lennart Rosam
 */

public interface EulerProblem {

    /**
     * This method will solve the problem in code and
     * return the answer in form of a human readable string.
     *
     * @return The solution to the problem as human readable string
     */

    String solve();

    /**
     * Should return the number of the euler Problem.
     * @return The number
     */
    int getNumber();


}
