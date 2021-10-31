package day01;

public class School {

    public static void main(String[] args) {
        Students students = new Students();

        students.addHeight(123);
        students.addHeight(124);
        students.addHeight(123);

        System.out.println(students.isHeightsIncreasing());
    }
}
