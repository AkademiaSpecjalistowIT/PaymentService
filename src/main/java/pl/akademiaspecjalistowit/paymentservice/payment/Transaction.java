package pl.akademiaspecjalistowit.paymentservice.payment;

import java.math.BigDecimal;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor

public class Transaction {

    private UUID packageId;
    private UUID transactionId;
    private TransactionStatus transactionStatus;
    private BigDecimal amount;

    public Transaction(UUID packageId, UUID transactionId, BigDecimal amount) {
        this.packageId = packageId;
        this.transactionId = transactionId;
        this.amount = amount;
        this.transactionStatus = TransactionStatus.INITIATED;
    }

    public void finalizeTransaction() {
        this.transactionStatus = TransactionStatus.FINISHED;
    }

}
