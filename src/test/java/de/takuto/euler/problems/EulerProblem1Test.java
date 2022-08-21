package de.takuto.euler.problems;

import de.takuto.euler.AbstractEulerProblemTest;
import org.junit.jupiter.api.BeforeEach;

class EulerProblem1Test extends AbstractEulerProblemTest {

    @BeforeEach
    public void setUp() {
        super.expectedNumber = 1;
        super.expectedMessage = "The sum of all multipliers between 3 and 5 below 1000 is: 233168";
        super.underTest = new EulerProblem1();
    }
}