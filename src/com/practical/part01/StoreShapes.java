package com.practical.part01;

import java.util.Vector;

class Shape1{}
class Circle1 extends Shape1{
    public double radius(){
        return 5.7;
    }
}
class Triangle extends Shape1{
    public boolean isRightTriangle(){
        //code to determine if triangle is right
        return true;
    }
}

public class StoreShapes {
    public static void main(String[] args) {
        Vector shape1Vector=new Vector(10);
        shape1Vector.add(new Triangle());
        shape1Vector.add(new Triangle());
        shape1Vector.add(new Circle1());
        //assume many triangles and circles are added and romoved
        int size=shape1Vector.size();
        for(int i=0;i<size;i++){
            Object o=shape1Vector.get(i);
            if(o instanceof Triangle){
                if(((Triangle) o).isRightTriangle()){}
            }
            else if(o instanceof Circle1){
                double rad=((Circle1) o).radius();
            }
        }

    }
}
