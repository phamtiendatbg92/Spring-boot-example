package org.youngmonkeys.spring_boot_example.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.youngmonkeys.spring_boot_example.entity.User;
import org.youngmonkeys.spring_boot_example.request.HelloRequest;
import org.youngmonkeys.spring_boot_example.response.HelloResponse;
import org.youngmonkeys.spring_boot_example.service.HelloService;

@RestController
@AllArgsConstructor
public class HomeController {

    private final HelloService helloService;

    @GetMapping("/")
    private String home() {
        return "home";
    }

    @PostMapping("/hello")
    public HelloResponse hello(@RequestBody HelloRequest request) {
        return HelloResponse.builder()
            .message("Greet " + helloService.getUserByUsername(request.getWho()).getFullName())
            .build();
    }

    @GetMapping("/users/{username}")
    public User getUser(@PathVariable("username") String username) {
        return helloService.getUserByUsername(username);
    }
}
