package EX11_02;

public class test {

    public static void main(String[] args) {

        Person P1 = new Student();
        Person P2 = new Faculty();
        Person P3 = new Staff();
        MyDate MD = new MyDate();
        System.out.println(P1.toString());
        System.out.println(P2.toString());
        System.out.println(P3.toString());
        System.out.println(MD.toString());

    }
}
