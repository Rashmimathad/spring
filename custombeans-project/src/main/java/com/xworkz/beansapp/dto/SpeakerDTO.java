package com.xworkz.beansapp.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode

public class SpeakerDTO {

    private int speakerId;
    private String brand;
    private int powerWatts;
    private boolean bluetooth;
    private double price;
    private int batteryHours;
    private String color;
    private String type;

}
