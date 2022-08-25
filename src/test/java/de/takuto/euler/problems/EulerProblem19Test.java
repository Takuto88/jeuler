package de.takuto.euler.problems;

import de.takuto.euler.AbstractEulerProblemTest;
import org.junit.jupiter.api.BeforeEach;

class EulerProblem19Test extends AbstractEulerProblemTest {

    @BeforeEach
    public void setUp() {
        super.expectedNumber = 19;
        super.expectedMessage = "The total number of sundays on the first of the month between 1901 and 2000 is 171";
        super.underTest = new EulerProblem19();
    }
}