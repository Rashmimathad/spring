package com.xworkz.beansapp.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode

public class MovieDTO {

    private int movieId;
    private String movieName;
    private String directorName;
    private String genre;
    private String duration;
    private String language;
    private int releaseYear;
    private double movieRating;

}
