package com.example.paymentservicemorningbatch.dtos;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;

@Getter
@Setter
public class InitiatePaymentRequestDto {
    private Long orderId;
    private Long amount;
    private String phoneNumber;
}
