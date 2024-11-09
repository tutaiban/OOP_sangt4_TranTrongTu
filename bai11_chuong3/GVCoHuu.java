package bai11_chuong3;

import java.util.Scanner;

public class GVCoHuu extends GiangVien{
    private double luongCB;
    private double hesoLuong;
    private int thamNien;
    //constructor
    public GVCoHuu(){super();}
    public GVCoHuu(double luongCB, double hesoLuong, int thamNien) {
        super();
        this.luongCB = luongCB;
        this.hesoLuong = hesoLuong;
        this.thamNien = thamNien;
    }
    //getter and setter
    public double getLuongCB() {
        return luongCB;
    }
    public void setLuongCB(double luongCB) {
        this.luongCB = luongCB;
    }
    public double getHesoLuong() {
        return hesoLuong;
    }
    public void setHesoLuong(double hesoLuong) {
        this.hesoLuong = hesoLuong;
    }
    public int getThamNien() {
        return thamNien;
    }
    public void setThamNien(int thamNien) {
        this.thamNien = thamNien;
    }
    @Override 
    public void nhapThongTin(){
        Scanner ip = new Scanner(System.in);
        super.nhapThongTin();
        System.out.print("Nhap luong co ban: ");
        luongCB = ip.nextDouble();
        System.out.print("Nhap he so luong: ");
        hesoLuong = ip.nextDouble();
        System.out.print("Nhap tham nien: ");
        thamNien = ip.nextInt();
    }
    @Override 
    public double tinhLuong(){
        if(thamNien<5) return luongCB*hesoLuong;
        else return luongCB*hesoLuong+(thamNien*1.0/100)*luongCB;
    }
    @Override
    public void inThongTin(){
        super.inThongTin();
    }
}
