package bai8_chuong3;


public class Triangle extends Shape{
    private int base;
    private int height;
    //constructor
    public Triangle(){super();}
    public Triangle(String color,int base,int height){
        super(color);
        this.base = base;
        this.height = height;
    }
    //getter and setter
    public int getBase() {
        return base;
    }
    public void setBase(int base) {
        this.base = base;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    @Override
    public double getArea(){
        return 0.5*height*base;
    }
    //toString
    public String toString(){
        return super.toString()+"\nArea = "+getArea();
    }
}
