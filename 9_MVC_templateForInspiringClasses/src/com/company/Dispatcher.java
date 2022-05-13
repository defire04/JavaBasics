package com.company;

import java.util.Scanner;

public class Dispatcher {

    public static void main(String[] args) {
// ---------------------------- First ---------------------------- //
//        Scanner in = new Scanner(System.in);
//
//        System.out.print("Введите какой треугольник вы хотите: ");
//        String type = in.next();
//
//        System.out.print("Введите символ с которого будет сделан треугольник: ");
//        String symbol = in.next();
//
//        System.out.print("Введите размер треугольника: ");
//        int lines = in.nextInt();
//
//        System.out.print("Введите количесто отупов фигуры от начала строки: ");
//        int shifts = in.nextInt();
//
//        Triangle triangle = new Triangle(type, symbol, lines, shifts);
//        ControllerAndView.printTriangle(triangle);

//        Triangle Regular = new Triangle("RegularTriangle", "*", 5, 0);
//        ControllerAndView.printTriangle(Regular);
//
//        System.out.println();
//
//        Triangle Reverse = new Triangle("ReverseTriangle", "+", 5, 0);
//        ControllerAndView.printTriangle(Reverse);
//
//        System.out.println();
//
//        Triangle ReverseMirror = new Triangle("ReverseMirrorTriangle", "-", 5, 0);
//        ControllerAndView.printTriangle(ReverseMirror);
//
//        System.out.println();
//
//        Triangle MirrorRegular = new Triangle("MirrorRegularTriangle", "/", 5, 0);
//        ControllerAndView.printTriangle(MirrorRegular);
//
//        System.out.println();
//
//        Rectangle rectangle = new Rectangle("+", 7, 3, 0);
//        ControllerAndView.printRectangle(rectangle);


// ---------------------------- Second ---------------------------- //
        Triangle levelTwo = new Triangle(" ", "*", 5, 0);
        ControllerAndView.taskTwoFirst(levelTwo);
        ControllerAndView.taskTwoSecond(levelTwo);
        ControllerAndView.taskTwoThird(levelTwo);
        ControllerAndView.taskTwoForth(levelTwo);
        ControllerAndView.taskTwoFifth(levelTwo);
        ControllerAndView.taskTwoSixth(levelTwo);
        ControllerAndView.taskTwoSeventh(levelTwo);
        ControllerAndView.taskTwoEighth(levelTwo);


// ---------------------------- Third ---------------------------- //
        Triangle levelTree = new Triangle(" ", "+", 5, 5);
        ControllerAndView.taskTreeFirst(levelTree);
        ControllerAndView.taskTreeSecond(levelTree);


// ---------------------------- Fourth ---------------------------- //
        Triangle levelFourth = new Triangle(" ", "*", 5, 5);

        // ----------- Christmas tree
        ControllerAndView.christmasTree(levelFourth);

        // ------------ Rocket
        ControllerAndView.rocket(levelFourth);

        // ------------ House without window and door
        ControllerAndView.house(levelFourth);

        // ------------ Car
        ControllerAndView.car(levelFourth);




    }
}
