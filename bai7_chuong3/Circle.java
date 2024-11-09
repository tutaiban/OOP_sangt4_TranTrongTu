package bai7_chuong3;
public class Circle implements GeometricObject{
    private static final double radius = 1.0;
    public Circle(){}
    public Circle(double radius){
        
    }
    @Override
    public double getPerimeter(){
        return 2*radius*Math.PI;
    }
    @Override
    public double getArea(){
        return radius*radius*Math.PI;
    }
}