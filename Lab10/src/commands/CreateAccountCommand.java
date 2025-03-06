package commands;

import models.BankAccount;
import repositories.BankRepository;

public class CreateAccountCommand implements Command {
    private String accountNumber;
    private double initialDeposit;
    private BankRepository repository;

    public CreateAccountCommand(BankRepository repository, String accountNumber, double initialDeposit) {
        this.repository = repository;
        this.accountNumber = accountNumber;
        this.initialDeposit = initialDeposit;
    }

    @Override
    public void execute() {
        BankAccount account = new BankAccount(accountNumber, initialDeposit);
        repository.addAccount(account);
        System.out.println("Account " + accountNumber + " created successfully.");
    }
}
