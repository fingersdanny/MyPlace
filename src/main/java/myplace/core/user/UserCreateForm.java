package myplace.core.user;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
public class UserCreateForm {
    @Size(min = 3, max = 25)
    @NotEmpty(message = "이름은 필수항목입니다.")
    private String name;

    @NotEmpty(message = "닉네임은 필수항목입니다.")
    private String username;
    @NotEmpty(message = "비밀번호는 필수항목입니다.")
    private String password;

    @NotEmpty(message = "이메일은 필수항목입니다.")
    private String email;
}
