package com.example.paymentservicemorningbatch.controllers;

import com.stripe.model.Event;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/stripeWebhook")
public class StripeWebhookController {

    @PostMapping("/")
    public void webhookRequest(@RequestBody Event event) {
        if (event.getType().equals("payment_link.created")) {
            //Update the payment link in the DB.
        } else if (event.getType().equals("payment_status.change")) {
            //Go to payments table and change the payment_status

        }

        System.out.println("Stripe Webhook Triggered");
    }
}
