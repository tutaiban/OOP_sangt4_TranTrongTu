package bai4_chuong3;

public class BenhNhan extends Nguoi {
    private String tienSu;
    private String chanDoan;
    private BenhVien benhVien;
    //constructor
    public BenhNhan(){super();}
    public BenhNhan(String ten, int tuoi, String gioiTinh,String tienSu, String chanDoan, BenhVien benhVien) {
        super(ten,tuoi,gioiTinh);
        this.tienSu = tienSu;
        this.chanDoan = chanDoan;
        this.benhVien = benhVien;
    }
    //getter and setter
    public String getTienSu() {
        return tienSu;
    }
    public void setTienSu(String tienSu) {
        this.tienSu = tienSu;
    }
    public String getChanDoan() {
        return chanDoan;
    }
    public void setChanDoan(String chanDoan) {
        this.chanDoan = chanDoan;
    }
    public BenhVien getBenhVien() {
        return benhVien;
    }
    public void setBenhVien(BenhVien benhVien) {
        this.benhVien = benhVien;
    }
    //toString
    public String toString(){
        return super.toString()+"\nTien su: "+tienSu+"\nChan doan: "+chanDoan+benhVien.toString();
    }
}
