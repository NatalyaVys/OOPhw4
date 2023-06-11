package OOPhw4.service;

import OOPhw4.model.Student;
import OOPhw4.model.Teacher;
import OOPhw4.repository.TeacherRepository;
import lombok.Data;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


@Data
public class TeacherServise implements UserService<Teacher> {
    public final TeacherRepository teacherRepository;

    public TeacherServise(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    @Override
    public void create(String fullName, Integer age, String phoneNumber) {
        Long id = teacherRepository.getMaxId() + 1;
        Teacher teacher = new Teacher(id, fullName, age, phoneNumber);
        teacherRepository.add(teacher);
    }
    @Override
    public List<Teacher> getAll() {
        return teacherRepository.getAll();
    }
    @Override
    public List<Teacher> getAllSortUsers() {
        List<Teacher> teachers = teacherRepository.getAll();
        teachers.sort(new Comparator<Teacher>() {
            @Override
            public int compare(Teacher o1, Teacher o2) {
                return o1.getFullName().compareTo(o2.getFullName());
            }
        });
        return teachers;

    }
    @Override
    public List<Teacher> getAllSortUsersByFamilyName() {
        List<Teacher> teachers = teacherRepository.getAll();
        teachers.sort(new UserComparatorBySecondName<>());
        return teachers;
    }

    @Override
    public List<Teacher> getAllSortUsersByAge() {
        List<Teacher> teachers = teacherRepository.getAll();
        teachers.sort(new UserComparatorByAge<>());
        return teachers;
    }

    @Override
    public void removeUser(String fullName) {
        teacherRepository.remove(fullName);
    }
    public boolean editTeacher(Long id){
        teacherRepository.editTeacher(id);
        return true;
    }
}