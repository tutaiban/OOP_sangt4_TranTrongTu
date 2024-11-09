package bai5_chuong3;

public class Truong {
    private String ten;
    private String diaChi;
    private String hieuTruong;
    //constructor
    public Truong(){}
    public Truong(String ten, String diaChi, String hieuTruong) {
        this.ten = ten;
        this.diaChi = diaChi;
        this.hieuTruong = hieuTruong;
    }
    //getter and setter
    public String getTen() {
        return ten;
    }
    public void setTen(String ten) {
        this.ten = ten;
    }
    public String getDiaChi() {
        return diaChi;
    }
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    public String getHieuTruong() {
        return hieuTruong;
    }
    public void setHieuTruong(String hieuTruong) {
        this.hieuTruong = hieuTruong;
    }
    //toString
    public String toString(){
        return "\nTen truong: "+ten+"\nDia chi: "+diaChi+"\nHieu truong: "+hieuTruong;
    }
}
