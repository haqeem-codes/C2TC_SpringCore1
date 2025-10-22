package com.example.User_service.Controller;

import com.example.User_service.Model.User;
import com.example.User_service.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")

public class UserController {

    @Autowired
    private UserService userService;


    @PostMapping
    public User createUser(@RequestBody User user){
        return userService.saveuser(user);
    }

    @GetMapping()
    public List<User> getalluser(){
        return userService.getalluser();
    }

    @PutMapping("/{id}")

    public User updateuser(@PathVariable Long id, @RequestBody User user){
        return userService.updateUser(id, user);
    }
    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
        return "User deleted successfully";
    }

}
