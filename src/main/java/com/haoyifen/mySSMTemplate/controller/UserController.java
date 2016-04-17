package com.haoyifen.mySSMTemplate.controller;

import com.haoyifen.mySSMTemplate.dao.UserMapper;
import com.haoyifen.mySSMTemplate.pojo.User;
import com.haoyifen.mySSMTemplate.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by haoyifen on 2016/3/20 0020.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
  private UserService userService;

    @RequestMapping("/showUser")
    public String toIndex(HttpServletRequest request, Model model) {
        int userId = Integer.parseInt(request.getParameter("id"));
        User user = this.userService.getUserById(userId);
        System.out.println("成功了" + userId+user);
        return "showUser";
    }

    public void insertUser(){

    }
}

