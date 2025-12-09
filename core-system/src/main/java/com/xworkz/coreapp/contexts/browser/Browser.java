package com.xworkz.coreapp.contexts.browser;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Browser {
    private int browserId;
    private String browserName;
}
