package com.thoughtworks.practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CumulativePoetryTest {

    @Test
    void givenRevealForDayAsOne_WhenUnfold_ThenShouldReturnOneLine() {
        CumulativePoetry cumulativePoetry = new CumulativePoetry(1);
        assertEquals("This is the house that Jack built.",cumulativePoetry.toUnfold(1).toString());
    }

    @Test
    void givenRevealForDayAsTwo_WhenUnfold_ThenShouldReturnTwoLine() {

        CumulativePoetry cumulativePoetry = new CumulativePoetry(1);
        assertEquals("This is the house that Jack built\nthe malth that lay in.",cumulativePoetry.toUnfold(2).toString());
    }

    @Test
    void givenRevealForDayAsThree_WhenUnfold_ThenShouldReturnThreeLine() {

        CumulativePoetry cumulativePoetry = new CumulativePoetry(1);
        assertEquals("This is the house that Jack built\nthe malth that lay in\nthe rat that ate.", cumulativePoetry.toUnfold(3).toString());
    }

    @Test
    void givenRevealForDayAsTwelve_WhenUnfold_ThenShouldReturnTwelveLine() {

        CumulativePoetry cumulativePoetry = new CumulativePoetry(1);
        assertEquals("This is the house that Jack built\nthe malth that lay in\nthe rat that ate\nthe cat that killed\nthe dog that worried\nthat cow with the crumpled horn that tossed\nthe maiden all forlorn that milked\nthe man all tattered and torn that kissed\nthe priest all shaven and shorn that married\nthe rooster that crowed in the morn that woke\nthe farmer sowing his corn that kept\nthe horse and the hound and the horn that belonged to.",cumulativePoetry.toUnfold(12).toString());
    }

    @Test
    void givenRevealForDayAsTwoAndEchoAsTh_whenUnfold_ThenShouldReturnOneLineThreeTime() {

        CumulativePoetry cumulativePoetry = new CumulativePoetry(2);
        assertEquals("This is the house that Jack built\nthe house that Jack built.",cumulativePoetry.toUnfold(1).toString());
    }

    @Test
    void givenRevealForDayAsThreeAndEchoAsThree_whenUnfold_ThenShouldReturnOneLineThreeTime() {

        CumulativePoetry cumulativePoetry = new CumulativePoetry(3);
        assertEquals("This is the house that Jack built\nthe house that Jack built\nthe house that Jack built\nthe malth that lay in\nthe malth that lay in\nthe malth that lay in\nthe rat that ate\nthe rat that ate\nthe rat that ate.",cumulativePoetry.toUnfold(3).toString());
    }
}