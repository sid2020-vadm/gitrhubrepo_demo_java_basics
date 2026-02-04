package day11;

public class Student {
    int sid;
    String sname;
    char grade;

    Student(int id, String name,char g){
        this.sid = id;
        this.sname =name;
        this.grade =g;
    }
    void printStuData(){
        System.out.println(sid+" "+sname+" "+grade);
    }
    void setStuData(int id, String name,char g){
        this.sid = id;
        this.sname =name;
        this.grade =g;

    }
}
