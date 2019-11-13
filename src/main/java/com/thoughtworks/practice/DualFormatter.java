package com.thoughtworks.practice;

public class DualFormatter implements Formatter {

    private Echo echo;
    private UpperCase upperCase;

    public DualFormatter(Echo echo, UpperCase upperCase) {
        this.echo = echo;
        this.upperCase = upperCase;
    }

    @Override
    public String format(String line) {
        StringBuilder result1 = new StringBuilder();
        StringBuilder result2=new StringBuilder();
        result1.append(upperCase.format(line));
        result2.append(echo.format(result1.toString().trim()));
        return result2.toString();
    }
}
