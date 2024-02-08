package com.example.paymentservicemorningbatch.controllers;

import com.example.paymentservicemorningbatch.dtos.InitiatePaymentRequestDto;
import com.example.paymentservicemorningbatch.services.PaymentService;
import com.razorpay.RazorpayException;
import com.stripe.exception.StripeException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments")
public class PaymentController {
    private PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/")
    public String initiatePayment(@RequestBody InitiatePaymentRequestDto requestDto) throws RazorpayException, StripeException {
        return paymentService.initiatePayment(requestDto.getOrderId(),
                requestDto.getAmount(),
                requestDto.getPhoneNumber());
    }
}
