package com.xworkz.coreapp.contexts.grocerystore;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component

public class GroceryStore {

    private int groceryStoreId;
    private String groceryStoreName;

}
