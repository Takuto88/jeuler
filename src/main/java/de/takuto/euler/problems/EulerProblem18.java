package de.takuto.euler.problems;

import de.takuto.euler.EulerProblem;

import java.io.*;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;

/**
 * By starting at the top of the triangle below and moving to adjacent numbers on the row below, the maximum total from top to bottom is 23.
 *
 * 3
 * 7 4
 * 2 4 6
 * 8 5 9 3
 *
 * That is, 3 + 7 + 4 + 9 = 23.
 *
 * Find the maximum total from top to bottom of the triangle below:
 *
 * 75
 * 95 64
 * 17 47 82
 * 18 35 87 10
 * 20 04 82 47 65
 * 19 01 23 75 03 34
 * 88 02 77 73 07 63 67
 * 99 65 04 28 06 16 70 92
 * 41 41 26 56 83 40 80 70 33
 * 41 48 72 33 47 32 37 16 94 29
 * 53 71 44 65 25 43 91 52 97 51 14
 * 70 11 33 28 77 73 17 78 39 68 17 57
 * 91 71 52 38 17 14 91 43 58 50 27 29 48
 * 63 66 04 68 89 53 67 30 73 16 69 87 40 31
 * 04 62 98 27 23 09 70 98 73 93 38 53 60 04 23
 *
 * NOTE: As there are only 16384 routes, it is possible to solve this problem
 * by trying every route. However, Problem 67, is the same challenge with a triangle
 * containing one-hundred rows; it cannot be solved by brute force, and requires a clever method! ;o)
 */
public class EulerProblem18 implements EulerProblem {

    private static final String TRIANGLE_FILE = "EulerProblem18_b.txt"; // located under fixtures

    public String solve() {
        String triangleString = loadTriangleString();
        createTriangleFromString(triangleString);


        return null;
    }

    public int getNumber() {
        return 18;
    }

    private String loadTriangleString() {
        try {
            InputStream fileStream = this.getClass().getResourceAsStream("/de/takuto/euler/fixtures/" + TRIANGLE_FILE);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileStream));
            StringBuilder sb = new StringBuilder();
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
            }

            return sb.toString();
        } catch (Exception e) {
            throw new RuntimeException("Error loading triangle file: " + e.getMessage(), e);
        }
    }

    private String[][] createTriangleFromString(String input) {
        String[] lines = input.split("\\" + System.lineSeparator());
        String lastLine = lines[lines.length - 1];
        int numberOfCols = lastLine.split(" ").length;

        String[][] triangle = new String[lines.length][numberOfCols];

        for (int rows = lines.length - 1; rows >= 0; rows--) {

        }

        return null;
    }

}
