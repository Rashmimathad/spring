package com.xworkz.coreapp.components.grocerystore;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component

public class GroceryStore {
    @Value("1")
    private int groceryStoreId;
    @Value("More")
    private String groceryStoreName;

}
