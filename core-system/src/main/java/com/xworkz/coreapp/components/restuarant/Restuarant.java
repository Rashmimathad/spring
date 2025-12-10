package com.xworkz.coreapp.components.restuarant;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component

public class Restuarant {

    @Value("1")
    private int restuarantId;
    @Value("Roots")
    private String restuarantName;

}
