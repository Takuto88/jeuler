package de.takuto.euler;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public abstract class AbstractEulerProblemTest {

    protected EulerProblem underTest;
    protected String expectedMessage;
    protected int expectedNumber;

    @Test
    void itSolvesTheEulerProblem() {
        assertEquals(underTest.solve(), expectedMessage);
        assertEquals(underTest.getNumber(), expectedNumber);
    }

}
