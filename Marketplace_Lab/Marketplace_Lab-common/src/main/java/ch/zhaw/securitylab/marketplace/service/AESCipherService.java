package ch.zhaw.securitylab.marketplace.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;

public class AESCipherService {

    private final static String CIPHER_ALGORITHM = "AES";
    private final static String CIPHER_ALGORITHM_FULL = "AES/CBC/PKCS5Padding";
    private final static String PRNG_ALGORITHM = "SHA1PRNG";
    private final static int BLOCKSIZE = 16;
    private static SecretKeySpec keySpec;

    // Static initializer to read key from file system and set keyspec
    {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(Thread.currentThread().
                    getContextClassLoader().getResourceAsStream("db-key")));
            String hexKey = reader.readLine();
            byte[] byteKey = DatatypeConverter.parseHexBinary(hexKey);
            keySpec = new SecretKeySpec(byteKey, CIPHER_ALGORITHM);
        } catch (IOException e) {
            // Do nothing
        }
    }
    
    /**
     * Encrypts the plaintext with AES in CBC mode, selecting a random IV.
     * 
     * @param plaintext The plaintext to encrypt
     * @return The IV and ciphertext (concatenated)
     */
    public byte[] encrypt(byte[] plaintext) {
        
        // Implement
        
        return null;
    }

    /**
     * Decrypts iv_ciphertext with AES in CBC mode.
     * 
     * @param iv_ciphertext The IV and ciphertext (concatenated)
     * @return The plaintext
     */
    public byte[] decrypt(byte[] iv_ciphertext) {
        
        // Implement
        
        return null;
    }
}
