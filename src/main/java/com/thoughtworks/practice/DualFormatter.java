package com.thoughtworks.practice;

public class DualFormatter implements Formatter {

    private Echo echo;
    private UpperCase upperCase;
    private int count;

    public DualFormatter(Echo echo, UpperCase upperCase) {
        this.echo = echo;
        this.upperCase = upperCase;
    }

    @Override
    public String format(String line) {
        count++;
        StringBuilder result1 = new StringBuilder();
        StringBuilder result2 = new StringBuilder();
        result1.append(echo.format(line));
        if (count == 1) {
            result1.replace(0, 7, "");
        }
        result2.append(upperCase.format(result1.toString().trim()));
        return result2.toString();
    }
}
