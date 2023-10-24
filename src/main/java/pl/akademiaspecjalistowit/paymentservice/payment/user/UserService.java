package pl.akademiaspecjalistowit.paymentservice.payment.user;

import java.util.UUID;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    public boolean debitCustomerAccount(UUID transactionId, UUID userId) {
        return true;
    }
}
