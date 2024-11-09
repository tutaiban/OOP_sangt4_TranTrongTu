package bai6_chuong3;
public class Person {
    private String name;
    private int age;
    private String gender;
    //constructor
    public Person(){}
    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    //getter and setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    //toString
    public String toString(){
        return "\nName: "+name+"\nAge: "+age+"\nGender: "+gender;
    }
}
