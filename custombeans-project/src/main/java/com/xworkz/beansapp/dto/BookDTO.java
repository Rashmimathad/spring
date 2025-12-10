package com.xworkz.beansapp.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode

public class BookDTO {

    private int bookId;
    private String bookName;
    private String bookAuthor;
    private String genre;
    private int publicationYear;
    private double bookPrice;
    private String language;
    private String publisherName;

}
