package com.thevarungupta.problemz.utils;

import com.thevarungupta.problemz.codegen.types.Problem;
import com.thevarungupta.problemz.codegen.types.Solution;
import com.thevarungupta.problemz.codegen.types.User;
import com.thevarungupta.problemz.entity.Problemz;
import com.thevarungupta.problemz.entity.Solutionz;
import com.thevarungupta.problemz.entity.Userz;

import java.util.List;

public class GraphqlBeanMapper {

    public static User mapToGraphql(Userz original){
        var result = new User();
        result.setId(original.getId().toString());
        result.setUsername(original.getUsername());
        result.setEmail(original.getEmail());
        result.setDisplayName(original.getDisplayName());
        return result;
    }

    public static Problem mapToGraphql(Problemz original){
        var result = new Problem();
        result.setId(original.getId().toString());
        result.setTitle(original.getTitle());
        result.setContent(original.getContent());
        var tagList = List.of(original.getTags().split(","));
        result.setTags(tagList);
        return result;
    }

    public static Solution mapToGraphql(Solutionz original){
        var result = new Solution();
        result.setId(original.getId().toString());
        result.setContent(original.getContent());
        return result;
    }

}
