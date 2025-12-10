package com.xworkz.coreapp.components.headSet;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class HeadSet {

    @Value("1")
    private int headSetId;
    @Value("Boat")
    private String headSetName;
}
