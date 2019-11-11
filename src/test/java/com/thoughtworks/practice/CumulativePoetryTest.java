package com.thoughtworks.practice;

import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.List;

public class CumulativePoetryTest {

    public void givenRevealForDayAsOne_WhenUnfold_ThenShouldReturnOneLine(){

        CumulativePoetry cumulativePoetry = new CumulativePoetry(1);
        List poetry = new ArrayList<>();
        String line =cumulativePoetry.toUnfold();
        poetry.add(line);
        Assertions.assertEquals(1,poetry.size());
    }
}