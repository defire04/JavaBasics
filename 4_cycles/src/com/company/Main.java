package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            System.out.print("Введите какое задание вы хотите посмотреть: ");
            int taskNumber = in.nextInt();
            switch (taskNumber) {
                case 1 -> {
                    classroomSecond();
                    classroomThird();
                    System.out.println("\nЗадания номеруются так же как и были заданы.\n");
                    continue;
                }
                case 2 -> second();
                case 3 -> third();
                case 4 -> fourth();
                case 5 -> fifth();
                case 6 -> sixth();
                case 7 -> seventh();
                case 8 -> eighth();
                case 9 -> ninth();
                case 10 -> tenth();
                case 11 -> eleventh();
                case 12 -> additionalFirst();
                case 13 -> additionalSecond();
                case 14 -> additionalThird();
                case 15 -> additionalFourth();
                case 16 -> additionalFifth();
                default -> System.out.println("Такого задания нет!");
            }
            System.out.println("\nВыход?");
            String exit = in.next().toLowerCase();
            if (exit.equals("да") || exit.equals("yes") || exit.equals("так") || exit.equals("y")) {
                break;
            }
        }
    }

    // Прошлое 2 задание с классрума
    // 2. Запишіть усі числа, які є дільниками кожного із чисел:
    // 1) 15 і 18; 2) 40 і 60; 3) 12 і 24; 4) 16 і 21.
    public static void classroomSecond() {
        System.out.println("-------------Прошлое 2 задание с классрума-------------");

        System.out.print("Введите первое число делитель которого вы хотите узнать: ");
        int number1 = in.nextInt();

        System.out.print("Введите второе число делитель которого вы хотите узнать: ");
        int number2 = in.nextInt();

        int count = 0;
        for (int i = 1; i < (number1 > number2 ? number1 + 1 : number2 + 1); i++) {  // +1 чтобы не терять в скорости и не писать <=
            if (number1 % i == 0 || number2 % i == 0) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println();
        System.out.print("Количество делителей этих чисел: " + count);
        System.out.println();
    }

    // Прошлое 3 задание с классрума
    // 3. Запишіть яке-небудь число, що є кратним кожного із чисел:
    // 1)2 і 3; 2) 4 і 12; 3)6 і 9.
    public static void classroomThird() {
        System.out.println("-------------Прошлое 3 задание с классрума-------------");

        System.out.print("Введите первое число: ");
        int number1 = in.nextInt();

        System.out.print("Введите второе число : ");
        int number2 = in.nextInt();

        for (int i = 1; i < (number1 * number2) + 1; i++) {
            if (i % number1 == 0 && i % number2 == 0) {
                System.out.print(i + " ");
                break;
            }
        }
//        System.out.print("Какое-нибуть число которое кратно этим двум равняется: " + (number1 * number2));
    }

    //2. Визначити усі дільники довільного заданого натурального числа.
    public static void second() {
        System.out.println("-------------Задание №1-------------");

        System.out.print("Введите число делители которого вы хотите узнать: ");
        int number = in.nextInt();
        int count = 0;
        for (int i = 1; i < number + 1; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println();
        System.out.print("Делителей этого числа: " + count);
        System.out.println();
    }

    //3. Визначити усі числа, які одночасно є дільниками кожного з двох довільних заданих натуральних чисел.
    public static void third() {
        System.out.println("-------------Задание №3-------------");

        System.out.print("Введите первое число делитель которого вы хотите узнать: ");
        int number1 = in.nextInt();

        System.out.print("Введите второе число делитель которого вы хотите узнать: ");
        int number2 = in.nextInt();

        int count = 0;    //if number1 > number2 то number1+1 else: number2+1
        for (int i = 1; i < (number1 > number2 ? number1 + 1 : number2 + 1); i++) {  // +1 чтобы не терять в скорости и не писать <=
            if (number1 % i == 0 && number2 % i == 0) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println();
        System.out.print("Количество делителей этих чисел: " + count);
        System.out.println();
    }

    //4. Визначити перші 10 чисел, що одночасно діляться на кожного з двох довільних заданих натуральних чисел.
    public static void fourth() {
        System.out.println("-------------Задание №4-------------");

        System.out.print("Введите первое число: ");
        int number1 = in.nextInt();

        System.out.print("Введите второе число: ");
        int number2 = in.nextInt();

        int count = 0;
        for (int i = 1; i < Integer.MAX_VALUE; i++) {
            if (i % number1 == 0 && i % number2 == 0) {
                System.out.print(i + " ");
                count++;
                if (count > 9) {
                    break;
                }
            }
        }
        System.out.println();
        System.out.print("Количество делителей этих чисел: " + count);
        System.out.println();
    }

    // 5. Скільки існує натуральних чисел, менших 200, що не діляться ні на 5,ні на 7?
    public static void fifth() {
        System.out.println("-------------Задание №5-------------");

        int count = 0;
        for (int i = 0; i < 201; i++) {  // +1 чтобы не терять в скорости и не писать <=
            if (i % 5 != 0 && i % 7 != 0) {
//                System.out.print(i + " ");  // для вывода всех этих чисел
                count++;
            }
        }
        System.out.println();
        System.out.print("Количество делителей этих чисел: " + count);
        System.out.println();
    }

    // 6*. До числа 35 дописати ліворуч і праворуч по одній однаковій (інший варіант завдання - довільній) цифрі такій,
    // щоб утворене число було кратним довільному заданому натуральному числу.
    public static void sixth() {

        System.out.println("-------------Задание №6-------------");

        System.out.print("\nВведите произвольное число чтобы найти кратное ему число: ");
        int arbitraryNumber = in.nextInt();

        System.out.println("\nОдинаковые числа слева и права(первый вариант)");

        for (int i = 1; i < 10; i++) {
            if ((i * 1000 + 350 + i) % arbitraryNumber == 0) {
                System.out.print("Число кратное заданному числу: " + (i * 1000 + 350 + i) + "\n");
            }
        }
        System.out.println("\nРазные числа слева и права(другой вариант)");
        int count = 0;
        for (int j = 1; j < 10; j++) {
            for (int k = 1; k < 10; k++) {
                if ((j * 1000 + 350 + k) % arbitraryNumber == 0) {
                    System.out.println("Число кратное заданному числу c разнымой первое и последней цифрой: " + (j * 1000 + 350 + k) + "\n");
                    count++;
                }
                if (count > 0) {
                    break;
                }
            }
        }

    }

    // 7*. Знайти всі натуральні числа x , що задовольняють рівнянню
    // 92abc = 874 * x.  Ліворуч стоїть пятицифрове число (a, b, c – цифри в межах 0…9).
    // x = 92abc / 874
    public static void seventh() {
        System.out.println("-------------Задание №7-------------");
        double x;
        for (int a = 0; a < 10; a++) {
            for (int b = 0; b < 10; b++) {
                for (int c = 0; c < 10; c++) {
                    x = ((92000 + a * 100 + b * 10 + c) / 874.0); // 874.0 чтобы данные были в double
                    if (x % 1 == 0) {
                        System.out.println("Ваш натуральный равен: " + (int) x); // int чтоб убрать не красивый 0
                        System.out.println("Число при котором нашло x : " + "92" + a + b + c);
                    }
                }
            }
        }
    }

    // 8*. Скільки існує пар (a, b) натуральних чисел, менших 200, таких, що сума a*a + b*b ділиться на 49?
    public static void eighth() {
        System.out.println("-------------Задание №8-------------");
        int limitNaturalNumber = 201;
        int count = 0;
        for (int a = 1; a < limitNaturalNumber; a++) {
            for (int b = 1; b < limitNaturalNumber; b++) {
                if ((a * a + b * b) % 49 == 0) {
                    count++;
                }
            }
        }
        System.out.print("Существует " + count + " пар чисел которые делятся нацело на 49");
    }

    // 9*. Знайдіть всі натуральні числа, на які можна скоротити дріб (5x+6)/(8x+7) при різних цілих значеннях x.
    public static void ninth() {
        System.out.println("-------------Задание №9-------------");
        int limit = 101;
        for (int x = 0; x < limit; x++) {
            for (int i = 2; i < limit; i++) {
                if ((5 * x + 6) % i == 0 && (8 * x + 7) % i == 0) {
                    System.out.println("Дробь: " + (5 * x + 6) + "/" + (8 * x + 7) + " сокращается на " + i + "." + "\nСокращенная дробь: " + ((5 * x + 6) / i + "/" + (8 * x + 7) / i));
                    System.out.println();
                }
            }
        }
    }

    // 10*. Від тризначного числа відняли суму кубів його цифр. Який найбільший результат міг при цьому вийти?
    public static void tenth() {
        System.out.println("-------------Задание №10-------------");
        double result, buf = 0;
        for (int i = 100; i < 1000; i++) {
            result = i - Math.pow((i % 10), 3) - Math.pow((i / 100), 3) - Math.pow((i / 10 % 10), 3);
            if (result > buf) {
                buf = result;
            }
        }
        System.out.println("Самый большой результат который может быть в данной задаче: " + (int) buf); // для ответа без .0

    }

    // 11*. Скільки існує натуральних чисел таких, які можна подати у вигляді суми двох тризначних чисел
    // cba + abc, (a і с не рівні 0)?
    public static void eleventh() {
        int[] arrNum = new int[1000];
        int index = 0, count = 0, numberOfNumbers = 0;

        System.out.println("-------------Задание №11-------------");
        for (int a = 1; a < 10; a++) {
            for (int b = 0; b < 10; b++) {
                for (int c = 1; c < 10; c++) {
                    int result = (a * 100 + b * 10 + c) + (c * 100 + b * 10 + a);
                    numberOfNumbers++;
                    int checker = 0;
                    for (int element : arrNum) {
                        if (element == result) {
                            checker++;
                        }
                    }
                    if (checker == 0) {
                        arrNum[index] = result;
                        count++;
                    }
                    index++;


                }
            }
        }
        System.out.println("Количетсво чисел: " + numberOfNumbers);
        System.out.println("Количетсво пар: " + numberOfNumbers / 2);
        System.out.println("Существует " + count + " разных натуральных чисел которые можно представить суммой трехзначных чисел.");  // чтобы узнать количество РАЗНЫХ натуральных чисел которые можно представить суммой трехзначных чисел.
        /*  Чтобы вывести все 170 этих чисел в массиве */
        Arrays.sort(arrNum);
        int lastZero = 0;
        for (int i = 0; i < arrNum.length; i++) {
            if (arrNum[i] != 0) {
                lastZero = i;
                break;
            }
        }
        int[] newArr = Arrays.copyOfRange(arrNum, lastZero, arrNum.length);
        System.out.println(Arrays.toString(newArr));
//        System.out.println("Существует " + newArr.length + "разных натуральных чисел которые можно представить суммой трехзначных чисел.");
    }

    // Для очистки одинаковых элементов массива.
    public static int[] removingIdenticalElements(int[] arr) {
        if (arr == null || arr.length == 0) {
            return arr;
        }
        Arrays.sort(arr);
        int n = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                n++;
            }
        }
        int[] res = new int[n];
        res[0] = arr[0];
        n = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                res[n++] = arr[i];
            }
        }
        return res;

    }

    // 0, 1, 4, 9, 16, 25, 36, 49, …
    public static void additionalFirst() {
        System.out.println("Дополнительное задание №1\n");
        for (int i = 0; i < 8; i++) {
            System.out.print((int) Math.pow(i, 2) + " ");
        }
    }


    //0, -1, 2, -3, 4, -5, 6, -7, 8, …
    public static void additionalSecond() {
        System.out.println("Дополнительное задание №2\n");
        int result;
        for (int i = 0; i < 9; i++) {
            if (i % 2 != 0) {
                result = i * (-1);
            } else {
                result = i;
            }
            System.out.print(result + " ");
        }

    }


    //0, 1, 0, 9, 0, 25, 0, 49, 0, …
    public static void additionalThird() {
        System.out.println("Дополнительное задание №3\n");
        int result, degree = 2;
        for (int i = 0; i < 9; i++) {
            result = i % 2 == 0 ? result = 0 : (int) Math.pow(i, degree);
            System.out.print(result + " ");
        }
    }


    //4.Сформувати послідовність з n блоків по 20 (5*4) цілих чисел:
    //0, 1, 2, 3, 4, 5, 4, 3, 2, 1, 0, -1 , -2, -3, -4, -5 , -4, -3, -2, -1
    public static void additionalFourth() {
        System.out.println("Дополнительное задание №4\n");
        for (int i = 0; i < 5; i++) {
            System.out.print(i + " ");
        }
        for (int j = 5; j > 0; j--) {
            System.out.print(j + " ");
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(i * (-1) + " ");
        }
        for (int j = 5; j > 0; j--) {
            System.out.print(j * (-1) + " ");
        }
    }


    //5.Сформувати послідовність з n блоків по k*4 цілих чисел аналогічно завдання 4:
    //0, 1, 2, …, k-1, k, k-1, …, 2, 1, 0, -1 , -2, …, -(k-1), -k, -(k-1) , …, -2, -1
    public static void additionalFifth() {
        System.out.println("Дополнительное задание №5\n");
        System.out.print("Введите k: ");
        int k = in.nextInt();
        for (int i = 0; i < k; i++) {
            System.out.print(i + " ");
        }
        for (int j = k; j > 0; j--) {
            System.out.print(j + " ");
        }
        for (int i = 0; i < k; i++) {
            System.out.print(i * (-1) + " ");
        }
        for (int j = k; j > 0; j--) {
            System.out.print(j * (-1) + " ");
        }
    }
}
