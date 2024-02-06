package com.example.paymentservicemorningbatch;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/{input}")
    public String testAPI(@PathVariable int input) {
        return "Hello" + input;
    }
}
