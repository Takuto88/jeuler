package de.takuto.euler.problems;

import de.takuto.euler.AbstractEulerProblemTest;
import org.junit.jupiter.api.BeforeEach;

class EulerProblem10Test extends AbstractEulerProblemTest {

    @BeforeEach
    public void setUp() {
        super.expectedNumber = 10;
        super.expectedMessage = "The sum of all primes below 2000000 is: 142913828922";
        super.underTest = new EulerProblem10();
    }
}