package com.company;

import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        String string = "Java forever! Java rules!";


        while (true) {
            System.out.print("Введите какое задание вы хотите посмотреть: ");
            int taskNumber = in.nextInt();
            switch (taskNumber) {
                case 0 -> taskFromVideo(string);
                case 1 -> first(string);
                case 2 -> second(string);
                case 3 -> third(string);
                case 4 -> fourth(string);
                case 5 -> fifth(string);
                case 6 -> sixth();
                case 7 -> seventh();
                case 8 -> eighth(string);
                case 9 -> ninth();
                case 10 -> tenth();
                case 11 -> eleventh();
                default -> System.out.println("Такого задания нет!");
            }
            System.out.print("\nВыход? ");
            String exit = in.next().toLowerCase();
            if (exit.equals("да") || exit.equals("yes") || exit.equals("так") || exit.equals("y")) {
                break;
            }
        }

    }

    // Вывести индексы всех "а" в строке из видео
    public static void taskFromVideo(String str) {
        System.out.print("Введите символ индекс которого вы хотите найти: ");
        String searchElement = in.next();
//        String str = "Java forever! Java rules!";
//        String searchElement = "a";
        int index = str.indexOf(searchElement);
        while (index > -1) {
            System.out.print(index + " ");
            index = str.indexOf(searchElement, index + 1);
        }
    }


    //- зробити великими перші букви у кожному слові тексту,
    public static void first(String str) {
//        String str = "Java forever! Java rules!";
        String[] arrayStr = str.split("");
        for (int i = 0; i < arrayStr.length; i++) {
            if (arrayStr[i].equals(" ")) {
                arrayStr[i + 1] = arrayStr[i + 1].toUpperCase();
            }
        }
//        System.out.print((Arrays.toString(arrayStr)) + "\n"); // вывод массива
        String resultString = String.join("", arrayStr); // преобразование массива в строку
        System.out.print(resultString);
    }


    //- в тексті слова заданої довжини заміниті вказаним підрядком довільної довжини,
    public static void second(String str) {
//        String str = "Java forever! Java rules!";
        String[] arrStr = str.split(" ");
        int length = 4;
        System.out.println(Arrays.toString(arrStr));
        String replacementWord = "Python";

        for (int i = 0; i < arrStr.length; i++) {
            if (arrStr[i].length() == length) {
                arrStr[i] = replacementWord;
            }
        }

//        System.out.println(Arrays.toString(arrStr));
        String strResult = String.join(" ", arrStr);
        System.out.println(strResult);

    }


    //- після кожного слова тексту, що закінчується заданим під¬рядком, вставити вказане слово,
    public static void third(String str) {
//        String str = "Java forever! Java rules!";
        String[] arrayStr = str.split(" ");
        ArrayList list = new ArrayList();
        String searchWorld = "va", addedWord = "капец";

        for (String element : arrayStr) {
            list.add(element);
            if (element.endsWith(searchWorld)) {
                list.add(addedWord);
            }
        }
//        System.out.println(list);

        String strResult = String.join(" ", list);
        System.out.println(strResult);
    }


    //- в тексті до кожного слова з довжиною, більшою за k символів, вставити заданий підрядок після k-го символу,
    public static void fourth(String str) {
//        String str = "Java Forever! Java Rules!";

        String[] words = str.split(" ");
        String addedWord = "WORD";
        int k = 4;
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > k) {
                words[i] = words[i].substring(0, k) + addedWord +
                        words[i].substring(k);
            }
        }
        String strResult = String.join(" ", words);
        System.out.println(strResult);
    }


    //- в кожному реченні тексту поміняти місцями перше слово з останнім (припускаємо, що всі речення закінчуються тільки крапкою).
    public static void fifth(String str) {
//        String str = "Java forever! Java rules!";

        String[] arrayStr = str.split("!"); // точки нет поэтому поставил !
        String resultStr = "";

        for (String element : arrayStr) {
            String[] arrayWord = element.trim().split(" "); // trim пробелы убирает с начала и конца


            String buf = arrayWord[0];
            arrayWord[0] = arrayWord[arrayWord.length - 1];
            arrayWord[arrayWord.length - 1] = buf;

            for (String word : arrayWord) {
                resultStr += (word.equals(arrayWord[arrayWord.length - 1]) ? " " : "") + word;
            }
            resultStr += ".";

        }
        System.out.println(resultStr);

    }


    //- дано текст та масив ключових слів; утворити масив З КІЛЬКОСТІ повторів в тексті кожного ключового
    // слова,
    public static void sixth() {
        String text = "дано текст та масив ключових слів; утворити масив З КІЛЬКОСТІ повторів в тексті кожного ключового слова ";
        String[] arrKeywords = {"масив", "текст", "дано"};
        String[] arrText = text.split(" ");
        int[] countOfWords = new int[arrKeywords.length];
        int index = 0;

        for (String elKeywords : arrKeywords) {
            for (String element : arrText) {
                if (element.equals(elKeywords)) {
                    countOfWords[index]++;
                }
            }
            index++;
        }
        System.out.println(Arrays.toString(arrKeywords));
        System.out.println(Arrays.toString(countOfWords));
    }


    //- утворити колекцію зі слів тексту, в яких перша і остання букви співпадають,
    public static void seventh() {

        String str = "Javaj Pythonp python java";
        String[] arrayStr = str.toLowerCase().split(" ");
        ArrayList result = new ArrayList();

        for (String element : arrayStr) {
            String[] temp = element.split("");
            if (temp[0].equals(temp[temp.length - 1])) {
                result.add(element);

            }
        }
        System.out.println(result);
    }


    //- утворити дві колекції зі слів тексту максимальної та слів мінімальної довжини,
    public static void eighth(String str) {
//        String str = "Java forever! Java rules!";
        String[] arrayStr = str.split(" ");
        ArrayList minLength = new ArrayList();
        ArrayList maxLength = new ArrayList();
        int bufIntMin = Integer.MAX_VALUE, bufIntMax = Integer.MIN_VALUE;
        for (String element : arrayStr) {
            bufIntMax = Math.max(element.length(), bufIntMax);
            bufIntMin = Math.min(element.length(), bufIntMin);
        }
        for (String element : arrayStr) {
            if (element.length() >= bufIntMax) {
                maxLength.add(element);
            }
            if (element.length() <= bufIntMin) {
                minLength.add(element);

            }
        }
        System.out.println(Arrays.toString(arrayStr));
        System.out.println("Слова с минимальным количеством символов: " + minLength);
        System.out.println("----------");
        System.out.println("Слова с максимальным количеством символов: " + maxLength);
    }


    //- масив розділити на дві колекції з від’ємних та додатніх чисел,
    public static void ninth() {
        int[] arrayInt = {1, 2, 3, 4, 5, -1, -2, -3, -4, -5};
        ArrayList positive = new ArrayList(), negative = new ArrayList();
        for (int element : arrayInt) {
            if (element < 0) {
                negative.add(element);
            } else {
                positive.add(element);
            }
        }
        System.out.println(positive);
        System.out.println(negative);
    }


    //- з масиву видалити дублікати максимума та мінімума (уточнення:
    // видалити саме дублікати, тобто перші значення максимума та мінімума необхідно залишити).
    public static void tenth() {
        int[] arrayInt = {1, 2, 3, 4, 5, -5, 5, -1, -2, -3, -4, 5, 5, -5};
        int minElement = Integer.MAX_VALUE;
        int maxElement = Integer.MIN_VALUE;
        int maxIndex = 0, minIndex = 0;

        for (int i = 0; i < arrayInt.length; i++) {
            if (maxElement < arrayInt[i]) {
                maxIndex = i;
                maxElement = arrayInt[i];

            }
            if (minElement > arrayInt[i]) {
                minIndex = i;
                minElement = arrayInt[i];

            }
        }
        System.out.println("Старый массив: " + Arrays.toString(arrayInt));

        ArrayList resultArr = new ArrayList();

        for (int element : arrayInt) {
            if (element != maxElement && element != minElement) {
                resultArr.add(element);
            }
        }
        resultArr.add(maxIndex, maxElement);
        resultArr.add(minIndex, minElement);

        System.out.println("Новый массив: " + resultArr);
    }


    //- визначити середні арифметичні двох масивів, утворити колекцію з елементів обидвох масивів, що знаходяться в межах між значеннями середніх арифметичних.
    public static void eleventh() {
        int[] arr1 = {7, 8, 9};
        int[] arr2 = {1, 2, 5, 6, 4, 5, 8, 9, 7,};
        double average1 = 0, average2 = 0;


        for (int element : arr1) {
            average1 += element;
        }
        for (int element : arr2) {
            average2 += element;
        }

        average1 /= arr1.length;
        average2 /= arr2.length;

        int[] tempArray = new int[arr1.length + arr2.length];
        int count = 0;

        for (int i = 0; i < arr1.length; i++) {
            tempArray[i] = arr1[i];
            count++;
        }

        for (int element : arr2) {
            tempArray[count++] = element;
        }

        System.out.println(Arrays.toString(tempArray));

        double maxAvg = Math.max(average1, average2);
        double minAvg = Math.min(average1, average2);

        ArrayList result = new ArrayList();

        for (int element : tempArray) {
            if (element < maxAvg && element > minAvg) {
                result.add(element);
            }
        }

        System.out.println(result);
    }
}


