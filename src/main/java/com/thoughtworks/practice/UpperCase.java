package com.thoughtworks.practice;

public class UpperCase implements Formatter{

    @Override
    public String format(String line) {
        StringBuilder result = new StringBuilder();
        result.append(line.toUpperCase()).append("\n");
        return result.toString();
    }
}
