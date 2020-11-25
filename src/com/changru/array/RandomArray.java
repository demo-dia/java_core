package com.changru.array;

import java.util.Arrays;

public class RandomArray {
    public static void main(String[] args) {
        RandomArray ra=new RandomArray();
        int[] arr=ra.getArray(7);
        System.out.println(Arrays.toString(arr));
    }
    public int[] getArray(int num){
        int arr[]=new int[num];
        for (int i=0;i<arr.length;i++){
            arr[i]= (int) (Math.random()*100);
        }
        Arrays.sort(arr);
        return arr;
    }

}
