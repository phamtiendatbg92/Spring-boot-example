package org.youngmonkeys.spring_boot_example.repo;

import org.springframework.stereotype.Component;
import org.youngmonkeys.spring_boot_example.entity.User;

import java.util.HashMap;
import java.util.Map;

@Component
public class UserRepository {

    private final Map<String, User> userByUsername;

    {
        userByUsername = new HashMap<>();
        userByUsername.put("Dat", new User("Dat", "Pham Tien Dat"));
    }

    public User findUserByUsername(String username) {
        return userByUsername.get(username);
    }
}
