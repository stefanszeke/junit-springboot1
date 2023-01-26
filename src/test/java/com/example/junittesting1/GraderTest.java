package com.example.junittesting1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class GraderTest {
    
    @Test
    @DisplayName("59 is an F")
    void gradeTest1() {
        Grader grader = new Grader();

        char result = grader.determineLetterGrade(59);
        char expected = 'F';

        assertEquals(result, expected);
    }

    @Test
    @DisplayName("Throws exception for 0")
    void gradeTest2() {
        Grader grader = new Grader();

        assertThrows(IllegalArgumentException.class, () -> grader.determineLetterGrade(-1));
    }


    
}

