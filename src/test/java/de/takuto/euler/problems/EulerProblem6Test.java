package de.takuto.euler.problems;

import de.takuto.euler.AbstractEulerProblemTest;
import org.junit.jupiter.api.BeforeEach;

class EulerProblem6Test extends AbstractEulerProblemTest {

    @BeforeEach
    public void setUp() {
        super.expectedNumber = 6;
        super.expectedMessage = "The difference between the sum of the squares of the first 100 natural numbers and the square of the sum is: 25502500 - 338350 = 25164150";
        super.underTest = new EulerProblem6();
    }
}