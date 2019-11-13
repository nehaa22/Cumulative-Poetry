package com.thoughtworks.practice;

class Echo implements Formatter{

    protected int repeatNumber;

    Echo(int repeatNumber) {
        this.repeatNumber = repeatNumber;
    }
    @Override
    public String format(String line) {
        StringBuilder result = new StringBuilder();
        for (int i = repeatNumber; i > 0; i--) {
            result.append(line).append("\n");
        }
        return result.toString();
    }

}
