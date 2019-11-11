package com.thoughtworks.practice;

import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.List;

public class CumulativePoetryTest {

    public void givenRevealForDayAsOne_WhenUnfold_ThenShouldReturnOneLine(){

        CumulativePoetry cumulativePoetry = new CumulativePoetry();
        List poetry =cumulativePoetry.toUnfold(1);
        Assertions.assertEquals(1,poetry.size());
    }

    public void givenRevealForDayAsTwo_WhenUnfold_ThenShouldReturnTwoLine(){

        CumulativePoetry cumulativePoetry = new CumulativePoetry();
        List poetry = new ArrayList();
        List line =cumulativePoetry.toUnfold(2);
        poetry.add(line);
        Assertions.assertEquals(2,poetry.size());
    }
}