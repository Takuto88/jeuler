package de.takuto.euler.problems;

import de.takuto.euler.AbstractEulerProblemTest;
import org.junit.jupiter.api.BeforeEach;

class EulerProblem14Test extends AbstractEulerProblemTest {

    @BeforeEach
    public void setUp() {
        super.expectedNumber = 14;
        super.expectedMessage = "The longest collatz chain is 556 numbers long. Starting number is: 837799";
        super.underTest = new EulerProblem14();
    }
}