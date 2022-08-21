package de.takuto.euler.problems;

import de.takuto.euler.AbstractEulerProblemTest;
import org.junit.jupiter.api.BeforeEach;

class EulerProblem12Test extends AbstractEulerProblemTest {

    @BeforeEach
    public void setUp() {
        super.expectedNumber = 12;
        super.expectedMessage = "The first triangle number to have more than 500 divisors is: 76576500";
        super.underTest = new EulerProblem12();
    }
}