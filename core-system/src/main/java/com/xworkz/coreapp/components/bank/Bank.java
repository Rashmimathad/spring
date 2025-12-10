package com.xworkz.coreapp.components.bank;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Bank {

    @Value("1")
    private int bankId;
    @Value("SBI Bank")
    private String bankName;

}
