package com.xworkz.beansapp.dto;

import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class InvoiceDTO {
        private int invoiceId;
        private int orderId;
        private String customerName;
        private double totalAmount;
        private double tax;
        private String invoiceDate;
        private String dueDate;
        private String status;
}
