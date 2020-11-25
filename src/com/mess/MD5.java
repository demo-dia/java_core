package com.mess;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5 {
    public static void main(String[] args) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        MessageDigest md=MessageDigest.getInstance("MD5");
        md.update("1".getBytes("UTF-8"));
        byte[] result=md.digest();
        System.out.println(new BigInteger(1,result).toString(16));

    }
}
