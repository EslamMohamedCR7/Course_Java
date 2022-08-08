package math8_1;

public class test {

    public static void main(String[] args) {
        Math8_1 c1 = new Math8_1(4, 40);
        Math8_1 c2 = new Math8_1(3.5, 3.9);
        System.out.println("Test1\n" + "the width is : " + c1.width + ".\n" + "the height is : " + c1.height + ".\n" + "the area is : " + c1.getArea() + ".\n" + "the perimeter is : " + c1.getPerimeter() + ".");
        System.out.print("Test1\n" + "the width is : " + c2.width + ".\n" + "the height is : " + c1.height + ".\n" + "the area is : " + c2.getArea() + ".\n" + "the perimeter is : " + c2.getPerimeter() + ".");
    }

}
