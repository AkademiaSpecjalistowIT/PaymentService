package pl.akademiaspecjalistowit.paymentservice.payment;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.UUID;
import pl.akademiaspecjalistowit.paymentservice.payment.service.PaymentService;

@RestController
@RequestMapping("/payment")
@AllArgsConstructor
public class PaymentController {

    private PaymentService paymentService;

    @PostMapping("/confirm/{packageId}/{userId}")
    public void confirmPayment(@PathVariable UUID packageId,
                               @PathVariable UUID userId) {
        paymentService.confirmPayment(packageId, userId);
    }

    @PostMapping("/register")
    public void registerPayment(@RequestBody PaymentRequestDto paymentRequest) {
        paymentService.registerPayment(paymentRequest);
    }
}
