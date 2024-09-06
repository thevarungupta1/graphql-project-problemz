package com.thevarungupta.problemz.service.query;

import com.thevarungupta.problemz.codegen.types.Problem;
import com.thevarungupta.problemz.entity.Problemz;
import com.thevarungupta.problemz.entity.Userz;
import com.thevarungupta.problemz.repository.ProblemzRepository;
import com.thevarungupta.problemz.repository.UserzRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ProblemzQueryService {

    @Autowired
    private ProblemzRepository problemzRepository;

    @Autowired
    private UserzRepository userzRepository;

    public List<Problemz> getProblemLatestList() {
        return problemzRepository.findAll();
    }

    public void sampleData(){
        Userz userz = new Userz();
        userz.setUsername("user1");
        userz.setEmail("user1@gmail.com");
        userz.setDisplayName("User 1");
        userz.setActive(true);
        userz.setId(UUID.randomUUID());
        userzRepository.save(userz);

        Problemz problemz = new Problemz();
        problemz.setId(UUID.randomUUID());
        problemz.setTitle("Problem 1");
        problemz.setContent("Problem 1 content");
        problemz.setTags("tag1, tag2");
        problemz.setCreatedBy(userz);
        problemzRepository.save(problemz);

    }

}
