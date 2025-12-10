package com.xworkz.coreapp.components.trainer;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Data
@Component
public class Trainer {

    @Value("1")
    private int trainerId;
    @Value("Dev")
    private String trainerName;

}
