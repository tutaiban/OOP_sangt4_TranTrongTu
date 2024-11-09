package bai6_chuong3;

public class PartTimeEployee extends Employee{
    private int hoursPerWeek;
    //constructor
    public PartTimeEployee(){super();}
    public PartTimeEployee(int hoursPerWeek){
        super();
        this.hoursPerWeek = hoursPerWeek;
    }
    //getter and setter
    public int getHoursPerWeek() {
        return hoursPerWeek;
    }
    public void setHoursPerWeek(int hoursPerWeek) {
        this.hoursPerWeek = hoursPerWeek;
    }
    //toString
    public String toString(){
        return super.toString()+"\nHours per week: "+hoursPerWeek;
    }
}
