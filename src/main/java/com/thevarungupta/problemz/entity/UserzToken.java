package com.thevarungupta.problemz.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(
        name = "users_tokens"
)
public class UserzToken {
    @Id
    private UUID userId;
    private String authToken;

    @CreationTimestamp
    private LocalDateTime creationTimestamp;

    private LocalDateTime expirationTimestamp;
}
