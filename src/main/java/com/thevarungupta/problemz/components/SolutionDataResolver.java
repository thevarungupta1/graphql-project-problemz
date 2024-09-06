package com.thevarungupta.problemz.components;

import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import com.netflix.graphql.dgs.InputArgument;
import com.thevarungupta.problemz.codegen.DgsConstants;
import com.thevarungupta.problemz.codegen.types.SolutionCreateInput;
import com.thevarungupta.problemz.codegen.types.SolutionResponse;
import org.springframework.web.bind.annotation.RequestHeader;

@DgsComponent
public class SolutionDataResolver {

    @DgsData(parentType = DgsConstants.MUTATION.TYPE_NAME, field = DgsConstants.MUTATION.SolutionCreate)
    public SolutionResponse createSolution(
            @RequestHeader(name = "authToken", required = true) String authToken,
            @InputArgument(name = "solution")SolutionCreateInput solutionCreateInput
            ) {
        return null;
    }



}
