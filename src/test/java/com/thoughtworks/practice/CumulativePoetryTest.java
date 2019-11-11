package com.thoughtworks.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CumulativePoetryTest {

    @Test
    public void givenRevealForDayAsOne_WhenUnfold_ThenShouldReturnOneLine(){

        CumulativePoetry cumulativePoetry = new CumulativePoetry();
        List poetry =cumulativePoetry.toUnfold(1, 1);
        assertEquals(1,poetry.size());
    }

    @Test
    public void givenRevealForDayAsTwo_WhenUnfold_ThenShouldReturnTwoLine(){

        CumulativePoetry cumulativePoetry = new CumulativePoetry();
        List poetry =cumulativePoetry.toUnfold(2, 1);
        assertEquals(2,poetry.size());
    }

    @Test
    public void givenRevealForDayAsThree_WhenUnfold_ThenShouldReturnThreeLine(){

        CumulativePoetry cumulativePoetry = new CumulativePoetry();
        List poetry = cumulativePoetry.toUnfold(3, 1);
        assertEquals(3,poetry.size());
    }

    @Test
    public void givenRevealForDayAsTwelve_WhenUnfold_ThenShouldReturnTwelveLine(){

        CumulativePoetry cumulativePoetry = new CumulativePoetry();
        List poetry = cumulativePoetry.toUnfold(12, 1);
        assertEquals(12,poetry.size());
    }

    @Test
    public void givenRevealForDayAsOneAndEchoAs_whenUnfold_ThenShouldReturnOneLineOneTime(){

        CumulativePoetry cumulativePoetry = new CumulativePoetry();
        List poetry = cumulativePoetry.toUnfold(2,3);
        assertEquals(6,poetry.size());
    }
}