package EX11_01;

public class test {

    public static void main(String[] args) {
        Triangle T1 = new Triangle();
        Triangle T2 = new Triangle(1.0, 1.5, 1.0);
        T1.setColor("yellow");
        T1.setFilled(true);
        T2.setColor("red");
//        T2.isFilled();
        //The Frist Object
        System.out.println("The Frist Object : ");
        System.out.println("\t" + T1.toString());
        System.out.println("\tThe Perimeter Is : " + T1.getPerimeter() + ".");
        System.out.println("\tThe Area Is : " + T1.getArea() + ".");
        //The Second Object
        System.out.println("The Second Object : ");
        System.out.println("\t" + T2.toString());
        System.out.println("\tThe Perimeter Is : " + T2.getPerimeter() + ".");
        System.out.println("\tThe Area Is : " + T2.getArea() + ".");

    }
}
