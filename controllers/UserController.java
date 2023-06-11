package OOPhw4.controllers;

import OOPhw4.model.User;

import java.util.List;

public interface UserController<T extends User> {

    void create(String fullName, Integer age, String phoneNumber);
    List<T> getAllSortUsers();
    List<T> getAllSortUsersByFamilyName();
    boolean removeUser(String fullName);
    List<T> getAll();
    List<T> getAllSortUsersByAge();
}