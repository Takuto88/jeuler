package de.takuto.euler.problems;

import de.takuto.euler.AbstractEulerProblemTest;
import org.junit.jupiter.api.BeforeEach;

class EulerProblem13Test extends AbstractEulerProblemTest {

    @BeforeEach
    public void setUp() {
        super.expectedNumber = 13;
        super.expectedMessage = "The first ten digits of the 50 digit number added are: 5537376230";
        super.underTest = new EulerProblem13();
    }
}