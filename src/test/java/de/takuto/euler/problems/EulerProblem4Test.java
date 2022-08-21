package de.takuto.euler.problems;

import de.takuto.euler.AbstractEulerProblemTest;
import org.junit.jupiter.api.BeforeEach;

class EulerProblem4Test extends AbstractEulerProblemTest {

    @BeforeEach
    public void setUp() {
        super.expectedNumber = 4;
        super.expectedMessage = "The largest palindrome made from the product of two three digit numbers is: 906609";
        super.underTest = new EulerProblem4();
    }
}