package myplace.core.controller;

import lombok.RequiredArgsConstructor;
import myplace.core.user.UserCreateForm;
import myplace.core.user.UserService;
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
        userService.create(userCreateForm.getName(), userCreateForm.getUsername(), userCreateForm.getPassword(), userCreateForm.getEmail());

        return "redirect:/";
    }
}
