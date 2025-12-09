package com.xworkz.coreapp.contexts.hospital;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Hospital {
    private int hospitalId;
    private String hospitalName;
}
