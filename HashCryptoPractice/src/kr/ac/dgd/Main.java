package kr.ac.dgd;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;

public class Main {
    public static void main(String[] args){
        // 회원가입 할 때 비밀번호 저장
        String password = "dddd";
        String salt = String.valueOf(UUID.randomUUID()); // 무작위문자열 : 회원가입 할 때 생성되어 DB의 salt 컬럼에 insert된다.
        String saltPassword = salt+password;
        String encodedPassword = "";

        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-1");
            digest.reset();
            digest.update(saltPassword.getBytes(StandardCharsets.UTF_8));
            encodedPassword = String.format("%040x", new BigInteger(1, digest.digest()));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        System.out.println("password = " + password);
        System.out.println("salt = " + salt);
        System.out.println("salt+Password = " + saltPassword);
        System.out.println("encodedPassword = " + encodedPassword);
        System.out.println("saltLength = " + salt.length());

    }
}
