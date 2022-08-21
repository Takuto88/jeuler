package de.takuto.euler.problems;

import de.takuto.euler.AbstractEulerProblemTest;
import org.junit.jupiter.api.BeforeEach;

class EulerProblem8Test extends AbstractEulerProblemTest {

    @BeforeEach
    public void setUp() {
        super.expectedNumber = 8;
        super.expectedMessage = "The largest product of 13 adjacent numbers is: 23514624000";
        super.underTest = new EulerProblem8();
    }
}