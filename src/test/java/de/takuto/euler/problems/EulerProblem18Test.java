package de.takuto.euler.problems;

import de.takuto.euler.AbstractEulerProblemTest;
import org.junit.jupiter.api.BeforeEach;

class EulerProblem18Test extends AbstractEulerProblemTest {

    @BeforeEach
    public void setUp() {
        super.expectedNumber = 18;
        super.expectedMessage = "The maximum total of adjacent numbers from top to bottom is 1074";
        super.underTest = new EulerProblem18();
    }
}