package com.thoughtworks.practice;

public class UpperCase implements Formatter{

    private int count;

    @Override
    public String format(String line) {
        StringBuilder result = new StringBuilder();

        count++;
        if(count==1){
            result.append("THIS IS ");
        }
        result.append(line.toUpperCase()).append("\n");
        return result.toString();
    }
}
