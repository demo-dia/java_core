package javacore.ch04;

public class TripleValue {
    public static void main(String[] args) {
        double a=10;
        triple(a);
        System.out.println(a);
    }
    public static void triple(double x){
        x=3*x;
    }
}
