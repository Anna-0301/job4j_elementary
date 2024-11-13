package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        String result = "";
        char symbol = input.charAt(0);
        int counter = 1;
        for (int index = 1; index <= input.length() - 1; index++) {
            if (symbol == input.charAt(index)) {
                counter++;
            } else {
                result = result + symbol + (counter > 1 ? counter : "");
                symbol = input.charAt(index);
                counter = 1;
            }
        }
        return result + symbol + (counter > 1 ? counter : "");
    }
}

