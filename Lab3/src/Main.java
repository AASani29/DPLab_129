import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        EncryptionService encryptionService = new EncryptionService();
        DecryptionService decryptionService = new DecryptionService();

        System.out.println("Select Encryption Algorithm:");
        System.out.println("1. AES");
        System.out.println("2. DES");
        System.out.println("3. Caesar Cipher");

        int choice = scanner.nextInt();
        scanner.nextLine(); // consume newline

        switch (choice) {
            case 1:
                SecretKey aesKey = KeyGenerator.getInstance("AES").generateKey();
                encryptionService.setAlgorithm(new AESEncryptor(aesKey));
                decryptionService.setAlgorithm(new AESDecryptor(aesKey));
                break;
            case 2:
                SecretKey desKey = KeyGenerator.getInstance("DES").generateKey();
                encryptionService.setAlgorithm(new DESEncryptor(desKey));
                decryptionService.setAlgorithm(new DESDecryptor(desKey));
                break;
            case 3:

                int shift = 1;
                encryptionService.setAlgorithm(new CaesarCipherEncryptor(shift));
                decryptionService.setAlgorithm(new CaesarCipherDecryptor(shift));
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }

        System.out.println("Enter file path to encrypt:");
        String inputFilePath = scanner.nextLine();
        System.out.println("Enter output file path for encrypted data:");
        String outputFilePath = scanner.nextLine();

        encryptionService.encryptFile(inputFilePath, outputFilePath);

        System.out.println("Enter file path to decrypt:");
        String encryptedFilePath = scanner.nextLine();
        System.out.println("Enter output file path for decrypted data:");
        String decryptedOutputFilePath = scanner.nextLine();

        decryptionService.decryptFile(encryptedFilePath, decryptedOutputFilePath);
    }
}
