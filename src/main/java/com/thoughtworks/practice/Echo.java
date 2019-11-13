package com.thoughtworks.practice;

class Echo {

    private int repeatNumber;

    Echo(int repeatNumber) {
        this.repeatNumber = repeatNumber;
    }

    String toUnfoldByEcho(String line) {
        StringBuilder result = new StringBuilder();
        for (int i = repeatNumber; i > 0; i--) {
            result.append(line).append("\n");
        }
        return result.toString();
    }
}
