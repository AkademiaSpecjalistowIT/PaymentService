package pl.akademiaspecjalistowit.paymentservice.payment.service;

import java.util.UUID;
import pl.akademiaspecjalistowit.paymentservice.payment.PaymentRequestDto;

public interface PaymentService {
    void confirmPayment(UUID packageId, UUID userId);

    void registerPayment(PaymentRequestDto paymentRequestDto);
}
