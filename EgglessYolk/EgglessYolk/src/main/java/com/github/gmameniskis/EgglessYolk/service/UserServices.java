package com.github.gmameniskis.EgglessYolk.service;

import com.github.gmameniskis.EgglessYolk.model.User;
import com.github.gmameniskis.EgglessYolk.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service
public class UserServices {

    private UserRepository userRepository;

    @Autowired
    public UserServices(UserRepository repository) {
        this.userRepository = repository;
    }

    public User addUser(String userName, String password) {
        List<User> userList = userRepository.findByUserName(userName);
        System.out.println("UserList: " + userList);
        if (userList.isEmpty()) {
            User newUser = new User(userName, password);
            System.out.println("New User: " + newUser);
            userRepository.save(newUser);
            return newUser;
        }
        return null;
    }

    public Map<String, User> getMap() {
        List<User> listToMap = userRepository.findAll();
        Map<String, User> mappedList = null;

        for(User user : listToMap) {
            mappedList.put(user.getUserId().toString(), user);
        }
        return mappedList;
    }

    public Boolean doesUserNameExist(String userName) {
       List<User> userList = userRepository.findByUserName(userName);
       if (userList.isEmpty()) {
           return false;
       } else {
           return true;
       }
    }

    public User matchPassword(String userName, String password) {
        List<User> singleList = userRepository.findByUserName(userName);
        for(User singleUser: singleList) {
            if (password.equals(singleUser.getPassword())) {
                return singleUser;
            }
        }
        return null;
    }

//    public User findById(UUID ) {
//
//    }
//
//    public User findByUserName() {
//        this.userRepository =
//    }
}
