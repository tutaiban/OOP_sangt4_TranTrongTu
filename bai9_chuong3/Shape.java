package bai9_chuong3;

public abstract class Shape {
    private String color;
    //constructor
    public Shape(){}
    public Shape(String color){
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    //asbtract method
    public abstract double getArea();
    public String toString(){
        return "\nColor: "+color;
    }
}
