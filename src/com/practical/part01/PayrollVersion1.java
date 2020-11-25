package com.practical.part01;
interface Employee{
    public int salary();
    public int bonus();
}
//多态代替instanceof操作符
class  Manager implements Employee{
    private static final int mgrSal=40000;
    private static final int mgrBonus=0;
    public int salary(){
        return mgrSal;
    }
    public int bonus(){
        return mgrBonus;
    }
}

class Programmer implements Employee{
    private static final int prgSal=50000;
    private static final int prgBonus=10000;
    public int salary(){
        return prgSal;
    }
    public int bonus(){
        return prgBonus;
    }
}

public class PayrollVersion1 {
    public int calcPayrollVersion1(Employee emp){
        return emp.salary()+emp.bonus();//Calculate the bonus. No instanceof check needed.
    }

    public static void main(String[] args) {
        PayrollVersion1 pr=new PayrollVersion1();
        Programmer prg=new Programmer();
        Manager mgr=new Manager();
        System.out.println("PayrollVersion1 for programmer is "+
                pr.calcPayrollVersion1(prg));
        System.out.println("PayrollVersion1e for manager is "+
                pr.calcPayrollVersion1(mgr));
    }
}
