package com.xworkz.coreapp.components.theatre;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component


public class Theatre {

    @Value("1")
    private int theatreId;
    @Value("Geethanjali Theatre")
    private String theatreName;


}
