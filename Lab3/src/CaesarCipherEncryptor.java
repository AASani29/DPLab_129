public class CaesarCipherEncryptor implements EncryptionAlgorithm {
    private int shift;

    public CaesarCipherEncryptor(int shift) {
        this.shift = 1;
    }

    @Override
    public byte[] encrypt(String data) {
        StringBuilder result = new StringBuilder();
        for (char c : data.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                result.append((char) ((c - base + shift) % 26 + base));
            } else {
                result.append(c);
            }
        }
        return result.toString().getBytes();
    }
}