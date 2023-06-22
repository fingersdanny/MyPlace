package myplace.core.controller;

import myplace.core.user.UserCreateForm;
import myplace.core.user.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping("/signup")
    public String signup(UserCreateForm userCreateForm) {
        return "users/userCreateForm";
    }

}
