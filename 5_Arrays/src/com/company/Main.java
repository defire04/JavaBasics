package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int[] arrayForTheFirstThreeTasks = {1, 2, 3, 4, 5, 6, -1, -2, -3, -4, -5, -6};
        int[] arrayForTheFourthAndFifth = {1, 2, 3, 4, 5, 6, -1, -2, -3, -4, -5, -6}; // два одинаковых массива из-за того что 3 задание перезаписывает существующий массив и последующие задания работают с изменным масивом
        int[] arrayForSixth = {3, 6, 2, 5, 4, 7, 8};

        while (true) {
            System.out.print("Введите какое задание вы хотите посмотреть: ");
            int taskNumber = in.nextInt();
            switch (taskNumber) {
                case 1 -> first(arrayForTheFirstThreeTasks);
                case 2 -> second(arrayForTheFirstThreeTasks);
                case 3 -> third(arrayForTheFirstThreeTasks);
                case 4 -> fourth(arrayForTheFourthAndFifth);
                case 5 -> fifth(arrayForTheFourthAndFifth);
                case 6 -> sixth(arrayForSixth);
                default -> System.out.println("Такого задания нет!");
            }
            System.out.print("\nВыход? ");
            String exit = in.next().toLowerCase();
            if (exit.equals("да") || exit.equals("yes") || exit.equals("так") || exit.equals("y")) {
                break;
            }
        }
    }

    //- порахувати кількість та суму парних елементів масиву,
    public static void first(int[] arr) {
        System.out.println("Задание №1\n");
        int sumArr = 0, counter = 0;
        for (int element : arr) {
            if (element % 2 == 0) {
                sumArr += element;
                counter++;
            }
        }
        System.out.println("Сумма парных элементов массива = " + sumArr); // ноль, потому что массив такой ввел
        System.out.println("Количество парных элементов массива = " + counter);
    }


    //- визначити максимальний з від’ємних та мінімальний з додатніх елементів масиву,
    public static void second(int[] arr) {
        System.out.println("Задание №2\n");
        int maxNegative = Integer.MIN_VALUE;
        int minPositive = arr[0];
        for (int element : arr) {
            if (element > 0) {
                if (element < minPositive) {
                    minPositive = element;
                }
            } else {
                if (element > maxNegative) {
                    maxNegative = element;
                }
            }
        }

        System.out.println("Минимальное позитивное число: " + minPositive);
        System.out.println("Максимальное негативное число: " + maxNegative);
    }


    //- збільшити на одиницю додатні елементи масиву та зменшити на одиницю від’ємні елементи масиву із утворенням нового масиву,
    public static void third(int[] arr) {
        System.out.println("Задание №3\n");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] > 0 ? arr[i] + 1 : arr[i] - 1;
        }
        System.out.println(Arrays.toString(arr));
    }


    //- в масиві поміняти місцями максимум та мінімум із утворенням нового масиву,
    public static void fourth(int[] arr) {
        System.out.println("Задание №4\n");
        int minElement = arr[0];
        int maxElement = Integer.MIN_VALUE;
        int maxIndex = 0, minIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (maxElement < arr[i]) {
                maxIndex = i;
                maxElement = arr[i];
            }
            if (minElement > arr[i]) {
                minIndex = i;
                minElement = arr[i];
            }
        }
        int temp = arr[minIndex];
        arr[minIndex] = arr[maxIndex];
        arr[maxIndex] = temp;
        System.out.println(Arrays.toString(arr));
    }


    //- в масиві усунути максимум та мінімум із утворенням нового масиву,
    public static void fifth(int[] arr) {
        System.out.println("Задание №5\n");
        int minElement =  Integer.MAX_VALUE;
        int maxElement = Integer.MIN_VALUE;
        int maxIndex = 0, minIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (maxElement < arr[i]) {
                maxIndex = i;
                maxElement = arr[i];
            }
            if (minElement > arr[i]) {
                minIndex = i;
                minElement = arr[i];
            }
        }
        int[] newArr = new int[arr.length - 2];
        int indexRes = 0; // index for result array

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != maxElement & arr[i] != minElement) {
                newArr[indexRes] = arr[i];
                indexRes++;
            }
        }
        System.out.println(Arrays.toString(newArr));

        /*Удаление элементов с помощью arraycopy */
        /* Удаление максимального числа */

//        arraycopy(Массив, Индекс с которого начинается копирование, В какой массив копировать,
//        С какого индекса вставлять в новый массив, Количество елементов которые нужно скопировать)

//      Я копирую до индекса макс числа потом пропускаю это число и копирую следущую часть массива

     /*
        int[] newArr = new int[arr.length - 1];
        System.arraycopy(arr, 0, newArr, 0, maxIndex);
        System.arraycopy(arr, maxIndex + 1, newArr, maxIndex, arr.length - (maxIndex + 1));

        minIndex = minIndex + 1 > newArr.length ? minIndex - 1 : minIndex; // проверка если минимальное число последнее
//         Удаление минимального числа
        int[] resultArr = new int[newArr.length - 1];
        System.arraycopy(newArr, 0, resultArr, 0, minIndex);
        System.arraycopy(newArr, minIndex + 1, resultArr, minIndex, newArr.length - (minIndex + 1));
        System.out.println(Arrays.toString(resultArr));
       */
    }


    //- визначити середнє арифметичне елементів масиву та кількість елементів цього масиву, що є більшими за середнє арифметичне.
    public static void sixth(int[] arr) {
        int sum = 0, average = 0;
        System.out.println("Задание №6\n");
        for (int element : arr) {
            sum += element;
            average = sum / arr.length;
        }

        int elementCountIsLessThanAverage = 0;
        for (int element : arr) {
            if (element >= average) {
                elementCountIsLessThanAverage++;
            }
        }

        int[] resultArr = new int [arr.length - elementCountIsLessThanAverage];
        int indexNewArr = 0;
        for(int element : arr){
            if (element > average){
                resultArr[indexNewArr++] = element;
            }
        }

        System.out.println(Arrays.toString(resultArr));
    }

}




