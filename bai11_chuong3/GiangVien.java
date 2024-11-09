package bai11_chuong3;

import java.util.Scanner;

public abstract class GiangVien {
    private String hoten;
    private String diaChi;
    private String loaiGV;
    //constructor
    public GiangVien(){}
    public GiangVien(String hoten, String diaChi, String loaiGV) {
        this.hoten = hoten;
        this.diaChi = diaChi;
        this.loaiGV = loaiGV;
    }
    //getter and setter
    public String getHoten() {
        return hoten;
    }
    public void setHoten(String hoten) {
        this.hoten = hoten;
    }
    public String getDiaChi() {
        return diaChi;
    }
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    public String getLoaiGV() {
        return loaiGV;
    }
    public void setLoaiGV(String loaiGV) {
        this.loaiGV = loaiGV;
    }
    //method nhap
    public void nhapThongTin(){
        Scanner ip = new Scanner(System.in);
        System.out.print("Ho ten: ");
        hoten = ip.nextLine();
        System.out.print("Dia chi: ");
        diaChi = ip.nextLine();
        System.out.print("Loai giang vien: ");
        loaiGV = ip.nextLine();
    }
    //abstract method
    public abstract double tinhLuong();
    //output
    public void inThongTin(){
        System.out.println("Ho ten: "+hoten);
        System.out.println("Dia chi: "+diaChi);
        System.out.println("Loai giang vien: "+loaiGV);
        System.out.println("Luong thang: "+tinhLuong());
    }
}
