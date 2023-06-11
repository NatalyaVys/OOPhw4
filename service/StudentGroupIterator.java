package OOPhw4.service;

import OOPhw4.model.Student;

import java.util.Iterator;
import java.util.List;


public class StudentGroupIterator implements Iterator<Student> {

    private final List<Student> studentList;
    private int count;

    public StudentGroupIterator(List<Student> studentList) {
        this.studentList = studentList;
    }


    @Override
    public boolean hasNext() {
        return count < studentList.size();
    }

    @Override
    public Student next() {
        return studentList.get(count++);
    }

    @Override
    public void remove() {
        studentList.remove(--count);
    }
}