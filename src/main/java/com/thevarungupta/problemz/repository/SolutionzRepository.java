package com.thevarungupta.problemz.repository;

import com.thevarungupta.problemz.entity.Solutionz;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SolutionzRepository extends JpaRepository<Solutionz, UUID> {
}
