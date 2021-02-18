package javacore.ch05.string_usage;


public class SplitDemo {
    public static void main(String[] args) {
        String a="12:30-13:30";
        /**
         * split方法使用。分割字符串
         */
        String[] aa=a.split("-");//12:30   13:30
        System.out.println(aa[0]+"  "+aa[1]);
    }
}
