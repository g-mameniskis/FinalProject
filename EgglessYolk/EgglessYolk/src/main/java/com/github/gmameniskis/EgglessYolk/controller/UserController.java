package com.github.gmameniskis.EgglessYolk.controller;

import com.github.gmameniskis.EgglessYolk.model.User;
import com.github.gmameniskis.EgglessYolk.service.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    private UserServices userServices;

    @Autowired
    public UserController(UserServices services) {
        this.userServices = services;
    }

    @RequestMapping("/")
    public ModelAndView home(User user) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("user", user);
        mv.setViewName("home");
        return mv;
    }
}
