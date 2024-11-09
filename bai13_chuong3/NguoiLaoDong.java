package bai13_chuong3;

import java.util.Scanner;

public abstract class NguoiLaoDong {
    private String hoTen;
    private String diaChi;
    private String loaiLD;
    //constructor
    public NguoiLaoDong() {
    }
    //getter and setter
    public String getHoTen() {
        return hoTen;
    }
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public String getDiaChi() {
        return diaChi;
    }
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    public String getLoaiLD() {
        return loaiLD;
    }
    public void setLoaiLD(String loaiLD) {
        this.loaiLD = loaiLD;
    }
    //method input
    public void nhapThongTin(){
        Scanner ip = new Scanner(System.in);
        System.out.print("Nhap ho ten: ");
        hoTen = ip.nextLine();
        System.out.print("Nhap dia chi: ");
        diaChi = ip.nextLine();
        System.out.print("Nhap loai lao dong: ");
        loaiLD = ip.nextLine();
    }
    //abstract method
    public abstract double tinhLuong();
    //method output
    public void inThongTin(){
        System.out.println("Ho ten: "+hoTen);
        System.out.println("Dia chi: "+diaChi);
        System.out.println("Loai lao dong: "+loaiLD);
        System.out.println("Luong thang: "+tinhLuong());
    }
}
