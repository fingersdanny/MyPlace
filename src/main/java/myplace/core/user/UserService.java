package myplace.core.user;

import java.util.Optional;

public interface UserService {
    void join(User user);

    Optional<User> findUser(Long id);

    public User create(String name, String username, String email, String password);
}
