package com.example.demo.Control;

import com.example.demo.Entity.user;
import com.example.demo.commonutils.R;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/admin/acl/user")
public class userControl {
    @Autowired
    UserService userService;
    @GetMapping("/")
    public R findAlluser() {
        List<user> users = userService.list(null);
        return R.ok().data("USER",users);
    }
}
