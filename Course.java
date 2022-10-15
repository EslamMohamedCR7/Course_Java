package EX11_05;

import java.util.ArrayList;

public class Course {

    private String courseName;
    private ArrayList students;
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
        students = new ArrayList();
        numberOfStudents = 0;
    }

    public String getCourseName() {
        return courseName;
    }

    public void addStudent(String student) {
        students.add(student);
        numberOfStudents++;
    }

    public void dropStudent(String student) {
        students.remove(student);
    }

    public ArrayList getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        numberOfStudents = students.size();
        return numberOfStudents;
    }

    public int getIndexOfStudent(String student) {
        return student.indexOf(student);
    }

}


