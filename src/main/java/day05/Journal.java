package day05;

import java.util.ArrayList;
import java.util.List;

public class Journal {

    private List<String> students = new ArrayList<>();

    public boolean addStudent(String studentName){
        if (studentName.indexOf(' ')>0){
            students.add(studentName);
            return true;
        }
        return false;
    }

    public List<String> getStudents() {
        return new ArrayList<>(students);
    }
}
