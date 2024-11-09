package bai3_chuong3;

import java.util.Scanner;

public class NhanVien {
    private String name;
    private DiaChi address;
    private String dob;
    private String gender;
    //constructor
    public NhanVien(){}
    public NhanVien(String name, DiaChi address, String dob, String gender) {
        this.name = name;
        this.address = new DiaChi();
        this.dob = dob;
        this.gender = gender;
    }
    //getter and setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public DiaChi getAddress() {
        return address;
    }
    public void setAddress(DiaChi address) {
        this.address = address;
    }
    public String getDob() {
        return dob;
    }
    public void setDob(String dob) {
        this.dob = dob;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void input(){
        Scanner ip = new Scanner(System.in);
        System.out.print("Name: ");
        name = ip.nextLine();
        System.out.print("Date of birth: ");
        dob = ip.nextLine();
        System.out.print("Gender: ");
        gender = ip.nextLine();
        address.nhap();
    }
    //toString 
    public String toString(){
        return "\nName: "+name+"\nDia chi: "+address.toString()+"\nDate of birth: "+dob+"\nGender: "+gender;
    }
}
