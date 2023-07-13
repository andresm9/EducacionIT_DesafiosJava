package com.educacionit;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Jsonify {
    public static void main(String[] args) {

        List<String> changedArgsList = Arrays.stream(args)
                .map(arg -> String.format("\"%s\"", arg))
                .collect(Collectors.toList());
        String allArgs = String.join(",", changedArgsList);
        System.out.println(String.format("{\"data\":[%s]}", allArgs));
    }
}