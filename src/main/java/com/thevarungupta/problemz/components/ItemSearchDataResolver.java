package com.thevarungupta.problemz.components;

import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import com.netflix.graphql.dgs.InputArgument;
import com.thevarungupta.problemz.codegen.DgsConstants;
import com.thevarungupta.problemz.codegen.types.SearchItemFilter;
import com.thevarungupta.problemz.codegen.types.SearchableItem;

import java.util.List;

@DgsComponent
public class ItemSearchDataResolver {

    @DgsData(parentType = DgsConstants.QUERY_TYPE, field = DgsConstants.QUERY.ItemSearch)
    public List<SearchableItem> searchItems(
            @InputArgument(name = "filter", collectionType = SearchItemFilter.class) SearchItemFilter filter
    ){
        return null;
    }
}
