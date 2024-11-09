package bai5_chuong3;

public class Nguoi {
    private String ten;
    private int tuoi;
    private String gioiTinh;
    //constructor
    public Nguoi(){}
    public Nguoi(String ten, int tuoi, String gioiTinh) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
    }
    //getter and setter
    public String getTen() {
        return ten;
    }
    public void setTen(String ten) {
        this.ten = ten;
    }
    public int getTuoi() {
        return tuoi;
    }
    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
    public String getGioiTinh() {
        return gioiTinh;
    }
    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    //toString 
    public String toString(){
        return "\nTen: "+ten+"\nTuoi: "+tuoi+"\nGioi tinh: "+gioiTinh;
    }
}

