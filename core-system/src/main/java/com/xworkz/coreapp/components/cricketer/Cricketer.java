package com.xworkz.coreapp.components.cricketer;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Data
@Component

public class Cricketer {

    @Value("1")
    private int cricketerId;
    @Value("M S Dhoni")
    private String cricketerName;

}
