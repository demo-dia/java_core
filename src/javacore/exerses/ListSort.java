package javacore.exerses;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSort {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        /*list.add(new Integer(5));
        list.add(new Integer(13));
        list.add(new Integer(4));
        list.add(new Integer(9));*/
        list.add(5);
        list.add(13);
        list.add(4);
        list.add(9);
        Collections.sort(list);//从小到大
        //Collections.sort(list,Collections.reverseOrder());//从大到小
        //Collections.reverse(list);//反转
        System.out.println(list.toString());
    }
}
