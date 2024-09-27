import javax.crypto.Cipher;
import javax.crypto.SecretKey;

public class DESEncryptor implements EncryptionAlgorithm {
    private SecretKey secretKey;

    public DESEncryptor(SecretKey secretKey) {
        this.secretKey = secretKey;
    }

    @Override
    public byte[] encrypt(String data) throws Exception {
        Cipher cipher = Cipher.getInstance("DES");
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        return cipher.doFinal(data.getBytes());
    }
}
