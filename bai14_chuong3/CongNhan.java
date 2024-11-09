package bai14_chuong3;

import java.util.Scanner;

public abstract class CongNhan {
    private String hoTen;
    private String diaChi;
    private String ngaySinh;
    private String loaiCN;
    //constructor
    public CongNhan() {
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
    public String getNgaySinh() {
        return ngaySinh;
    }
    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
    public String getLoaiCN() {
        return loaiCN;
    }
    public void setLoaiCN(String loaiCN) {
        this.loaiCN = loaiCN;
    }
    //method input
    public void nhapThongTin(){
        Scanner ip = new Scanner(System.in);
        System.out.print("Nhap ho ten: ");
        hoTen = ip.nextLine();
        System.out.print("Nhap dia chi: ");
        diaChi = ip.nextLine();
        System.out.print("Nhap ngay sinh: ");
        ngaySinh = ip.nextLine();
        System.out.print("Nhap loai cong nhan: ");
        loaiCN = ip.nextLine();
    }
    //abstract method
    public abstract double tinhLuong();
    //method output
    public void inThongTin(){
        System.out.println("Ho ten: "+hoTen);
        System.out.println("Dia chi: "+diaChi);
        System.out.println("Ngay sinh: "+ngaySinh);
        System.out.println("Loai cong nhan: "+loaiCN);
        System.out.println("Luong thang: "+tinhLuong());
    }
}
