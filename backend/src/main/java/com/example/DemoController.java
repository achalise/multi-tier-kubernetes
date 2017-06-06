package com.example;

import com.example.model.User;
import com.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * Created by achalise on 29/4/17.
 */

@RestController
public class DemoController {

    @Autowired
    private UserRepository userRepository;

    @Value("${customer.message}")
    private String message;

    @RequestMapping(value = "/api/users", method = RequestMethod.GET)
    @ResponseBody
    public List<User> getUsers() {
        List<User> users = Arrays.asList(new User("Joe", "Bloggs", "joe@blogs.com"),
                new User("Joe", "Doe", "jdoe@email.com"));
        users.stream().forEach((user)->insertUserIfNoExist(user));
        return userRepository.findAll();
    }

    @RequestMapping(value = "/api/message", method = RequestMethod.GET)
    @ResponseBody
    public String getMessage() {
        return "\"" + message + "\"";
    }

    private void insertUserIfNoExist(User user) {
        User u = userRepository.findByEmail(user.getEmail());
        if (u == null) {
            userRepository.save(user);
        }
    }
}
