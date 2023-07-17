package myplace.core.controller;

import lombok.RequiredArgsConstructor;
import myplace.core.user.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequiredArgsConstructor
@Controller
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    @GetMapping("/signup")
    public String signupForm(UserCreateForm userCreateForm) {
        return "users/userCreateForm";
    }

    @PostMapping("/signup")
    public String signup(UserCreateForm userCreateForm) {
        User user = userService.create(userCreateForm.getName(), userCreateForm.getUsername(), userCreateForm.getPassword(), userCreateForm.getEmail());

        userService.join(user);
        return "redirect:/";
    }
}
