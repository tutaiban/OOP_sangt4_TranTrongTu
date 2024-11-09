package bai7_chuong3;

public class ResizableCircle extends Circle implements Resizable{
    public ResizableCircle(){super();}
    public ResizableCircle(double radius){
        super(radius);
    }
    @Override
    public int resize(int percent){
        return percent;
    }
    @Override
    public double getPerimeter(){
        return super.getPerimeter()*resize(110/100);
    }
    @Override
    public double getArea(){
        return super.getArea()*resize(110/100);
    }
    //toString
    public String toStrin(){
        return "\nPerimeter = "+getPerimeter()+"\nArea = "+getArea();
    }
}
