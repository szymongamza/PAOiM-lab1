package UI;

import Figures.*;

import java.util.Scanner;

public class Main_Menu {
    public void print_Main_Menu() {
        System.out.println("What figure do u want to pick? (Input a number)");
        System.out.println("1. Triangle");
        System.out.println("2. Square");
        System.out.println("3. Circle");
        System.out.println();
        Figure figure = null;
        Scanner scanner = new Scanner(System.in);
        int menu = scanner.nextInt();
        switch (menu) {
            case 1:
                System.out.println("You picked 1. Triangle");
                System.out.println("Input base of triangle:");
                double base = -1;
                while (base < 0) {
                    base = scanner.nextDouble();
                    if (base < 0) {
                        System.out.println("Base cannot be <0");
                    }
                }
                System.out.println("Input height of triangle:");
                double h = -1;
                while (h < 0) {
                    h = scanner.nextDouble();
                    if (h < 0) {
                        System.out.println("Height cannot be <0");
                    }
                }
                Triangle triangle = new Triangle(base, h);
                figure = triangle;
                System.out.println();
                triangle.print();
                break;

            case 2:
                System.out.println("You picked 2. Square");
                System.out.println("Input side of square:");
                double side = -1;
                while (side < 0) {
                    side = scanner.nextDouble();
                    if (side < 0) {
                        System.out.println("Side cannot be <0");
                    }
                }
                Square square = new Square(side);
                figure = square;
                System.out.println();
                square.print();
                break;
            case 3:
                System.out.println("You picked 3. Circle");
                System.out.println("Input ray of circle:");
                double r = -1;
                while (r < 0) {
                    r = scanner.nextDouble();
                    if (r < 0) {
                        System.out.println("Side cannot be <0");
                    }
                }
                Circle circle = new Circle(r);
                figure = circle;
                System.out.println();
                circle.print();
                break;
        }
        System.out.println();
        System.out.println("Do you want to build a prism?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        int selection = scanner.nextInt();
        switch (selection) {
            case 1:
                System.out.println("Input height of prism:");
                double height = -1;
                while (height < 0) {
                    height = scanner.nextDouble();
                    if (height < 0) {
                        System.out.println("Side cannot be <0");
                    }
                }
                Prism prism = new Prism(figure, height);
                System.out.println();
                prism.print();
                break;
            case 2:
                break;
        }
    }
}

