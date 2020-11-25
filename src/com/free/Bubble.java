package com.free;

public class Bubble {
    public static void main(String[] args) {
        int[] a={1,4,2,0,6,5,3};
        for (int i=a.length-1;i>0;i--){
            for (int j=0;j<i;j++){
                if(a[j]>a[j+1]){
                    int temp;
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        for (int i=0;i< a.length;i++){
            System.out.println(a[i]);
        }
    }
}
