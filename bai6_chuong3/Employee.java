package bai6_chuong3;

public class Employee extends Person{
    private String employerName;
    private String dateHired;
    //constructor
    public Employee(){super();}
    public Employee(String employerName,String dateHired){
        super();
        this.employerName = employerName;
        this.dateHired = dateHired;
    }
    //getter and setter
    public String getEmployerName() {
        return employerName;
    }
    public void setEmployerName(String employerName) {
        this.employerName = employerName;
    }
    public String getDateHired() {
        return dateHired;
    }
    public void setDateHired(String dateHired) {
        this.dateHired = dateHired;
    }
    //toString
    public String toString(){
        return super.toString()+"\nEmployer's name: "+employerName+"\nDate hired: "+dateHired;
    }
}
