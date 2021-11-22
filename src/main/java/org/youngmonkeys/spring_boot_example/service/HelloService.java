package org.youngmonkeys.spring_boot_example.service;

import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.youngmonkeys.spring_boot_example.entity.User;
import org.youngmonkeys.spring_boot_example.exception.UserNotFoundException;
import org.youngmonkeys.spring_boot_example.repo.UserRepository;

@Slf4j
@Setter
@Service
public class HelloService {

    @Value("${print_log}")
    private boolean printLog;

    @Autowired
    private UserRepository userRepository;

    public User getUserByUsername(String username) {
        User user = userRepository.findUserByUsername(username);
        if (printLog) {
            log.info("user: {}", user);
        }
        if (user == null) {
            throw new UserNotFoundException(username);
        }
        return user;
    }
}
