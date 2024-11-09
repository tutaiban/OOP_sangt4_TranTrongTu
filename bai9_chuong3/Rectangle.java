package bai9_chuong3;

public class Rectangle extends Shape{
    private int length;
    private int width;
    //constructor
    public Rectangle(){super();}
    public Rectangle(String color,int length,int width){
        super(color);
        this.length = length;
        this.width = width;
    }
    //getter and setter
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    @Override
    public double getArea(){
        return length*width;
    }
    //toString
    public String toString(){
        return super.toString()+"\nArea = "+getArea();
    }
}
