package pl.akademiaspecjalistowit.paymentservice.payment;

import java.math.BigDecimal;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class PaymentRequestDto {
    private UUID packageId;
    private BigDecimal amount;
}
