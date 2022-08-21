package de.takuto.euler.problems;

import de.takuto.euler.AbstractEulerProblemTest;
import org.junit.jupiter.api.BeforeEach;

class EulerProblem9Test extends AbstractEulerProblemTest {

    @BeforeEach
    public void setUp() {
        super.expectedNumber = 9;
        super.expectedMessage = "The Pythagorean is 200 + 375 + 425 and the product is: 31875000";
        super.underTest = new EulerProblem9();
    }
}