package bai12_chuong3;

import java.util.Scanner;

public abstract class Nguoi{
    private String hoTen;
    private String ngaySinh;
    private String diaChi;
    private String loaiSV;
    //constructor
    public Nguoi(){}
    public Nguoi(String hoTen, String ngaySinh, String diaChi, String loaiSV) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.loaiSV = loaiSV;
    }
    //getter and setter
    public String getHoTen() {
        return hoTen;
    }
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public String getNgaySinh() {
        return ngaySinh;
    }
    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
    public String getDiaChi() {
        return diaChi;
    }
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    public String getLoaiSV() {
        return loaiSV;
    }
    public void setLoaiSV(String loaiSV) {
        this.loaiSV = loaiSV;
    }
    //method input
    public void nhapThongTin(){
        Scanner ip = new Scanner(System.in);
        System.out.print("\nNhap ho ten: ");
        hoTen = ip.nextLine();
        System.out.print("Nhap dia chi: ");
        diaChi = ip.nextLine();
        System.out.print("Nhap ngay sinh: ");
        ngaySinh = ip.nextLine();
        System.out.print("Nhap loai sinh vien: ");
        loaiSV = ip.nextLine();
    }
    //abstract method
    public abstract double tinhDiem();
    //method output
    public void inThongTin(){
        System.out.println("Ho ten: "+hoTen);
        System.out.println("Dia chi: "+diaChi);
        System.out.println("Ngay sinh: "+ngaySinh);
        System.out.println("Loai sinh vien: "+loaiSV);
        System.out.println("Diem trung binh: "+tinhDiem());
    }
}
