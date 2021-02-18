package javacore.ch05;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Employee> staff=new ArrayList<>();
        staff.add(new Employee("luojunlei",1000,2020,10,12));
        staff.add(new Employee("dia",1000,2019,10,12));
        staff.add(new Employee("thunder",1000,2018,10,12));

        for(Employee e:staff){
            e.raiseSalary(5);
        }
        for(Employee e:staff){
            System.out.println("name: "+e.getName()+" "+"salary: "+e.getSalary()+" "+"hireDay: "+e.getHireDay());
        }

    }
}
