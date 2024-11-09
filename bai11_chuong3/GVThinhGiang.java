package bai11_chuong3;

import java.util.Scanner;

public class GVThinhGiang extends GiangVien{
    private int soTietDay;
    private double donGia;
    //constructor
    public GVThinhGiang(){super();}
    public GVThinhGiang(int soTietDay, double donGia) {
        super();
        this.soTietDay = soTietDay;
        this.donGia = donGia;
    }
    //getter and setter
    public int getSoTietDay() {
        return soTietDay;
    }
    public void setSoTietDay(int soTietDay) {
        this.soTietDay = soTietDay;
    }
    public double getDonGia() {
        return donGia;
    }
    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
    @Override 
    public double tinhLuong(){
        return soTietDay*donGia - 0.15*(soTietDay*donGia);
    }
    @Override
    public void nhapThongTin(){
        Scanner ip = new Scanner(System.in);
        super.nhapThongTin();
        System.out.print("Nhap so tiet day: ");
        soTietDay = ip. nextInt();
        System.out.print("Nhap don gia: ");
        donGia = ip.nextDouble();
    }
    @Override
    public void inThongTin(){
        super.inThongTin();
    }
}
