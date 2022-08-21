package de.takuto.euler.problems;

import de.takuto.euler.AbstractEulerProblemTest;
import org.junit.jupiter.api.BeforeEach;

class EulerProblem15Test extends AbstractEulerProblemTest {

    @BeforeEach
    public void setUp() {
        super.expectedNumber = 15;
        super.expectedMessage = "The number of possible paths through a 20x20 grid is: 137846528820";
        super.underTest = new EulerProblem15();
    }
}