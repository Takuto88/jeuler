package de.takuto.euler.problems;

import de.takuto.euler.AbstractEulerProblemTest;
import org.junit.jupiter.api.BeforeEach;

class EulerProblem20Test extends AbstractEulerProblemTest {

    @BeforeEach
    public void setUp() {
        super.expectedNumber = 20;
        super.expectedMessage = "The factorial digit sum for 100 is 648";
        super.underTest = new EulerProblem20();
    }
}