package bai13_chuong3;

import java.util.Scanner;

public class LaoDongPT extends NguoiLaoDong {
    private int soNgayCong;
    private double donGia;
    private double thuong;
    //constructor
    public LaoDongPT() {
        super();
    }
    //getter and setter
    public int getSoNgayCong() {
        return soNgayCong;
    }
    public void setSoNgayCong(int soNgayCong) {
        this.soNgayCong = soNgayCong;
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
        System.out.println("Nhap so ngay cong: ");
        soNgayCong = ip.nextInt();
        System.out.print("Nhap don gia ngay cong: ");
        donGia = ip.nextDouble();
    }
    @Override
    public double tinhLuong(){
        if(soNgayCong>=25) thuong = 1000000;
        else if(soNgayCong>15 && soNgayCong<25) thuong = 700000;
        else thuong = 0;
        return thuong + soNgayCong*donGia;
    }
    @Override
    public void inThongTin(){
        super.inThongTin();
    }
}
