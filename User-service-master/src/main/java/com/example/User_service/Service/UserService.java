package com.example.User_service.Service;


import com.example.User_service.Model.User;
import com.example.User_service.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public User saveuser(User user) {

        return userRepository.save(user);
    }

    public List<User> getalluser() {

        return userRepository.findAll();
    }

    public User updateUser(Long id, User user) {
        User existing = userRepository.findById(id).orElse(null);
        if (existing != null) {
            existing.setName(user.getName());
            existing.setEmail(user.getEmail());
            existing.setPassword(user.getPassword());
            return userRepository.save(existing);
        }
        return null;
    }

    public void deleteUser(Long id) {
            userRepository.deleteById(id);
        }
}
