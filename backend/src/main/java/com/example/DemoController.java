package com.example;

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

    @RequestMapping(value = "/api/users", method = RequestMethod.GET)
    @ResponseBody
    public List<User> getUsers() {
        return Arrays.asList(new User("Joe", "Bloggs"), new User("Joe", "Doe"));
    }
}

class User {
    private String firstName;
    private String lastName;

    public User(){}

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}