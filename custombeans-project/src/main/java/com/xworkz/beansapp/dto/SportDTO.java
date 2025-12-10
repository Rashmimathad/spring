package com.xworkz.beansapp.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode

public class SportDTO {

    private int sportId;
    private String sportName;
    private String sportType;
    private int noOfPlayers;
    private String originCountry;
    private String equipment;
    private  String popularityLevel;
    private boolean isOlympicSport;
}
