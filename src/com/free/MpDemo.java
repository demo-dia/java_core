package com.free;

public class MpDemo {
    public static void main(String[] args) {
        int [] a={3,7,2,0};
        for (int i=a.length-1;i>0;i--){
            for (int j=0;j<i;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j+1] ;
                    a[j+1]=a[j];
                    a[j]=temp;
                }
            }
        }
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
