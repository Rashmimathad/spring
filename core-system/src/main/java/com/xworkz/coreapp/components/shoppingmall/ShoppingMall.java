package com.xworkz.coreapp.components.shoppingmall;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component

public class ShoppingMall {

    @Value("1")
    private int mallId;
    @Value("Orion")
    private String shoppingMallName;
}
