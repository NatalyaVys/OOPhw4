package OOPhw4.controllers;

import OOPhw4.model.Teacher;
import OOPhw4.service.TeacherServise;
import lombok.Data;

import java.util.List;
@Data
public class TeacherController implements UserController<Teacher> {

    public final TeacherServise teacherServise;

    public TeacherController(TeacherServise teacherServise) {
        this.teacherServise = teacherServise;
    }

    @Override
    public void create(String fullName, Integer age, String phoneNumber) {
        teacherServise.create(fullName, age, phoneNumber);
    }

    @Override
    public List<Teacher> getAllSortUsers() {
        return teacherServise.getAllSortUsers();
    }

    @Override
    public List<Teacher> getAllSortUsersByFamilyName() {
        return teacherServise.getAllSortUsersByFamilyName();
    }

    @Override
    public boolean removeUser(String fullName) {
        teacherServise.removeUser(fullName);
        return true;
    }

    @Override
    public List<Teacher> getAll() {
        return teacherServise.getAll();
    }

    @Override
    public List<Teacher> getAllSortUsersByAge() {
        return teacherServise.getAllSortUsersByAge();
    }
    public boolean editTeacher(Long id){
        teacherServise.editTeacher(id);
        return true;
    }
}