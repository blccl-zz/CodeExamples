package com.wom.controller;

import com.wom.model.Customer;
import com.wom.model.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import javax.servlet.http.HttpSession;

/**
 * Created by User on 12/12/2016.
 *
 */

@Controller
public class LoginController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String showLoginForm(){
        return "WEB-INF/views/login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String verifyLogin(@RequestParam String userId, @RequestParam String password, HttpSession session, ModelMap model){

        Customer customer = customerService.loginCustomer(userId, password);
        if (customer == null) {
            model.addAttribute("loginError", "Error logging in. Please try again");
            return "WEB-INF/views/login";
        }
        session.setAttribute("loggedInUser", customer);
        return "redirect:/";
    }

}
