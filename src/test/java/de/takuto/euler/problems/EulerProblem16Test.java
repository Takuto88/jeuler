package de.takuto.euler.problems;

import de.takuto.euler.AbstractEulerProblemTest;
import org.junit.jupiter.api.BeforeEach;

class EulerProblem16Test extends AbstractEulerProblemTest {

    @BeforeEach
    public void setUp() {
        super.expectedNumber = 16;
        super.expectedMessage = "The sum of all digits of 2 to the power of 1000 is: 1366";
        super.underTest = new EulerProblem16();
    }
}