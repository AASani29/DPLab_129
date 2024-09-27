import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DecryptionService {
    private DecryptionAlgorithm algorithm;

    public void setAlgorithm(DecryptionAlgorithm algorithm) {
        this.algorithm = algorithm;
    }

    public void decryptFile(String inputFilePath, String outputFilePath) throws Exception {
        byte[] encryptedData = Files.readAllBytes(Paths.get(inputFilePath));

        String decryptedData = algorithm.decrypt(encryptedData);
        Files.write(Paths.get(outputFilePath), decryptedData.getBytes());
        System.out.println("File decrypted successfully.");
    }
}
