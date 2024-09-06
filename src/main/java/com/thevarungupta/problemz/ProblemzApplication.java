package com.thevarungupta.problemz;

import com.thevarungupta.problemz.entity.Userz;
import com.thevarungupta.problemz.repository.UserzRepository;
import com.thevarungupta.problemz.service.query.ProblemzQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.UUID;

@SpringBootApplication
public class ProblemzApplication {


	public static void main(String[] args) {
		SpringApplication.run(ProblemzApplication.class, args);
	}

}
