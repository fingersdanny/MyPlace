package myplace.core.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public interface UserRepository extends CrudRepository<User, Long> {
    User save(User member);
    Optional<User> findById(Long id);
    Optional<User> findByUsername(String username);
}
