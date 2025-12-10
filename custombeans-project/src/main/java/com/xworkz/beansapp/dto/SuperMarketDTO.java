package com.xworkz.beansapp.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode

public class SuperMarketDTO {

    private int marketId;
    private String name;
    private String location;
    private int numberOfItems;
    private boolean homeDeliveryAvailable;
    private int employeesCount;
    private double rating;
    private int establishedYear;

}
