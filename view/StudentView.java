package OOPhw4.view;

import OOPhw4.controllers.UserController;
import OOPhw4.model.Student;

import java.util.List;

public class StudentView implements UserView<Student> {
    UserController<Student> controller;

    public StudentView(UserController<Student> controller) {
        this.controller = controller;
    }

    @Override
    public void sendOnConsole(String sortType) {
        List<Student> students = switch (sortType) {
            case sortType.NONE -> controller.getAll();
            case sortType.NAME -> controller.getAllSortUsers();
            case sortType.FAMILY -> controller.getAllSortUsersByFamilyName();
            case sortType.AGE -> controller.getAllSortUsersByAge();
            default -> null;
        };
        if (students == null)  {
            System.out.println("students is null");
            return;
        }
        System.out.println("=====================");
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("=====================");
    }

    @Override
    public void create(String fullName, Integer age, String phoneNumber) {
        controller.create(fullName, age, phoneNumber);
    }

    @Override
    public void removeUser(String fullName) {
        controller.removeUser(fullName);
    }
}
