package bai14_chuong3;

import java.util.Scanner;

public class CNKSP extends CongNhan{
    private int soSP;
    private double donGia;
    private double thuong;
    //constructor
    public CNKSP() {
        super();
    }
    //getter and setter
    public int getSoSP() {
        return soSP;
    }
    public void setSoSP(int soSP) {
        this.soSP = soSP;
    }
    public double getDonGia() {
        return donGia;
    }
    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
    public double getThuong() {
        return thuong;
    }
    public void setThuong(double thuong) {
        this.thuong = thuong;
    }
    @Override
    public void nhapThongTin(){
        super.nhapThongTin();
        Scanner ip = new Scanner(System.in);
        System.out.println("Nhap so san pham: ");
        soSP = ip.nextInt();
        System.out.print("Nhap don gia san pham: ");
        donGia = ip.nextDouble();
    }
    @Override
    public double tinhLuong(){
        if(soSP<=1000) thuong = 0;
        else if(soSP>1100 && soSP <1150) thuong = 1000000;
        else if(soSP>=1150) thuong = 1500000;
        return soSP*donGia+ thuong;
    }
    @Override
    public void inThongTin(){
        super.inThongTin();
    }
}
