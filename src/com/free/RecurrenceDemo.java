package com.free;

public class RecurrenceDemo {
    /**
     * 斐波那契数列1 1 2 3 5 8 13 21 34
     * f(n)=f(n-1)+f(n-2)    n=1,n=2  f(1)=1 f(2)=1
     * 用到递归，自己调用自己
     * 有一个临界条件，否组无限调用，死循环
     * @param a
     * @return
     */
    public static int febo(int a){
        if(a<=2)
            return 1;
        return febo(a-1)+febo(a-2);
    }

    public static void main(String[] args) {
        int b=febo(8);
        System.out.println(b);
    }
}
