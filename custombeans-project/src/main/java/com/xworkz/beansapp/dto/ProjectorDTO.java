package com.xworkz.beansapp.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode

public class ProjectorDTO {

    private int projectorId;
    private String brand;
    private String resolution;
    private int brightnessLumens;
    private double price;
    private boolean smartProjector;
    private String color;
    private String projectionType;

}
