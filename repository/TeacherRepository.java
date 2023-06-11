package OOPhw4.repository;

import OOPhw4.model.Teacher;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeacherRepository implements UserRepository<Teacher> {
    private final List <Teacher> teachers;

    public TeacherRepository() {
        this.teachers = new ArrayList<>();
    }

    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    @Override
    public void add(Teacher teacher) {
        teachers.add(teacher);
    }

    @Override
    public void remove(String fullName) {
        for (Teacher teacher : teachers) {
            if (teacher.getFullName().equals(fullName)){
                teachers.remove(teacher);
                return;
            }

        }
    }

    @Override
    public Long getMaxId() {
            Long maxId = 0L;
            for (Teacher teacher: teachers) {
                if (teacher.getId() > maxId) {
                    maxId = teacher.getId();
                }
            }
            return maxId;
        }

    public void editTeacher(Long id){
        Scanner in = new Scanner(System.in);
        for (Teacher teacher : teachers) {
            if (teacher.getId().equals(id)){
                System.out.print("Введите полное имя: ");
                teacher.setFullName(in.nextLine());
                System.out.print("Введите возраст: ");
                teacher.setAge(Integer.valueOf(in.nextLine()));
                System.out.print("Введите номер телефона: ");
                teacher.setPhoneNumber(in.nextLine());

            }

        }
    }

    }
