package com.github.gmameniskis.EgglessYolk.service;

import com.github.gmameniskis.EgglessYolk.model.User;
import com.github.gmameniskis.EgglessYolk.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServices {

    private UserRepository userRepository;

    @Autowired
    public UserServices(UserRepository repository) {
        this.userRepository = repository;
    }

//    public User findById(UUID ) {
//
//    }
//
//    public User findByUserName() {
//        this.userRepository =
//    }
}
