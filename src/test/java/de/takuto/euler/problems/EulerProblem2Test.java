package de.takuto.euler.problems;

import de.takuto.euler.AbstractEulerProblemTest;
import org.junit.jupiter.api.BeforeEach;

class EulerProblem2Test extends AbstractEulerProblemTest {

    @BeforeEach
    public void setUp() {
        super.expectedNumber = 2;
        super.expectedMessage = "The sum of all even evaluated terms smaller than 4 Million is 4613732";
        super.underTest = new EulerProblem2();
    }
}