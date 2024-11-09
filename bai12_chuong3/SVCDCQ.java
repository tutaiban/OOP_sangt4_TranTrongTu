package bai12_chuong3;

import java.util.Scanner;

public class SVCDCQ extends Nguoi{
    private double tongDiem;
    private int soMon;
    private double diemThi;
    //constructor
    public SVCDCQ(){}
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
    public double getDiemThi() {
        return diemThi;
    }
    public void setDiemThi(double diemThi) {
        this.diemThi = diemThi;
    }
    @Override
    public void nhapThongTin(){
        super.nhapThongTin();
        Scanner ip = new Scanner(System.in);
        System.out.println("Nhap tong diem kiem tra: ");
        tongDiem = ip.nextDouble();
        System.out.print("Nhap so mon hoc: ");
        soMon = ip.nextInt();
        System.out.println("Nhap diem thi: ");
        diemThi = ip.nextDouble();
    }
    @Override
    public double tinhDiem(){
        return (tongDiem/soMon+diemThi)/3;
    }
    @Override
    public void inThongTin(){
        super.inThongTin();
    }
}
