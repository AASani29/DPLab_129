package commands;

import models.Transaction;
import repositories.TransactionRepository;
import java.util.List;

public class ViewTransactionHistoryCommand implements Command {
    private String accountNumber;
    private TransactionRepository transactionRepository;

    public ViewTransactionHistoryCommand(TransactionRepository transactionRepository, String accountNumber) {
        this.transactionRepository = transactionRepository;
        this.accountNumber = accountNumber;
    }

    @Override
    public void execute() {
        List<Transaction> transactions = transactionRepository.getTransactionsByAccount(accountNumber);
        if (transactions.isEmpty()) {
            System.out.println("No transactions found for account " + accountNumber);
        } else {
            System.out.println("Transaction History for Account " + accountNumber + ":");
            for (Transaction transaction : transactions) {
                System.out.println(transaction);
            }
        }
    }
}
