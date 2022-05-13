package com.company;

public class ControllerAndView {

    static void printTriangle(Triangle triangle) {

        switch (triangle.type) {
            case "RegularTriangle", "1" -> regularTriangle(triangle);
            case "ReverseTriangle", "2" -> reverseTriangle(triangle);
            case "ReverseMirrorTriangle", "3" -> reverseMirrorTriangle(triangle);
            case "MirrorRegularTriangle", "4" -> mirrorRegularTriangle(triangle);
            default -> System.out.println("Такого нет.");
        }
    }

    // Для принта символа прямоугольника
    static void printRectangle(Rectangle rectangle) {
        rectangleTask(rectangle);
    }


    // Для принта символа треугольника
    static void printSymbol(String symbol, int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(symbol);
        }
    }


    // Для отступов фигуры
    static void printShifts(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(" ");
        }
    }


    // Для пробелов в треугольнике
    static void printSpace(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(" ");
        }
    }


    // Обычный треугольник №1
    public static void regularTriangle(Triangle triangle) {
        for (int row = 0; row < triangle.lines; row++) {
//            for (int col = 0; col < row + 1; col++) {
//                System.out.print(triangle.dot);
//            }
//            printDot(" ", triangle.shifts);
            printShifts(triangle.shifts);
            printSymbol(triangle.symbol, row + 1);

            System.out.println();
        }
    }


    // Перевернутый треугольник №2
    public static void reverseTriangle(Triangle triangle) {
        for (int row = 0; row < triangle.lines; row++) {

            printShifts(triangle.shifts);
            printSymbol(triangle.symbol, triangle.lines - row);

            System.out.println();
        }
    }


    // Перевернутый зеркальный треугольник №3
    public static void reverseMirrorTriangle(Triangle triangle) {
        for (int row = 0; row < triangle.lines; row++) {
//            for (int colSp = 0; colSp < row; colSp++) {
//                System.out.print(" ");
//            }
            printSpace(row);
            printShifts(triangle.shifts);
            printSymbol(triangle.symbol, triangle.lines - row);
            System.out.println();
        }
    }


    // Зеркальный обычный треугольник №4
    public static void mirrorRegularTriangle(Triangle triangle) {
        for (int row = 0; row < triangle.lines; row++) {

            printSpace(triangle.lines - row - 1);
            printShifts(triangle.shifts);
            printSymbol(triangle.symbol, row + 1);


            System.out.println();
        }
    }


    // Прямоугольник
    public static void rectangleTask(Rectangle rectangle) {
        for (int row = 0; row < rectangle.columns; row++) {

            printSpace(rectangle.shifts);
            printSymbol(rectangle.symbol, rectangle.lines);

            System.out.println();
        }
    }


    // Первая фигура втрого задания
    public static void taskTwoFirst(Triangle triangle) {
        printTriangle(new Triangle("1", triangle.symbol, triangle.lines - 1, triangle.shifts));
        printTriangle(new Triangle("2", triangle.symbol, triangle.lines, triangle.shifts));
        System.out.println();
    }


    // Вторая фигура второго задания
    public static void taskTwoSecond(Triangle triangle) {
        ControllerAndView.printTriangle(new Triangle("1", triangle.symbol, triangle.lines - 1, triangle.shifts));
        ControllerAndView.printTriangle(new Triangle("3", triangle.symbol, triangle.lines, triangle.shifts));
        System.out.println();
    }


    // Третья фигура второго задания
    public static void taskTwoThird(Triangle triangle) {
        ControllerAndView.printTriangle(new Triangle("4", triangle.symbol, triangle.lines - 1, triangle.shifts + 1));
        ControllerAndView.printTriangle(new Triangle("3", triangle.symbol, triangle.lines, triangle.shifts));
        System.out.println();
    }


    // Четвертая фигура второго задания
    public static void taskTwoForth(Triangle triangle) {
        ControllerAndView.printTriangle(new Triangle("4", triangle.symbol, triangle.lines - 1, triangle.shifts + 1));
        ControllerAndView.printTriangle(new Triangle("2", triangle.symbol, triangle.lines, triangle.shifts));
        System.out.println();
    }


    // Пятая фигура второго задания
    public static void taskTwoFifth(Triangle triangle) {
        printTriangle(new Triangle("1", triangle.symbol, triangle.lines, triangle.shifts));
        printRectangle(new Rectangle(triangle.symbol, triangle.lines, triangle.lines - 4, triangle.shifts));
        printTriangle(new Triangle("2", triangle.symbol, triangle.lines, triangle.shifts));
        System.out.println();
    }


    // Шестая фигура второго задания
    public static void taskTwoSixth(Triangle triangle) {
        printTriangle(new Triangle("1", triangle.symbol, triangle.lines, triangle.shifts));
        printRectangle(new Rectangle(triangle.symbol, triangle.lines, triangle.lines - 4, triangle.shifts));
        printTriangle(new Triangle("3", triangle.symbol, triangle.lines, triangle.shifts));
        System.out.println();
    }



    // Седьмая фигура втрого задания
    public static void taskTwoSeventh(Triangle triangle) {
        printTriangle(new Triangle("4", triangle.symbol, triangle.lines, triangle.shifts));
        printRectangle(new Rectangle(triangle.symbol, triangle.lines, triangle.lines - 4, triangle.shifts));
        printTriangle(new Triangle("3", triangle.symbol, triangle.lines, triangle.shifts));
        System.out.println();
    }


    // Восьмая фигура втрого задания
    public static void taskTwoEighth(Triangle triangle) {
        printTriangle(new Triangle("4", triangle.symbol, triangle.lines, triangle.shifts));
        printRectangle(new Rectangle(triangle.symbol, triangle.lines, triangle.lines - 4, triangle.shifts));
        printTriangle(new Triangle("2", triangle.symbol, triangle.lines, triangle.shifts));
        System.out.println();
    }


    // Первая фигура 3 уровня
    public static void taskTreeFirst(Triangle triangle) {
        for (int row = 0; row < triangle.lines; row++) {

            // Треугольник зеркальный обычному
            printSpace(triangle.lines - row - 1);
            printShifts(triangle.shifts);
            printSymbol(triangle.symbol, row + 1);

            // Треугольник обычный
            printSymbol(triangle.symbol, row);
            System.out.println();
        }
    }


    // Вторая фигура 3 уровня
    public static void taskTreeSecond(Triangle triangle) {
        for (int row = 0; row < triangle.lines; row++) {

            // Треугольник зеркальный обычному
            printSpace(triangle.lines - row - 1);
            printShifts(triangle.shifts);
            printSymbol(triangle.symbol, row + 1);
            System.out.print(" ");

            // Прямоугольник
            printSymbol(triangle.symbol, triangle.lines);
            System.out.print(" ");

            // Треугольник обычный
            printSymbol(triangle.symbol, row + 1);

            System.out.println();
        }
    }


    // ------------------------------ 4 уровень ------------------------------

    // Елка
    public static void christmasTree(Triangle triangle){
        ControllerAndView.taskTreeFirst(new Triangle("", triangle.symbol, triangle.lines, triangle.shifts + 10));
        ControllerAndView.taskTreeFirst(new Triangle("", triangle.symbol, triangle.lines + 5, triangle.shifts + 5));
        ControllerAndView.taskTreeFirst(new Triangle("", triangle.symbol, triangle.lines + 10, triangle.shifts));
        printRectangle(new Rectangle(triangle.symbol, 3, 3, (((triangle.lines  + 10 - 2) * 2) / 2) + triangle.shifts));

    }

    // Ракета
    public  static void rocket(Triangle triangle){
        ControllerAndView.taskTreeFirst(new Triangle("", triangle.symbol, triangle.lines, triangle.shifts + 12));
        printRectangle(new Rectangle(triangle.symbol, triangle.lines + triangle.lines - 1, triangle.lines - (triangle.lines / 2), triangle.shifts + (4 + 8)));
        taskTreeSecond(new Triangle("", triangle.symbol, triangle.lines + 2, triangle.shifts + 5));
        printRectangle(new Rectangle(triangle.symbol, triangle.lines + triangle.lines + 1, triangle.lines, triangle.shifts + (4 + 7)));
        taskTreeSecond(new Triangle("", triangle.symbol, triangle.lines * 2, (triangle.shifts * 2) - triangle.lines));

    }

    // Дом
    public static void house(Triangle triangle){
        taskTreeSecond(new Triangle("", triangle.symbol, triangle.lines , triangle.shifts));
        printRectangle(new Rectangle(triangle.symbol, triangle.lines * 3, triangle.lines, triangle.shifts + 1));
    }


    // Машина
    public static void car(Triangle triangle){
        taskTreeSecond(new Triangle("", triangle.symbol, triangle.lines - 2 , triangle.shifts + 4));
        printRectangle(new Rectangle(triangle.symbol, triangle.lines * 4, triangle.lines - (triangle.lines / 2), triangle.shifts));
        printWheels(new Rectangle(triangle.symbol, triangle.lines - 3, triangle.lines - 3, triangle.shifts));
    }


    // Для двух колесс в один ряд
    public static void wheels(Rectangle rectangle) {
        for (int row = 0; row < rectangle.columns; row++) {


            printSpace(rectangle.shifts + 3);
            printSymbol(rectangle.symbol, rectangle.lines);


            printSpace(rectangle.shifts + 7);
            printSymbol(rectangle.symbol, rectangle.lines);

            System.out.println();

        }

    }

    // Для принта колес
    static void printWheels(Rectangle rectangle) {
        wheels(rectangle);
    }
}
