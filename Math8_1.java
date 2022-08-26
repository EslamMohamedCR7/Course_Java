package math8_1;


public class Math8_1 {

    double width ;
    double height ;
     Math8_1(){
        width = 1 ;
        height = 1 ;
    }

     Math8_1(double r, double y) {
        width = r;
        height = y;
    }

    double getArea() {
        double area = width * height;
        return area ;
    }

    double getPerimeter() {
        double perimeter = 2 * (width * height);
        return perimeter ;
    }
}
