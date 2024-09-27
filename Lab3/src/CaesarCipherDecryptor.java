public class CaesarCipherDecryptor implements DecryptionAlgorithm {
    private int shift;

    public CaesarCipherDecryptor(int shift) {
        this.shift = 1;
    }

    @Override
    public String decrypt(byte[] data) {
        StringBuilder result = new StringBuilder();
        for (char c : new String(data).toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                result.append((char) ((c - base - shift + 26) % 26 + base));
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }
}