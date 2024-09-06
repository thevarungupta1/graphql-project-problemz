package com.thevarungupta.problemz.components;

import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import com.netflix.graphql.dgs.InputArgument;
import com.thevarungupta.problemz.codegen.DgsConstants;
import com.thevarungupta.problemz.codegen.types.Problem;
import com.thevarungupta.problemz.codegen.types.ProblemCreateInput;
import com.thevarungupta.problemz.codegen.types.ProblemResponse;
import com.thevarungupta.problemz.entity.Problemz;
import com.thevarungupta.problemz.service.query.ProblemzQueryService;
import com.thevarungupta.problemz.utils.GraphqlBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestHeader;

import java.util.List;
import java.util.stream.Collectors;

@DgsComponent
public class ProblemDataResolver {

    @Autowired
    private ProblemzQueryService problemzQueryService;

    @DgsData(parentType = DgsConstants.QUERY_TYPE, field = DgsConstants.QUERY.ProblemLatestList)
    public List<Problem> getProblemLatestList() {

        return problemzQueryService.getProblemLatestList()
                .stream()
                .map(GraphqlBeanMapper::mapToGraphql)
                .collect(Collectors.toList());
    }

    @DgsData(parentType = DgsConstants.QUERY_TYPE, field = DgsConstants.QUERY.ProblemDetail)
    public Problem getProblemDetail(@InputArgument(name = "id") String problemId) {
        return null;
    }

    @DgsData(parentType = DgsConstants.MUTATION_TYPE, field = DgsConstants.MUTATION.ProblemCreate)
    public ProblemResponse createProblem(
            @RequestHeader(name = "authToken") String authToken,
            @InputArgument(name = "problem") ProblemCreateInput problemCreateInput) {
        return null;
    }

}
