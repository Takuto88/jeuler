package de.takuto.euler.problems;

import de.takuto.euler.AbstractEulerProblemTest;
import org.junit.jupiter.api.BeforeEach;

class EulerProblem3Test extends AbstractEulerProblemTest {

    @BeforeEach
    public void setUp() {
        super.expectedNumber = 3;
        super.expectedMessage = "Largest factor of 600851475143 is: 6857";
        super.underTest = new EulerProblem3();
    }
}