package com.github.gmameniskis.EgglessYolk.controller;

import com.github.gmameniskis.EgglessYolk.model.User;
import com.github.gmameniskis.EgglessYolk.service.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class UserController {

    private UserServices userServices;

    @Autowired
    public UserController(UserServices services) {
        this.userServices = services;
    }

    @RequestMapping("/")
    public ModelAndView login() {
        ModelAndView mv = new ModelAndView();
//        mv.addObject("user", user);
        mv.setViewName("login");
        return mv;
    }

    @RequestMapping("/addUser")
    public ModelAndView addUser(String userName, String password) {
//        Boolean
        User user = userServices.addUser(userName, password);
        System.out.println("New User: " + user);
        ModelAndView mv = new ModelAndView();
        mv.addObject("newUser", user);
        mv.setViewName("addUser");
        return mv;
    }

    @RequestMapping("/verifyInfo")
    public ModelAndView verifyInfo(String userName, String password){
        System.out.println("verify called");
        ModelAndView mv = new ModelAndView();
        Boolean userNameExist = userServices.doesUserNameExist(userName);
        System.out.println("exists: " + userNameExist);
        if(userNameExist){
           User userTryingToGetIt = userServices.matchPassword(userName, password);
            System.out.println("User trying to get in: " + userTryingToGetIt);
           if (userTryingToGetIt == null){
               System.out.println("incorrect password");
               mv.setViewName("login");
           } else {
               mv.setViewName("welcomePage");
           }
        } else {
            System.out.println("User does not exist ");
            mv.setViewName("login");
        }
        return mv;
    }
}
