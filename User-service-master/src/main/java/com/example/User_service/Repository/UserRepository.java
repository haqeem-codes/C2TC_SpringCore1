package com.example.User_service.Repository;


import com.example.User_service.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User,Long> {
}
