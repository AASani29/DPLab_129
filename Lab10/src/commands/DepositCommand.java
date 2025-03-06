package commands;

import models.BankAccount;
import models.Transaction;
import repositories.BankRepository;
import repositories.TransactionRepository;

import java.util.UUID;

public class DepositCommand implements Command {
    private String accountNumber;
    private double amount;
    private BankRepository repository;
    private TransactionRepository transactionRepository;

    public DepositCommand(BankRepository repository, String accountNumber, double amount) {
        this.repository = repository;
        this.transactionRepository = transactionRepository;
        this.accountNumber = accountNumber;
        this.amount = amount;
    }

    @Override
    public void execute() {
        BankAccount account = repository.getAccount(accountNumber);
        if (account != null) {
            account.deposit(amount);
            Transaction transaction = new Transaction(UUID.randomUUID().toString(), accountNumber, "Deposit", amount);
            transactionRepository.addTransaction(transaction);
            System.out.println("Deposited $" + amount + " into account " + accountNumber);
        } else {
            System.out.println("Account not found!");
        }
    }
}
