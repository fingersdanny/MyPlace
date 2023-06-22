package myplace.core.user;

import java.util.Optional;

public interface UserRepository {
    User save(User member);
    Optional<User> findById(Long id);
    Optional<User> findByUsername(String username);
}
