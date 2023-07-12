package Helper;

import javax.swing.*;
import java.awt.*;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class PasswordEncoder {

    public static String encodePassword(String password) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] hash = md.digest(password.getBytes(StandardCharsets.UTF_8));
        StringBuilder sb = new StringBuilder();
        for (byte b : hash) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }


//    public static void main(String[] args) {
//        try {
//            String password = "myPassword123";
//            String hashedPassword = encodePassword(password);
//            String cc=encodePassword(password);
//            System.out.println("Original password: " + password);
//            System.out.println("Hashed password: " + hashedPassword);
//            System.out.println("cc: " + cc);
//            boolean isMatch = verifyPassword(password, hashedPassword);
//            boolean isMa = verifyPassword(password, cc);
//            System.out.println("Is password match? " + isMatch);
//            System.out.println("Is password match? " + isMatch);
//        } catch (NoSuchAlgorithmException e) {
//            e.printStackTrace();
//        }
//    }
}