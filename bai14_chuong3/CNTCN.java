package bai14_chuong3;
import java.util.Scanner;
public class CNTCN extends CongNhan{
    private double luongCB;
    private double hesoLuong;
    private int songayCong;
    private double thuong;
    //constructor
    public CNTCN() {
        super();
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
    public int getSongayCong() {
        return songayCong;
    }
    public void setSongayCong(int songayCong) {
        this.songayCong = songayCong;
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
        System.out.println("Nhap luong co ban: ");
        luongCB = ip.nextDouble();
        System.out.print("Nhap he so luong: ");
        hesoLuong = ip.nextDouble();
        System.out.print("Nhap so ngay cong: ");
        songayCong = ip.nextInt();
    }
    @Override
    public double tinhLuong(){
        if(songayCong<20) thuong = 0;
        else thuong = 1.2*luongCB;
        return luongCB*hesoLuong + thuong;
    }
    @Override
    public void inThongTin(){
        super.inThongTin();
    }
}
