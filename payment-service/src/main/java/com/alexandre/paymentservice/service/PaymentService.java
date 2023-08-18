package com.alexandre.paymentservice.service;

import com.alexandre.paymentservice.model.Payment;

public interface PaymentService {

    void sendPayment(Payment payment);
}
