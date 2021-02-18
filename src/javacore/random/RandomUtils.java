package javacore.random;

import java.util.Random;

/**
 * 产生随机字符0-9 [0,10),包括0不包括10；即0-9十个数中的任意一个数。都是一位数字
 */
public class RandomUtils {

    public static void main(String[] args) {
        System.out.println( random(5));
    }
    public static String random(int n) {
        String code = "";
        Random random = new Random();
        /**
         * 这里循环5次，字符串拼接
         */
        for (int j = 0; j < n; j++) {
            code = code + random.nextInt(10);
        }
        return code;
    }
}
