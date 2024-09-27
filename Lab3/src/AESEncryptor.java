import javax.crypto.Cipher;
import javax.crypto.SecretKey;

public class AESEncryptor implements EncryptionAlgorithm {
    private SecretKey secretKey;

    public AESEncryptor(SecretKey secretKey) {
        this.secretKey = secretKey;
    }

    @Override
    public byte[] encrypt(String data) throws Exception {
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        return cipher.doFinal(data.getBytes());
    }
}