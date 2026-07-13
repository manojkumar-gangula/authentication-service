package io.github.manojkumar_gangula.authentication_service.repository;

import io.github.manojkumar_gangula.authentication_service.entity.RefreshToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RefreshTokenRepository extends JpaRepository<RefreshToken, Long> {

}
