package com.xworkz.beansapp.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class CustomerDTO {

    private int customerId;
    private String customerFullName;
    private String customerEmail;
    private int age;
    private long contactNo;
    private String address;
    private String city;
    private String state;

}
