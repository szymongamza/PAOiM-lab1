package UI;

import Figures.*;


public class Main_Menu {
    public void print_Main_Menu() {
        System.out.println("What figure do u want to pick? (Input a number)");
        System.out.println("1. Triangle");
        System.out.println("2. Square");
        System.out.println("3. Circle");
        System.out.println();
        Figure figure = null;
        int menu = Input.InputIntHigherThanZeroInRangeToC(3);
        switch (menu) {
            case 1 -> {
                System.out.println("You picked 1. Triangle");
                System.out.println("Input base of triangle:");
                double base = Input.InputDoubleHigherThanZero();
                System.out.println("Input height of triangle:");
                double h = Input.InputDoubleHigherThanZero();
                Triangle triangle = new Triangle(base, h);
                figure = triangle;
                System.out.println();
                triangle.print();
            }
            case 2 -> {
                System.out.println("You picked 2. Square");
                System.out.println("Input side of square:");
                double side = Input.InputDoubleHigherThanZero();
                Square square = new Square(side);
                figure = square;
                System.out.println();
                square.print();
            }
            case 3 -> {
                System.out.println("You picked 3. Circle");
                System.out.println("Input ray of circle:");
                double r = Input.InputDoubleHigherThanZero();
                Circle circle = new Circle(r);
                figure = circle;
                System.out.println();
                circle.print();
            }
        }
        System.out.println();
        System.out.println("Do you want to build a prism?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        int selection = Input.InputIntHigherThanZeroInRangeToC(2);
        if (selection == 1) {
            System.out.println("Input height of prism:");
            double height = Input.InputDoubleHigherThanZero();
            Prism prism = new Prism(figure, height);
            System.out.println();
            prism.print();
        }
    }
}

