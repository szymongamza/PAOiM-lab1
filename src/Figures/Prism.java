package Figures;

public class Prism implements Printable {
    Figure base;
    double h;

    public Prism(Figure base, double height) {
        this.base = base;
        this.h = height;
    }

    public double calculateVolume() {
        return base.calculateArea() * h;
    }

    public double calculateWholeArea() {
        return base.calculateArea() * 2 + base.calculatePerimeter() * h;
    }

    @Override
    public void print() {
        System.out.println("Prism: ");
        System.out.println("Area of base: " + base.calculateArea());
        System.out.println("Height of prism: " + h);
        System.out.println("Volume: " + calculateVolume());
        System.out.println("Whole area: " + calculateWholeArea());
    }
}
