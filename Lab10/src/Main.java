

import commands.*;
import repositories.BankRepository;
import repositories.TransactionRepository;
import services.CommandInvoker;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankRepository repository = new BankRepository();
        CommandInvoker invoker = new CommandInvoker();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Create Account\n2. Deposit\n3. Withdraw\n4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Account Number: ");
                    String accNum = scanner.next();
                    System.out.print("Enter Initial Deposit: ");
                    double initDeposit = scanner.nextDouble();
                    invoker.executeCommand(new CreateAccountCommand(repository, accNum, initDeposit));
                    break;
                case 2:
                    System.out.print("Enter Account Number: ");
                    accNum = scanner.next();
                    System.out.print("Enter Deposit Amount: ");
                    double depositAmount = scanner.nextDouble();
                    invoker.executeCommand(new DepositCommand(repository, accNum, depositAmount));
                    break;
                case 3:
                    System.out.print("Enter Account Number: ");
                    accNum = scanner.next();
                    System.out.print("Enter Withdrawal Amount: ");
                    double withdrawAmount = scanner.nextDouble();
                    invoker.executeCommand(new WithdrawCommand(repository, accNum, withdrawAmount));
                    break;

                case 4:
                    System.out.print("Enter Sender Account Number: ");
                    String senderAcc = scanner.next();
                    System.out.print("Enter Receiver Account Number: ");
                    String receiverAcc = scanner.next();
                    System.out.print("Enter Transfer Amount: ");
                    double transferAmount = scanner.nextDouble();

                    TransactionRepository transactionRepository = new TransactionRepository();
                    invoker.executeCommand(new TransferCommand(repository, transactionRepository, senderAcc, receiverAcc, transferAmount));
                    break;


                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
