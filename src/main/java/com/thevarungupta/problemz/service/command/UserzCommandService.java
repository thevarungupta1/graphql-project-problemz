package com.thevarungupta.problemz.service.command;

import com.thevarungupta.problemz.entity.UserzToken;
import com.thevarungupta.problemz.repository.UserzRepository;
import com.thevarungupta.problemz.repository.UserzTokenRepository;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
public class UserzCommandService {

    @Autowired
    private UserzRepository userzRepository;

    @Autowired
    private UserzTokenRepository userzTokenRepository;

    public UserzToken login(String username, String password){
        var userQueryResult = userzRepository.findByUsernameIgnoreCase(username);
        if(userQueryResult.isEmpty()){
            throw new IllegalArgumentException("Invalid Credentials");
        }

        var randomAuthToken = RandomStringUtils.randomAlphanumeric(40);
        return refreshToken(userQueryResult.get().getId(), randomAuthToken);
    }

    private UserzToken refreshToken(UUID userId, String authToken){
        var userToken = new UserzToken();
        userToken.setUserId(userId);
        userToken.setAuthToken(authToken);

        var now = LocalDateTime.now();
        userToken.setCreationTimestamp(now);
        userToken.setExpirationTimestamp(now.plusHours(2));
        return userzTokenRepository.save(userToken);
    }

}
