package myplace.server.member;

import java.util.Date;

public class Member {
    private Long id;
    private String username;
    private String name;
    private String email;
    private String password;
    private Date created_at;

    public Member(String username, String name, String email, String password) {
        this.username = username;
        this.name = name;
        this.email = email;
        this.password = password;
    }
}
