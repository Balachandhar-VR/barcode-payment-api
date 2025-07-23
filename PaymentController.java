package com.example.barcodepayment;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/payment")
public class PaymentController {

    @PostMapping("/barcode")
    public String processBarcodePayment(@RequestBody PaymentRequest request) {
        return "Processed payment for barcode: " + request.getBarcode();
    }
}