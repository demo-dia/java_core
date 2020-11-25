package com.practical.part01;

class GolfBall{
    private String brand;//品牌
    private String make;//型号
    private int compression;//弹性


    public boolean equals(Object obj){
        if(this==obj){
            return true;
        }
        if(obj!=null && getClass()==obj.getClass()){
            GolfBall gb= (GolfBall) obj;//Classes are equal,downcast.
            if(brand.equals(gb.getBrand())&&//compare attributes.
               make.equals(gb.getMake())&&
               compression==gb.getCompression()){
                return true;
            }
        }
        return false;
    }

    public GolfBall(String brand, String make, int compression) {
        this.brand = brand;
        this.make = make;
        this.compression = compression;
    }

    public String getBrand() {
        return brand;
    }

    public String getMake() {
        return make;
    }

    public int getCompression() {
        return compression;
    }
}
public class Warehouse {
    public static void main(String[] args) {
        GolfBall gb1=new GolfBall("BrandX","Professional",100);
        GolfBall gb2=new GolfBall("BrandX","Professional",100);
        if(gb1.equals(gb2)){
            System.out.println("Ball 1 equals Ball 2");
        }
        else {
            System.out.println("Ball 1 does not equal Ball 2");
        }

    }
}
