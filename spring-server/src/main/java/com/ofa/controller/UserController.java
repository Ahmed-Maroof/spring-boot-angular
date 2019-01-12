package com.ofa.controller;

import com.ofa.model.User;
import com.ofa.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    UserRepository userRepository;

    @GetMapping("/api/all")
    @PreAuthorize("hasRole('ADMIN')")
    public List<User> getAllUsers()
    {
        logger.info("lllllllllllllllllllllllllllll");
        return userRepository.findAll();
    }
}
