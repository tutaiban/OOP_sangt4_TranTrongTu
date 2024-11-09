package bai10_chuong3;

import java.util.Scanner;
public class HocVienDH extends HocVien {
    private int soBuoiDH;
    private double donGiaDH;
    //constructor
    public HocVienDH(){super();}
    public HocVienDH(int soBuoiDH, double donGiaDH) {
        super();
        this.soBuoiDH = soBuoiDH;
        this.donGiaDH = donGiaDH;
    }
    //getter and setter
    public int getSoBuoi() {
        return soBuoiDH;
    }
    public void setSoBuoi(int soBuoi) {
        this.soBuoiDH = soBuoi;
    }
    public double getDonGia() {
        return donGiaDH;
    }
    public void setDonGia(double donGia) {
        this.donGiaDH = donGia;
    }
    @Override
    public double hocPhi(){
        if(super.getLoaiUT()==1) return soBuoiDH*donGiaDH - 1000000;
        else return soBuoiDH*donGiaDH - 500000;
    }
    @Override
    public void nhapThongTin(){
        Scanner ip = new Scanner(System.in);
        super.nhapThongTin();
        System.out.print("Nhap so buoi: ");
        soBuoiDH = ip.nextInt();
        System.out.print("Nhap don gia: ");
        donGiaDH = ip. nextDouble();
    }
    @Override
    public void inThongTin(){
        super.inThongTin();
    }
}
