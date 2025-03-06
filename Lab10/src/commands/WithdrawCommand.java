package commands;

import models.BankAccount;
import repositories.BankRepository;

public class WithdrawCommand implements Command {
    private String accountNumber;
    private double amount;
    private BankRepository repository;

    public WithdrawCommand(BankRepository repository, String accountNumber, double amount) {
        this.repository = repository;
        this.accountNumber = accountNumber;
        this.amount = amount;
    }

    @Override
    public void execute() {
        BankAccount account = repository.getAccount(accountNumber);
        if (account != null) {
            if (account.withdraw(amount)) {
                System.out.println("Withdrew $" + amount + " from account " + accountNumber);
            } else {
                System.out.println("Insufficient funds.");
            }
        } else {
            System.out.println("Account not found!");
        }
    }
}
