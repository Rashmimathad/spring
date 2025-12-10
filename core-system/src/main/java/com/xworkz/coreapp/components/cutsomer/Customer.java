package com.xworkz.coreapp.components.cutsomer;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Customer {

    @Value("1")
    private int customerId;
    @Value("Pavithra")
    private String customerName;
}
