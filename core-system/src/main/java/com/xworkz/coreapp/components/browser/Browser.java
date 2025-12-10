package com.xworkz.coreapp.components.browser;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Browser {
    @Value("1")
    private int browserId;
    @Value("Google Chrome")
    private String browserName;
}
