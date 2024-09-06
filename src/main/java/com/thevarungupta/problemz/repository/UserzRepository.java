package com.thevarungupta.problemz.repository;

import com.thevarungupta.problemz.entity.Userz;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserzRepository extends JpaRepository<Userz, UUID> {
}
