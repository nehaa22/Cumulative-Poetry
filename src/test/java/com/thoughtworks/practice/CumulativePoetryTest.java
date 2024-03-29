package com.thoughtworks.practice;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CumulativePoetryTest {

    @Nested
    class Unfold {

        @Test
        void givenRevealForDayAsOne_WhenUnfold_ThenShouldReturnOneLine() {

            CumulativePoetry cumulativePoetry = new CumulativePoetry(new Echo(1));
            assertEquals("This is the house that Jack built.", cumulativePoetry.toUnfold(1).toString());
        }

        @Test
        void givenRevealForDayAsTwo_WhenUnfold_ThenShouldReturnTwoLine() {

            CumulativePoetry cumulativePoetry = new CumulativePoetry(new Echo(1));
            assertEquals("This is the house that Jack built\nthe malth that lay in.", cumulativePoetry.toUnfold(2).toString());
        }

        @Test
        void givenRevealForDayAsThree_WhenUnfold_ThenShouldReturnThreeLine() {

            CumulativePoetry cumulativePoetry = new CumulativePoetry(new Echo(1));
            assertEquals("This is the house that Jack built\nthe malth that lay in\nthe rat that ate.", cumulativePoetry.toUnfold(3).toString());
        }

        @Test
        void givenRevealForDayAsTwelve_WhenUnfold_ThenShouldReturnTwelveLine() {

            CumulativePoetry cumulativePoetry = new CumulativePoetry(new Echo(1));
            assertEquals("This is the house that Jack built\nthe malth that lay in\nthe rat that ate\nthe cat that killed\nthe dog that worried\nthat cow with the crumpled horn that tossed\nthe maiden all forlorn that milked\nthe man all tattered and torn that kissed\nthe priest all shaven and shorn that married\nthe rooster that crowed in the morn that woke\nthe farmer sowing his corn that kept\nthe horse and the hound and the horn that belonged to.", cumulativePoetry.toUnfold(12).toString());
        }

    }

    @Nested
    class UnfoldByEcho {

        @Test
        void givenRevealForDayAsTwoAndEchoAsTh_whenUnfoldUsingEcho_ThenShouldReturnOneLineThreeTime() {

            CumulativePoetry cumulativePoetry = new CumulativePoetry(new Echo(2));
            assertEquals("This is the house that Jack built\nthe house that Jack built.", cumulativePoetry.toUnfold(1));
        }

        @Test
        void givenRevealForDayAsThreeAndEchoAsThree_whenUnfoldUsingEcho_ThenShouldReturnOneLineThreeTime() {

            CumulativePoetry cumulativePoetry = new CumulativePoetry(new Echo(3));
            assertEquals("This is the house that Jack built\nthe house that Jack built\nthe house that Jack built\nthe malth that lay in\nthe malth that lay in\nthe malth that lay in\nthe rat that ate\nthe rat that ate\nthe rat that ate.", cumulativePoetry.toUnfold(3).toString());
        }

        @Test
        void givenRevealForDayAsFourAndEchoAsThree_whenUnfoldUsingEcho_ThenShouldReturnOneLineThreeTime() {

            CumulativePoetry cumulativePoetry = new CumulativePoetry(new Echo(3));
            assertEquals("This is the house that Jack built\nthe house that Jack built\nthe house that Jack built\nthe malth that lay in\nthe malth that lay in\nthe malth that lay in\nthe rat that ate\nthe rat that ate\nthe rat that ate\nthe cat that killed\nthe cat that killed\nthe cat that killed.", cumulativePoetry.toUnfold(4).toString());
        }

        @Test
        void givenRevealForDayAsOneAndEchoAsFive_whenUnfoldUsingEcho_ThenShouldReturnOneLineThreeTime() {

            CumulativePoetry cumulativePoetry = new CumulativePoetry(new Echo(5));
            assertEquals("This is the house that Jack built\nthe house that Jack built\nthe house that Jack built\nthe house that Jack built\nthe house that Jack built.", cumulativePoetry.toUnfold(1).toString());
        }
    }

    @Nested
    class UnfoldByUpperCase {

        @Test
        void givenRevealForDayAsTwo_WhenUnfoldUsingUppercase_ThenShouldReturnResult() {

            CumulativePoetry cumulativePoetry = new CumulativePoetry(new UpperCase());
            assertEquals("THIS IS THE HOUSE THAT JACK BUILT\nTHE MALTH THAT LAY IN.", cumulativePoetry.toUnfold(2));
        }

        @Test
        void givenRevealForDayAsThree_WhenUnfoldUsingUppercase_ThenShouldReturnResult() {

            CumulativePoetry cumulativePoetry = new CumulativePoetry(new UpperCase());
            assertEquals("THIS IS THE HOUSE THAT JACK BUILT\nTHE MALTH THAT LAY IN\nTHE RAT THAT ATE.", cumulativePoetry.toUnfold(3));
        }

        @Test
        void givenRevealForDayAsFour_WhenUnfoldUsingUppercase_ThenShouldReturnResult() {

            CumulativePoetry cumulativePoetry = new CumulativePoetry(new UpperCase());
            assertEquals("THIS IS THE HOUSE THAT JACK BUILT\nTHE MALTH THAT LAY IN\nTHE RAT THAT ATE\nTHE CAT THAT KILLED.", cumulativePoetry.toUnfold(4));
        }

        @Test
        void givenRevealForDayAsFive_WhenUnfoldUsingUppercase_ThenShouldReturnResult() {

            CumulativePoetry cumulativePoetry = new CumulativePoetry(new UpperCase());
            assertEquals("THIS IS THE HOUSE THAT JACK BUILT\nTHE MALTH THAT LAY IN\nTHE RAT THAT ATE\nTHE CAT THAT KILLED\nTHE DOG THAT WORRIED.", cumulativePoetry.toUnfold(5));
        }
    }

    @Nested
    class UnfoldByEchoAndUpperCase {


        @Test
        void givenRevealForDayTwoAndEchoAsTwo_WhenUnfoldUsingEchoAndUpperCase_ThenShouldReturnResult() {

            DualFormatter dualFormatter = new DualFormatter(new Echo(2), new UpperCase());
            CumulativePoetry cumulativePoetryU = new CumulativePoetry(dualFormatter);
            assertEquals("THIS IS THE HOUSE THAT JACK BUILT\nTHE HOUSE THAT JACK BUILT\nTHE MALTH THAT LAY IN\nTHE MALTH THAT LAY IN.", cumulativePoetryU.toUnfold(2));

        }

        @Test
        void givenRevealForDayTwoAndEchoAsFour_WhenUnfoldUsingEchoAndUpperCase_ThenShouldReturnResult() {

            DualFormatter dualFormatter = new DualFormatter(new Echo(4), new UpperCase());
            CumulativePoetry cumulativePoetryU = new CumulativePoetry(dualFormatter);
            assertEquals("THIS IS THE HOUSE THAT JACK BUILT\nTHE HOUSE THAT JACK BUILT\nTHE HOUSE THAT JACK BUILT\nTHE HOUSE THAT JACK BUILT\nTHE MALTH THAT LAY IN\nTHE MALTH THAT LAY IN\nTHE MALTH THAT LAY IN\nTHE MALTH THAT LAY IN.", cumulativePoetryU.toUnfold(2));

        }

        @Test
        void givenRevealForDayOneAndEchoAsFive_WhenUnfoldUsingEchoAndUpperCase_ThenShouldReturnResult() {

            DualFormatter dualFormatter = new DualFormatter(new Echo(5), new UpperCase());
            CumulativePoetry cumulativePoetryU = new CumulativePoetry(dualFormatter);
            assertEquals("THIS IS THE HOUSE THAT JACK BUILT\nTHE HOUSE THAT JACK BUILT\nTHE HOUSE THAT JACK BUILT\nTHE HOUSE THAT JACK BUILT\nTHE HOUSE THAT JACK BUILT.", cumulativePoetryU.toUnfold(1));

        }

        @Test
        void givenRevealForDayThreeAndEchoAsTwo_WhenUnfoldUsingEchoAndUpperCase_ThenShouldReturnResult() {

            DualFormatter dualFormatter = new DualFormatter(new Echo(2), new UpperCase());
            CumulativePoetry cumulativePoetry = new CumulativePoetry(dualFormatter);
            assertEquals("THIS IS THE HOUSE THAT JACK BUILT\nTHE HOUSE THAT JACK BUILT\nTHE MALTH THAT LAY IN\nTHE MALTH THAT LAY IN\nTHE RAT THAT ATE\nTHE RAT THAT ATE.", cumulativePoetry.toUnfold(3));

        }
    }

    @Nested
    class unFoldByAlternateEcho {

        @Test
        void givenRevealDayThreeAndEchoTwo_WhenUnfoldUsingAlternateEcho_ThenShouldReturnResult() {
            CumulativePoetry cumulativePoetry = new CumulativePoetry(new AlternateEcho(2));
            assertEquals("This is the house that Jack built\nthe malth that lay in\nthe malth that lay in\nthe rat that ate.", cumulativePoetry.toUnfold(3));

        }

        @Test
        void givenRevealDayFiveAndEchoTwo_WhenUnfoldUsingAlternateEcho_ThenShouldReturnResult() {
            CumulativePoetry cumulativePoetry = new CumulativePoetry(new AlternateEcho(2));
            assertEquals("This is the house that Jack built\nthe malth that lay in\nthe malth that lay in\nthe rat that ate\nthe cat that killed\nthe cat that killed\nthe dog that worried.", cumulativePoetry.toUnfold(5));

        }

        @Test
        void givenRevealDayFiveAndEchoOne_WhenUnfoldUsingAlternateEcho_ThenShouldReturnResult() {
            CumulativePoetry cumulativePoetry = new CumulativePoetry(new AlternateEcho(1));
            assertEquals("This is the house that Jack built\nthe malth that lay in\nthe rat that ate\nthe cat that killed\nthe dog that worried.", cumulativePoetry.toUnfold(5));

        }
    }

    @Nested
        class unFoldByAlternateUpperCase {

        @Test
        void givenRevealDayFive_WhenUnfoldUsingAlternateUpperCase_ThenShouldReturnResult(){
            CumulativePoetry cumulativePoetry = new CumulativePoetry(new AlternateUpperCase() );
            assertEquals("THIS IS THE HOUSE THAT JACK BUILT\nthe malth that lay in.",cumulativePoetry.toUnfold(2));

        }

        @Test
        void givenRevealDayTwo_WhenUnfoldUsingAlternateUpperCase_ThenShouldReturnResult(){
            CumulativePoetry cumulativePoetry = new CumulativePoetry(new AlternateUpperCase() );
            assertEquals("THIS IS THE HOUSE THAT JACK BUILT\nthe malth that lay in\nTHE RAT THAT ATE\nthe cat that killed\nTHE DOG THAT WORRIED.",cumulativePoetry.toUnfold(5));

        }

        @Test
        void givenRevealDayFour_WhenUnfoldUsingAlternateUpperCase_ThenShouldReturnResult(){
            CumulativePoetry cumulativePoetry = new CumulativePoetry(new AlternateUpperCase() );
            assertEquals("THIS IS THE HOUSE THAT JACK BUILT\nthe malth that lay in\nTHE RAT THAT ATE\nthe cat that killed.",cumulativePoetry.toUnfold(4));

        }
    }

}