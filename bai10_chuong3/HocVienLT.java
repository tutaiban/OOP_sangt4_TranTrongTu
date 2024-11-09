package bai10_chuong3;

import java.util.Scanner;

public class HocVienLT extends HocVien {
    private int soBuoiLT;
    private double donGiaLT;
    //constructor
    public HocVienLT(){super();}
    public HocVienLT(int soBuoiLT, double donGiaLT) {
        super();
        this.soBuoiLT = soBuoiLT;
        this.donGiaLT = donGiaLT;
    }
    //getter and setter
    public int getSoBuoiLT() {
        return soBuoiLT;
    }
    public void setSoBuoiLT(int soBuoiLT) {
        this.soBuoiLT = soBuoiLT;
    }
    public double getDonGiaLT() {
        return donGiaLT;
    }
    public void setDonGiaLT(double donGiaLT) {
        this.donGiaLT = donGiaLT;
    }
    @Override
    public double hocPhi(){
        if(super.getLoaiUT()==1) return soBuoiLT*donGiaLT - 1000000;
        else return soBuoiLT*donGiaLT - 800000;
    }
    @Override
    public void nhapThongTin(){
        Scanner ip = new Scanner(System.in);
        super.nhapThongTin();
        System.out.print("Nhap so buoi: ");
        soBuoiLT = ip.nextInt();
        System.out.print("Nhap don gia: ");
        donGiaLT = ip. nextDouble();
    }
    @Override
    public void inThongTin(){
        super.inThongTin();
    }
}
