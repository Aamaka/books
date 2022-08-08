package africa.semicolon.books.model;

import africa.semicolon.books.model.enums.AccountStatus;
import africa.semicolon.books.model.enums.Gender;

import java.time.LocalDateTime;

public class User {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private LocalDateTime dob;
    private LocalDateTime dateJoined;
    private String location;
    private AccountStatus accountStatus;
    private Gender gender;




}
