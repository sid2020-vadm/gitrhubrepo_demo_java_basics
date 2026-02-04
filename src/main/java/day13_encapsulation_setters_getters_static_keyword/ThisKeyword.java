package day13_encapsulation_setters_getters_static_keyword;

public class ThisKeyword {
//    class variables / instance variables
    int x,y;
    void setData(int x, int y){
        this.x=x;
        this.y=y;
    }
    void display(){
        System.out.println(x+" "+y);
    }

    public static void main(String [] args){
    ThisKeyword t = new ThisKeyword();
    t.setData(10,20);
    t.display();
    }
}
