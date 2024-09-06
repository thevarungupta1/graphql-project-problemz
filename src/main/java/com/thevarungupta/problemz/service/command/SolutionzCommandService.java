package com.thevarungupta.problemz.service.command;

import com.thevarungupta.problemz.entity.Solutionz;
import com.thevarungupta.problemz.repository.SolutionzRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SolutionzCommandService {

    @Autowired
    private SolutionzRepository solutionzRepository;

    public Solutionz createSolutionz(Solutionz solutionz){
        return solutionzRepository.save(solutionz);
    }
}
