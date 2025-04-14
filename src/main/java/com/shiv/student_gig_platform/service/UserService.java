package com.shiv.student_gig_platform.service;

import com.shiv.student_gig_platform.model.User;
import com.shiv.student_gig_platform.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@RequiredArgsConstructor
@Service
public class UserService {
    private final UserRepository userRepository;

    public User register(User user) {
        System.out.println(user);
        Optional<User> existing=userRepository.findByEmail(user.getEmail());
        if(existing.isPresent())
        {
             throw new RuntimeException("All ready present");
        }
        return userRepository.save(user);
    }

    public Optional<User> getByEmail(String email){
        return userRepository.findByEmail(email);
    }

}
