package EX11_01;

public class Triangle extends GeometricObject {

    private double side1;
    private double side2;
    private double side3;

    public Triangle() {
        this(1.0, 1.0, 1.0);
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }
    public double getPerimeter() {
        return side1 + side2 + side3;
    }
    public double getArea() {
        double S = 0.5 * getPerimeter();
        double Area = Math.sqrt(S * (S - side1) * (S - side2) * (S - side3));
        return Area;
    }
    public String toString() {
        return super.toString() + "\tTriangle Sides : side1 = " + side1 + ", side2 = " + side2
                + ", side3 = " + side3 + ".";
    }
}
