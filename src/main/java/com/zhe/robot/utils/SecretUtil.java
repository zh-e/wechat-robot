package com.zhe.robot.utils;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SecretUtil {

    public static String sha1(String text) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA");
            byte[] digest = messageDigest.digest(text.getBytes());
            return new BigInteger(1, digest).toString(16);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

}
