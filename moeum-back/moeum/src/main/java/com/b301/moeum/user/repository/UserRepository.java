package com.b301.moeum.user.repository;

import com.b301.moeum.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {

    Optional<User> findByUuidAndResignIsNull(UUID uuid);

    Optional<User> findByEmail(String email);
}
