package myplace.core.member;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SpringDataJpaRepository extends JpaRepository<Member, Long>, MemberRepository{
    @Override
    Optional<Member> findByUsername(String Username);
}
