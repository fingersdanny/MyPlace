package myplace.core.member;

import lombok.Data;

@Data
public class Member {
    private Long id;
    private String name;
    private String username;
    private String password;
    private String email;
}
