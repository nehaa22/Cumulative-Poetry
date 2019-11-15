package com.thoughtworks.practice;

class AlternateEcho implements Formatter {

    private int repeatNumber;

    AlternateEcho(int repeatNumber) {
        this.repeatNumber = repeatNumber;
    }

    private int count = 0;
    int echoCount = 0;

    @Override
    public String format(String line) {
        StringBuilder result = new StringBuilder();
        echoCount++;
        count++;
        if (count == 1) {
            result.append("This is ");
        }

        for (int i = repeatNumber; i > 0; i--) {
            if (echoCount == 1 || echoCount%2 !=0) {
                result.append(line).append("\n");
                break;
            }
                result.append(line).append("\n");
        }
        return result.toString();
    }
}
