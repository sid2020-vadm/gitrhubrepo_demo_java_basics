package day12_Method_overloading_and_constructor_overloading;

public class Box {
    double width,height,depth;
    Box()
    {
        width=height=depth=0;

    }
    Box(double w,double h, double d){
        this.width =w;
        this.depth =d;
        this.height =h;
    }
    Box(double len){
        this.width=this.depth=this.height=len;
    }

    double volume(){
        return (width*height*depth);
    }
}
