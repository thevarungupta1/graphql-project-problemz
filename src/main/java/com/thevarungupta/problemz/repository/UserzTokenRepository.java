package com.thevarungupta.problemz.repository;

import com.thevarungupta.problemz.entity.UserzToken;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserzTokenRepository extends JpaRepository<UserzToken, UUID> {
}
