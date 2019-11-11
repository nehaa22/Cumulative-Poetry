package com.thoughtworks.practice;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CumulativePoetryTest {

    @Test
    void givenRevealForDayAsOne_WhenUnfold_ThenShouldReturnOneLine() {

        CumulativePoetry cumulativePoetry = new CumulativePoetry();
        List poetry = cumulativePoetry.toUnfold(1, 1);
        assertEquals(1, poetry.size());
    }

    @Test
    void givenRevealForDayAsTwo_WhenUnfold_ThenShouldReturnTwoLine() {

        CumulativePoetry cumulativePoetry = new CumulativePoetry();
        List poetry = cumulativePoetry.toUnfold(2, 1);
        assertEquals(2, poetry.size());
    }

    @Test
    void givenRevealForDayAsThree_WhenUnfold_ThenShouldReturnThreeLine() {

        CumulativePoetry cumulativePoetry = new CumulativePoetry();
        List poetry = cumulativePoetry.toUnfold(3, 1);
        assertEquals(3, poetry.size());
    }

    @Test
    void givenRevealForDayAsTwelve_WhenUnfold_ThenShouldReturnTwelveLine() {

        CumulativePoetry cumulativePoetry = new CumulativePoetry();
        List poetry = cumulativePoetry.toUnfold(12, 1);
        assertEquals(12, poetry.size());
    }

    @Test
    void givenRevealForDayAsOneAndEchoAsThree_whenUnfold_ThenShouldReturnOneLineOneTime() {

        CumulativePoetry cumulativePoetry = new CumulativePoetry();
        List poetry = cumulativePoetry.toUnfold(2, 3);
        assertEquals(6, poetry.size());
    }

    @Test
    void givenRevealForDayAsFourAndEchoAsFour_whenUnfold_ThenShouldReturnOneLineOneTime() {

        CumulativePoetry cumulativePoetry = new CumulativePoetry();
        List poetry = cumulativePoetry.toUnfold(4, 4);
        assertEquals(16, poetry.size());
    }
}