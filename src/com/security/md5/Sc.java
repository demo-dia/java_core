package com.security.md5;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Sc {
    public static void main(String[] args) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        MessageDigest messageDigest=MessageDigest.getInstance("MD5");
        messageDigest.update("1".getBytes("UTF-8"));

        byte[] aa=messageDigest.digest();
        System.out.println(new BigInteger(1,aa).toString(16));
    }
}
