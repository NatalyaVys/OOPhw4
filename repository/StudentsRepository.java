package OOPhw4.repository;

import OOPhw4.model.Student;
import OOPhw4.model.StudentGroup;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class StudentsRepository implements UserRepository<Student> {

    private final List<Student> students;

    public StudentsRepository() {
        this.students = new ArrayList<>();

    }

    @Override
    public List<Student> getAll() {
        return students;
    }

    @Override
    public void add(Student student) {
        students.add(student);
    }

    @Override
    public void remove(String fullName) {
        for (Student student : students) {
            if (student.getFullName().equals(fullName)) {
                students.remove(student);
                return;
            }
        }
    }


    @Override
    public Long getMaxId() {
        Long maxId = 0L;
        for (Student student : students) {
            if (student.getId() > maxId) {
                maxId = student.getId();
            }
        }
        return maxId;
    }
}