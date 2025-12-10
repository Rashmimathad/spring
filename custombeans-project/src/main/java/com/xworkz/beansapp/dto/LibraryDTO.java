package com.xworkz.beansapp.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode

public class LibraryDTO {

    private int libraryId;
    private String name;
    private String location;
    private int totalBooks;
    private boolean digitalAccessAvailable;
    private int seatingCapacity;
    private int floors;
    private double rating;

}
