package com.xworkz.coreapp.components.clothestore;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component

public class ClotheStore {

    @Value("1")
    private int storeId;
    @Value("Flying Machine")
    private String storeName;
}
