import javax.crypto.Cipher;
import javax.crypto.SecretKey;

public class DESDecryptor implements DecryptionAlgorithm {
    private SecretKey secretKey;

    public DESDecryptor(SecretKey secretKey) {
        this.secretKey = secretKey;
    }

    @Override
    public String decrypt(byte[] data) throws Exception {
        Cipher cipher = Cipher.getInstance("DES");
        cipher.init(Cipher.DECRYPT_MODE, secretKey);
        return new String(cipher.doFinal(data));
    }
}