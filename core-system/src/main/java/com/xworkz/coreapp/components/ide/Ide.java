package com.xworkz.coreapp.components.ide;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Data
@Component

public class Ide {

    @Value("1")
    private int ideId;
    @Value("IntelliJ")
    private String ideName;
}
