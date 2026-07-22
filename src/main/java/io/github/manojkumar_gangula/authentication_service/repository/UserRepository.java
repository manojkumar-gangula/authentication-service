package io.github.manojkumar_gangula.authentication_service.repository;

import io.github.manojkumar_gangula.authentication_service.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByMailId(String username);
}
