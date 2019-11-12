package com.thoughtworks.practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CumulativePoetryTest {

    @Test
    void givenRevealForDayAsOne_WhenUnfold_ThenShouldReturnOneLine() {
        CumulativePoetry cumulativePoetry = new CumulativePoetry();
        assertEquals("This is the house that Jack built\n",cumulativePoetry.toUnfold(1).toString());
    }

    @Test
    void givenRevealForDayAsTwo_WhenUnfold_ThenShouldReturnTwoLine() {

        CumulativePoetry cumulativePoetry = new CumulativePoetry();
        assertEquals("This is the house that Jack built\nthe malth that lay in\n",cumulativePoetry.toUnfold(2).toString());
    }

    @Test
    void givenRevealForDayAsThree_WhenUnfold_ThenShouldReturnThreeLine() {

        CumulativePoetry cumulativePoetry = new CumulativePoetry();
        assertEquals("This is the house that Jack built\nthe malth that lay in\nthe rat that ate\n", cumulativePoetry.toUnfold(3).toString());
    }

    @Test
    void givenRevealForDayAsTwelve_WhenUnfold_ThenShouldReturnTwelveLine() {

        CumulativePoetry cumulativePoetry = new CumulativePoetry();
        assertEquals("This is the house that Jack built\nthe malth that lay in\nthe rat that ate\nthe cat that killed\nthe dog that worried\nthat cow with the crumpled horn that tossed\nthe maiden all forlorn that milked\nthe man all tattered and torn that kissed\nthe priest all shaven and shorn that married\nthe rooster that crowed in the morn that woke\nthe farmer sowing his corn that kept\nthe horse and the hound and the horn that belonged to\n",cumulativePoetry.toUnfold(12).toString());
    }

//    @Test
//    void givenRevealForDayAsTwoAndEchoAsThree_whenUnfold_ThenShouldReturnOneLineThreeTime() {
//
//        CumulativePoetry cumulativePoetry = new CumulativePoetry();
//        List poetry = cumulativePoetry.toUnfold(2, 3);
//        assertEquals(6, poetry.size());
//    }
//
//    @Test
//    void givenRevealForDayAsFourAndEchoAsFour_whenUnfold_ThenShouldReturnOneLineOneTime() {
//
//        CumulativePoetry cumulativePoetry = new CumulativePoetry();
//        List poetry = cumulativePoetry.toUnfold(4, 4);
//        assertEquals(16, poetry.size());
//    }
}