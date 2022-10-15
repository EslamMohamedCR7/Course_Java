package EX11_05;

import java.util.ArrayList;

public class test {

    public static void main(String[] args) {
        Course AL = new Course("COURSE&JAVA");
        AL.addStudent("eslam");
        AL.addStudent("mahamed");
        AL.addStudent("emad");
        AL.addStudent("marwan");
        AL.addStudent("Ali");
        AL.addStudent("Mai");
        AL.dropStudent("eslam");
        AL.dropStudent("emad");
        AL.dropStudent("Mai");
        AL.dropStudent("sami");
        System.out.println("The CourseName IS " + AL.getCourseName());
        System.out.println("The NumberOfStudents Are " + AL.getNumberOfStudents());
        System.out.println("The Students Are " + AL.getStudents());

    }
}
