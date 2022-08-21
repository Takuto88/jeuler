package de.takuto.euler.problems;

import de.takuto.euler.AbstractEulerProblemTest;
import org.junit.jupiter.api.BeforeEach;

class EulerProblem5Test extends AbstractEulerProblemTest {

    @BeforeEach
    public void setUp() {
        super.expectedNumber = 5;
        super.expectedMessage = "The smallest positive number that is evenly divisible by numbers from 1 to 20 is: 232792560";
        super.underTest = new EulerProblem5();
    }
}