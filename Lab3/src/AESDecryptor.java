import javax.crypto.Cipher;
import javax.crypto.SecretKey;

public class AESDecryptor implements DecryptionAlgorithm {
    private SecretKey secretKey;

    public AESDecryptor(SecretKey secretKey) {
        this.secretKey = secretKey;
    }

    @Override
    public String decrypt(byte[] data) throws Exception {
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.DECRYPT_MODE, secretKey);
        return new String(cipher.doFinal(data));
    }
}