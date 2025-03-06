package commands;

import models.BankAccount;
import models.Transaction;
import repositories.BankRepository;
import repositories.TransactionRepository;

import java.util.UUID;

public class TransferCommand implements Command {
    private String senderAccount;
    private String receiverAccount;
    private double amount;
    private BankRepository repository;
    private TransactionRepository transactionRepository;

    public TransferCommand(BankRepository repository, TransactionRepository transactionRepository,
                           String senderAccount, String receiverAccount, double amount) {
        this.repository = repository;
        this.transactionRepository = transactionRepository;
        this.senderAccount = senderAccount;
        this.receiverAccount = receiverAccount;
        this.amount = amount;
    }

    @Override
    public void execute() {
        BankAccount sender = repository.getAccount(senderAccount);
        BankAccount receiver = repository.getAccount(receiverAccount);

        if (sender == null || receiver == null) {
            System.out.println("Invalid sender or receiver account number.");
            return;
        }

        if (sender.withdraw(amount)) {
            receiver.deposit(amount);

            // Create transaction records for both accounts
            Transaction senderTransaction = new Transaction(UUID.randomUUID().toString(), senderAccount, "Transfer Sent", -amount);
            Transaction receiverTransaction = new Transaction(UUID.randomUUID().toString(), receiverAccount, "Transfer Received", amount);

            transactionRepository.addTransaction(senderTransaction);
            transactionRepository.addTransaction(receiverTransaction);

            System.out.println("Successfully transferred $" + amount + " from " + senderAccount + " to " + receiverAccount);
        } else {
            System.out.println("Transfer failed: Insufficient funds.");
        }
    }
}
