package com.thoughtworks.practice;

import java.util.ArrayList;
import java.util.List;

public class CumulativePoetry {

    private List<String> poetry = new ArrayList<>();
    int echo;

    public CumulativePoetry(int echo) {
        this.echo = echo;

        poetry.add("the horse and the hound and the horn that belonged to");
        poetry.add("the farmer sowing his corn that kept");
        poetry.add("the rooster that crowed in the morn that woke");
        poetry.add("the priest all shaven and shorn that married");
        poetry.add("the man all tattered and torn that kissed");
        poetry.add("the maiden all forlorn that milked");
        poetry.add("that cow with the crumpled horn that tossed");
        poetry.add("the dog that worried");
        poetry.add("the cat that killed");
        poetry.add("the rat that ate");
        poetry.add("the malth that lay in");
        poetry.add("the house that Jack built");
    }

    public StringBuilder toUnfold(int revealForDay) {

        StringBuilder result = new StringBuilder();
        result.append("This is ");
        for (int i = poetry.size()-1; i >=poetry.size()-revealForDay; i--) {
            int count = 1;
            while (count <= echo) {
                result.append(poetry.get(i));
                result.append("\n");
                count++;
            }
        }
        return result;
    }
}
