package javacore.ch05;

public class Manger extends Employee {
    private double bonus;

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public double getSalary(){
        double baseSalary=super.getSalary();
        return baseSalary+bonus;
    }

    public Manger(String name, double salary, int year, int month, int day) {
        super(name, salary, year, month, day);
        bonus=0;
    }

    public static void main(String[] args) {
        Manger boss=new Manger("luojunlei",1000,2020,10,12);
        boss.setBonus(5000);

        Employee staff[]=new Employee[3];
        staff[0]=boss;
        staff[1]=new Employee("dia",2000,2019,10,12);
        staff[2]=new Employee("thunder",3000,2018,10,12);

        for(Employee e:staff){
            System.out.println(e.getName()+"的工资是"+e.getSalary());
        }
    }
}
