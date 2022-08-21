package de.takuto.euler.problems;

import de.takuto.euler.EulerProblem;

/**
 * Starting in the top left corner of a 2×2 grid, and only being able to move to the right and down,
 * there are exactly 6 routes to the bottom right corner.
 * <p>
 *  How many such routes are there through a 20×20 grid?
 * </p>
 */
public class EulerProblem15 implements EulerProblem {

    private static final int GRID_SIZE = 20; // Grid = GRID_SIZE * GRID_SIZE

    public String solve() {
        long paths = 1;

        for (var i = 0; i < GRID_SIZE; i++){
            paths *= (2 * GRID_SIZE) - i;
            paths /= i + 1;
        }

        return "The number of possible paths through a " + GRID_SIZE + "x" + GRID_SIZE + " grid is: " + paths;
    }

    public int getNumber() {
        return 15;
    }
}
