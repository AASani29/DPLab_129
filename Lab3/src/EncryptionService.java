import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class EncryptionService {
    private EncryptionAlgorithm algorithm;

    public void setAlgorithm(EncryptionAlgorithm algorithm) {
        this.algorithm = algorithm;
    }

    public void encryptFile(String inputFilePath, String outputFilePath) throws Exception {
        Path inputPath = Paths.get(inputFilePath);
        String data = Files.readString(inputPath);

        byte[] encryptedData = algorithm.encrypt(data);
        Files.write(Paths.get(outputFilePath), encryptedData);
        System.out.println("File encrypted successfully.");
    }
}