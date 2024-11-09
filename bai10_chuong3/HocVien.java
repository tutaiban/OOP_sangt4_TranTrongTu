package bai10_chuong3;

import java.util.Scanner;
public abstract class HocVien {
    private String hoTen;
    private String diaChi;
    private String loaiCT;
    private int loaiUT;
    //constructor
    public HocVien(){}
    public HocVien(String hoTen, String diaChi, String loaiCT) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.loaiCT = loaiCT;
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
    public String getLoaiCT() {
        return loaiCT;
    }
    public void setLoaiCT(String loaiCT) {
        this.loaiCT = loaiCT;
    }
    public int getLoaiUT() {
        return loaiUT;
    }
    public void setLoaiUT(int loaiUT) {
        this.loaiUT = loaiUT;
    }
    //method
    public void nhapThongTin(){
        Scanner ip = new Scanner(System.in);
        System.out.print("Nhap ho ten: ");
        hoTen = ip.nextLine();
        System.out.print("Dia chi: ");
        diaChi = ip.nextLine();
        System.out.print("Nhap loai CT: ");
        loaiCT = ip.nextLine();
        System.out.print("Nhap loai UT: ");
        loaiUT = ip.nextInt();
    }
    public abstract double hocPhi();
    public void inThongTin(){
        System.out.println("Ho ten: "+hoTen);
        System.out.println("Dia chi: "+diaChi);
        System.out.println("Loai CT: "+loaiCT);
        System.out.println("Loai UT: "+loaiUT);
        System.out.println("Hoc phi: "+hocPhi());
    }
}
