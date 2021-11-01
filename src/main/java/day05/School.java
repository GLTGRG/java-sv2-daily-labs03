package day05;

public class School {

    public static void main(String[] args) {
        Journal journal = new Journal();

        journal.addStudent("Gergo Galat");
        journal.addStudent("Janos");

        System.out.println(journal.getStudents().size());
    }
}
