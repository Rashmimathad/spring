package com.xworkz.coreapp.components.coffeeshop;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component

public class CoffeeShop {

    @Value("1")
    private int shopId;
    @Value("Cafe Day")
    private String coffeeShopName;
}
