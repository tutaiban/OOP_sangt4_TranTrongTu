package bai13_chuong3;

import java.util.Scanner;

public class KiSu extends NguoiLaoDong{
    private double luongCB;
    private  double hesoLuong;
    private int soNgayCong;
    private double thuong;
    //constructor
    public KiSu() {
        super();
    }
    //getter and setter
    public int getSoNgayCong() {
        return soNgayCong;
    }
    public void setSoNgayCong(int soNgayCong) {
        this.soNgayCong = soNgayCong;
    }
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
    public double getThuong() {
        return thuong;
    }
    public void setThuong(double thuong) {
        this.thuong = thuong;
    }
    @Override
    public void nhapThongTin(){
        Scanner ip = new Scanner(System.in);
        System.out.println("Nhap luong co ban: ");
        luongCB = ip.nextDouble();
        System.out.print("Nhap he so luong: ");
        hesoLuong = ip.nextDouble();
        System.out.print("Nhap so ngay cong: ");
        soNgayCong = ip.nextInt();
    }
    @Override
    public double tinhLuong(){
        if(soNgayCong>=25) thuong = 2000000;
        else if(soNgayCong>15 && soNgayCong<25) thuong = 1000000;
        else thuong = 0;
        return thuong + luongCB*hesoLuong;
    }
    @Override
    public void inThongTin(){
        super.inThongTin();
    }
}
