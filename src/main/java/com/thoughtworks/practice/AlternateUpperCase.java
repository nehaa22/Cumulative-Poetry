package com.thoughtworks.practice;

class AlternateUpperCase implements Formatter {
    private int count = 0;
    int upperCount = 0;

    @Override
    public String format(String line) {
        StringBuilder result = new StringBuilder();
        upperCount++;
        count++;

        if (count == 1) {
            result.append("THIS IS ");
        }

        if (upperCount == 1 || upperCount % 2 != 0) {
            result.append(line.toUpperCase()).append("\n");
        } else {
            result.append(line).append("\n");
        }
        return result.toString();
    }
}
