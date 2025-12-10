package com.xworkz.coreapp.components.framework;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component

public class Framework {

    @Value("1")
    private int frameworkId;
    @Value("Spring")
    private String frameWorkName;
}
