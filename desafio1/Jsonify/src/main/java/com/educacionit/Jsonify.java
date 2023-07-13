package com.educacionit;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Jsonify {
    public static void main(String[] args) {

        List<String> changedArgsList = Arrays.stream(args)
                .map(arg -> String.format("\"%s\"", arg))
                .collect(Collectors.toList());
        String allArgs = String.join(",", changedArgsList);
        System.out.println(String.format("{\"data\":[%s]}", allArgs));
    }
}