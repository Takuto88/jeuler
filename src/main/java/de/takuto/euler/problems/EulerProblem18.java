package de.takuto.euler.problems;

import de.takuto.euler.EulerProblem;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * By starting at the top of the triangle below and moving to adjacent numbers on the row below, the maximum total from top to bottom is 23.
 * <p>
 *  3
 *  7 4
 *  2 4 6
 *  8 5 9 3
 * </p>
 * <p>
 *  That is, 3 + 7 + 4 + 9 = 23.
 * </p>
 * <p>
 *  Find the maximum total from top to bottom of the triangle below:
 * </p>
 * <p>
 *  75
 *  95 64
 *  17 47 82
 *  18 35 87 10
 *  20 04 82 47 65
 *  19 01 23 75 03 34
 *  88 02 77 73 07 63 67
 *  99 65 04 28 06 16 70 92
 *  41 41 26 56 83 40 80 70 33
 *  41 48 72 33 47 32 37 16 94 29
 *  53 71 44 65 25 43 91 52 97 51 14
 *  70 11 33 28 77 73 17 78 39 68 17 57
 *  91 71 52 38 17 14 91 43 58 50 27 29 48
 *  63 66 04 68 89 53 67 30 73 16 69 87 40 31
 *  04 62 98 27 23 09 70 98 73 93 38 53 60 04 23
 * </p>
 * <p>
 *  NOTE: As there are only 16384 routes, it is possible to solve this problem
 *  by trying every route. However, Problem 67, is the same challenge with a triangle
 *  containing one-hundred rows; it cannot be solved by brute force, and requires a clever method! ;o)
 * </p>
 */
public class EulerProblem18 implements EulerProblem {

    // located under fixtures. There's also EulerProblem18_b with the small triangle.
    private static final String TRIANGLE_FILE = "EulerProblem18_a.txt";

    public String solve() {
        final var triangle = loadTriangleFixture();

        for(var line = triangle.length - 2 ; line >= 0; line--) {
            for (var column = 0; column < triangle[line + 1].length -1; column++) {
                triangle[line][column] += Math.max(triangle[line + 1][column], triangle[line+1][column + 1]);
            }
        }

        return String.format(String.format("The maximum total of adjacent numbers from top to bottom is %d", triangle[0][0]));
    }

    public int getNumber() {
        return 18;
    }

    private int[][] loadTriangleFixture() {
        try (final var lines = Files.lines(Paths.get("src/main/resources/de/takuto/euler/fixtures/" + TRIANGLE_FILE))) {
            final var integerLines = lines.map(line -> line.split(" "))
                    .map(stringNumbers -> {
                        final var numbers = new int[stringNumbers.length];
                        for (var i = 0; i < stringNumbers.length; i++) {
                            numbers[i] = Integer.parseInt(stringNumbers[i]);
                        }

                        return numbers;
                    }).toList();

            return integerLines.toArray(new int[integerLines.size()][]);
        } catch (final IOException e) {
            throw new RuntimeException(e);
        }
    }

}
