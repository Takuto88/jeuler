package de.takuto.euler.problems;

import de.takuto.euler.AbstractEulerProblemTest;
import org.junit.jupiter.api.BeforeEach;

class EulerProblem17Test extends AbstractEulerProblemTest {

    @BeforeEach
    public void setUp() {
        super.expectedNumber = 17;
        super.expectedMessage = "The numbers 1 through 1000 written out are using 21124 letters";
        super.underTest = new EulerProblem17();
    }
}