package OOPhw4.model;

import lombok.*;

@Data
public class User {
    private Long id;
    private String fullName;
    private Integer age;
    private String phoneNumber;

    public User(Long id, String fullName, Integer age, String phoneNumber) {
        this.id = id;
        this.fullName = fullName;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }



}