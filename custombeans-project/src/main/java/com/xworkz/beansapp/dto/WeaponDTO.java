package com.xworkz.beansapp.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode

public class WeaponDTO {

    private int weaponId;
    private String weaponName;
    private String weaponType;
    private String weaponMaterial;
    private String countryOrigin;
    private double weight;
    private double price;
    private boolean isLicensed;

}
