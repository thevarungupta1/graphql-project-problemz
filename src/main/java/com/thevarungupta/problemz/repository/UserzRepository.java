package com.thevarungupta.problemz.repository;

import com.thevarungupta.problemz.codegen.types.User;
import com.thevarungupta.problemz.entity.Userz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;
import java.util.UUID;

public interface UserzRepository extends JpaRepository<Userz, UUID> {

    Optional<Userz> findByUsernameIgnoreCase(String username);

    @Query(value = "SELECT FROM users u INNER JOIN users_tokens " +
            "ut ON u.id = ut.user_id WHERE ut.auth_token = :authToken " +
            "and ut.expiration_timestamp > creation_timestamp",
    nativeQuery = true)
    Optional<Userz> findUserByToken(String authToken);

}
