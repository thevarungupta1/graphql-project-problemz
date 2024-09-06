package com.thevarungupta.problemz.components;

import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import com.netflix.graphql.dgs.InputArgument;
import com.thevarungupta.problemz.codegen.DgsConstants;
import com.thevarungupta.problemz.codegen.types.User;
import com.thevarungupta.problemz.codegen.types.UserCreateInput;
import com.thevarungupta.problemz.codegen.types.UserLoginInput;
import com.thevarungupta.problemz.codegen.types.UserResponse;
import org.springframework.web.bind.annotation.RequestHeader;

@DgsComponent
public class UserDataResolver {

    @DgsData(parentType = DgsConstants.QUERY_TYPE, field = DgsConstants.QUERY.Me)
    public User accountInfo(@RequestHeader(name = "authToken", required = true) String authToken) {
        return null;
    }

    @DgsData(parentType = DgsConstants.MUTATION_TYPE, field = DgsConstants.MUTATION.CreateUser)
    public UserResponse createUser(@InputArgument(name = "user") UserCreateInput userCreateInput) {
        return null;
    }

    @DgsData(parentType = DgsConstants.MUTATION_TYPE, field = DgsConstants.MUTATION.UserLogin)
    public UserResponse userLogin(@InputArgument(name = "user") UserLoginInput userLoginInput) {
        return null;
    }

}
