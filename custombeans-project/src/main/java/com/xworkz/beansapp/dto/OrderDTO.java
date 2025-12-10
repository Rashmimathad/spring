package com.xworkz.beansapp.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode

public class OrderDTO {

    private int orderId;
    private String orderName;
    private String orderDate;
    private Double totalAmount;
    private String orderStatus;
    private String paymentMode;
    private String deliveryDate;
    private String remarks;


}
