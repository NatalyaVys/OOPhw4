package OOPhw4.model;

import OOPhw4.service.StudentGroupIterator;
import lombok.Data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
@Data
public class StudentGroup implements Iterable<Student> {

    List<Student> studentList;

    public StudentGroup(){
        studentList = new ArrayList<>();
    }

    public void addStudent(Student student){
        studentList.add(student);
    }
    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(studentList);
    }

    public void remove(String fullName) {
        for (Student student : studentList) {
            if (student.getFullName().equals(fullName)) {
                studentList.remove(student);
                return;
            }
        }
    }
}