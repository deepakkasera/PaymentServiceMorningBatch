package com.example.paymentservicemorningbatch.paymentgateways;

import com.razorpay.RazorpayException;

public interface PaymentGateway {
    String generatePaymentLink(Long orderId, Long amount, String phoneNumber) throws RazorpayException;
}
