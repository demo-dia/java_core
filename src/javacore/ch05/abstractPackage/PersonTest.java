package javacore.ch05.abstractPackage;

public class PersonTest {

    public static void main(String[] args) {
        Person[] people=new Person[2];
        people[0]=new Employee("demo",1000,2017,10,12);
        people[1]=new Student("dia","computer");


        for(Person p:people){
            System.out.println(p.getName()+"--"+p.getDescription());
        }
    }
}
