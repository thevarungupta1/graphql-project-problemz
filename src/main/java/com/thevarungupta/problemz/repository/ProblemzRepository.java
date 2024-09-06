package com.thevarungupta.problemz.repository;

import com.thevarungupta.problemz.entity.Problemz;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProblemzRepository extends JpaRepository<Problemz, UUID>{
}
