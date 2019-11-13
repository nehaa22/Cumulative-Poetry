package com.thoughtworks.practice;

class Echo implements Formatter {

    private int repeatNumber;

    Echo(int repeatNumber) {
        this.repeatNumber = repeatNumber;
    }

    private int count = 0;

    @Override
    public String format(String line) {
        StringBuilder result = new StringBuilder();
        count++;
        if (count == 1) {
            result.append("This is ");
        }
        for (int i = repeatNumber; i > 0; i--) {
            result.append(line).append("\n");
        }
        return result.toString();
    }
}
