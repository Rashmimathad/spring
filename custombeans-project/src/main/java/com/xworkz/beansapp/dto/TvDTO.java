package com.xworkz.beansapp.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode

public class TvDTO {

    private int tvId;
    private String brand;
    private String model;
    private int screenSizeInches;
    private String displayType;
    private boolean smartTv;
    private double price;
    private String resolution;

}
