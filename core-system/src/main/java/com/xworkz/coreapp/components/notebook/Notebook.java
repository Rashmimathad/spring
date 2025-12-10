package com.xworkz.coreapp.components.notebook;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Notebook {

    @Value("1")
    private int notebookId;
    @Value("Classmate")
    private String notebookName;
}
