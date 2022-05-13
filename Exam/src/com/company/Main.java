package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {

        System.out.println("------------------------ Задание 1 --------------------------");
        //1.Написати програму для визначення кількості пар (a, b) натуральних чисел,
        // менших 200, таких, що сума a*a + b*b ділиться на 49?

        int limitNaturalNumber = 201;
        int count = 0;
        for (int a = 1; a < limitNaturalNumber; a++) {
            for (int b = 1; b < limitNaturalNumber; b++) {
                if ((a * a + b * b) % 49 == 0) {   // Не использовал Math.pow(a, 2) потому что так быстрее =)
                    count++;
                }
            }
        }
        System.out.print("\nСуществует " + count + " пар чисел которые делятся нацело на 49\n");


        System.out.println("------------------------ Задание 2 --------------------------\n");
        // 2. Утворити дві колекції зі слів тексту максимальної та слів мінімальної
        //довжини,

        Scanner in = new Scanner(System.in);
        String[] introductoryText = in.nextLine().split(" ");

        Function<String[], List<List<String>>> searchMinAndMaxLengthOfWords = text -> {
            List<String> maximumLengthOfWords = new ArrayList<>();
            List<String> minimumLengthOfWords = new ArrayList<>();
            List<List<String>> result = new ArrayList<>();

            int minLength = Integer.MAX_VALUE;
            int maxLength = Integer.MIN_VALUE;

            for (String wordsInArray : text) {
                if (wordsInArray.length() < minLength) {
                    minLength = wordsInArray.length();
                }
                if (wordsInArray.length() > maxLength) {
                    maxLength = wordsInArray.length();
                }
            }

            for (String words : text) {
                if (words.length() == maxLength) {
                    maximumLengthOfWords.add(words);
                }
                if (words.length() == minLength) {
                    minimumLengthOfWords.add(words);
                }
            }

            result.add(minimumLengthOfWords);
            result.add(maximumLengthOfWords);

            return result;
        };

        System.out.println(searchMinAndMaxLengthOfWords.apply(introductoryText));
        in.close();
    }
}
