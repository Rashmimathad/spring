package com.xworkz.coreapp.components.tv;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Tv {

    @Value("1")
    private int tvId;
    @Value("Samsung")
    private String tvBrandName;

}
