package com.xworkz.beansapp.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode

public class RouterDTO {

    private int routerId;
    private String brand;
    private int speedMbps;
    private int antennas;
    private boolean dualBand;
    private double price;
    private String frequency;
    private boolean meshSupport;

}
