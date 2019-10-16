package com.hu.cs.project.project.Controller;

import com.hu.cs.project.project.Model.Users;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    @GetMapping("/user/adduser")
    public String getAddUser(Model model){
        model.addAttribute("user", new Users());
        return "Users_add";
    }
}
