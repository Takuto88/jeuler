package de.takuto.euler.problems;

import de.takuto.euler.AbstractEulerProblemTest;
import org.junit.jupiter.api.BeforeEach;

class EulerProblem11Test extends AbstractEulerProblemTest {

    @BeforeEach
    public void setUp() {
        super.expectedNumber = 11;
        super.expectedMessage = "The greatest product of 4 numbers is 70600674";
        super.underTest = new EulerProblem11();
    }
}