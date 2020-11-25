package com.security.md5;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        MessageDigest md= null;
        try {
            // 创建一个MessageDigest实例:
            md = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        // 反复调用update输入数据:
        md.update("1".getBytes("UTF-8"));
        byte[] result=md.digest();// 16 bytes: fc5e038d38a57032085441e7fe7010b0
        System.out.println(new BigInteger(1,result).toString(16));


    }
}
