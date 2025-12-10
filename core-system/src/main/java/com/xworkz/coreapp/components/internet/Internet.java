package com.xworkz.coreapp.components.internet;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Internet {
    @Value("1")
    private int internetId;
    @Value("Airtel")
    private String internetName;
}
