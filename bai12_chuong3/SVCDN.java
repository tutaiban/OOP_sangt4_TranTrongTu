package bai12_chuong3;

import java.util.Scanner;

public class SVCDN extends Nguoi{
    private double tongDiem;
    private int soMon;
    //constructor
    public SVCDN(){}
    //getter and setter
    public double getTongDiem() {
        return tongDiem;
    }
    public void setTongDiem(double tongDiem) {
        this.tongDiem = tongDiem;
    }
    public int getSoMon() {
        return soMon;
    }
    public void setSoMon(int soMon) {
        this.soMon = soMon;
    }
    @Override
    public void nhapThongTin(){
        super.nhapThongTin();
        Scanner ip = new Scanner(System.in);
        System.out.println("Nhap tong diem kiem tra: ");
        tongDiem = ip.nextDouble();
        System.out.print("Nhap so mon hoc: ");
        soMon = ip.nextInt();
    }
    @Override
    public double tinhDiem(){
        return tongDiem/soMon;
    }
    @Override
    public void inThongTin(){
        super.inThongTin();
    }
}
