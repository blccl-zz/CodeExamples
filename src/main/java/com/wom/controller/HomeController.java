package com.wom.controller;

import com.wom.model.dao.HomeDAOImp;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by User on 10/12/2016.
 */
@Controller
public class HomeController {
    @RequestMapping (value = "/")
    public String home(ModelMap model){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        HomeDAOImp homeDAOImp = (HomeDAOImp)context.getBean("HomeDAOImp");
        homeDAOImp.create("Welcome to WoM");

        model.addAttribute("Complete");
        return "WEB-INF/views/Home";
    }

    @RequestMapping (value = "/events")
    public String events(ModelMap model){
        model.addAttribute("message", "Events");
        return "WEB-INF/views/events";

    }
}