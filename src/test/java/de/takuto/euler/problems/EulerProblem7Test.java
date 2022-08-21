package de.takuto.euler.problems;

import de.takuto.euler.AbstractEulerProblemTest;
import org.junit.jupiter.api.BeforeEach;

class EulerProblem7Test extends AbstractEulerProblemTest {

    @BeforeEach
    public void setUp() {
        super.expectedNumber = 7;
        super.expectedMessage = "The 10001th prime number is: 104743";
        super.underTest = new EulerProblem7();
    }
}