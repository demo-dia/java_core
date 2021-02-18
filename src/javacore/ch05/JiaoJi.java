package javacore.ch05;

import java.util.ArrayList;
import java.util.List;

public class JiaoJi {
    public static void main(String[] args) {
        List<Integer> l1=new ArrayList<>();
        l1.add(1);
        List<Integer> l2=new ArrayList<>();
        l2.add(2);
        l1.retainAll(l2);
        System.out.println(l1.size());
    }
}
