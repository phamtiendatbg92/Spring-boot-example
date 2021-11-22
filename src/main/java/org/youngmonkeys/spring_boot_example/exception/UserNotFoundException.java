package org.youngmonkeys.spring_boot_example.exception;

public class UserNotFoundException extends NotFoundException {

    public UserNotFoundException(String username) {
        super("user: " + username + " not found");
    }
}
