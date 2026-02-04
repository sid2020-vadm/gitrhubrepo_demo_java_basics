package day10_oops;

public class Employee {

    int eid;
    String ename;
    String job;
    int salary;

    void display(){
        System.out.println("employee name "+ ename);
        System.out.println("employes id " + eid);
        System.out.println("employee job "+job);
        System.out.println("employee salary "+salary);
    }


//    public static void main(String[] args){
//        Employee emp1 = new Employee();
//        emp1.eid =120;
//        emp1.salary =1200;
//        emp1.ename ="john";
//        emp1.job = "manager";
//        emp1.display();
//
//        Employee emp2 = new Employee();
//        emp2.eid =130;
//        emp2.salary =1300;
//        emp2.ename ="ajit";
//        emp2.job = "engineer";
//        emp2.display();
//    }
}
