package com.practical.part01;

import java.awt.*;
import java.util.Vector;

public class VecArray {
    public static void main(String[] args) {
        int i=1;
        int [] ia=new int[10];
        ia[0]=i;

        Button[] ba=new Button[10];
        ba[0]=new Button(" ");
        Vector v=new Vector(10);
        v.add(new Button(" "));
        v.add(i);
        System.out.println(v.size());
        v.add(new Integer(i));

    }
}
