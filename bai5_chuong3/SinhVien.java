package bai5_chuong3;

public class SinhVien extends Nguoi {
    private String lop;
    private String nganh;
    private Truong truong;
    //constructor
    public SinhVien(){super();}
    public SinhVien(String ten, int tuoi, String gioiTinh,String lop,String nganh,Truong truong){
        super(ten,tuoi,gioiTinh);
        this.lop = lop;
        this.nganh = nganh;
        this.truong = truong;
    }
    //getter and setter
    public String getLop() {
        return lop;
    }
    public void setLop(String lop) {
        this.lop = lop;
    }
    public String getNganh() {
        return nganh;
    }
    public void setNganh(String nganh) {
        this.nganh = nganh;
    }
    public Truong getTruong() {
        return truong;
    }
    public void setTruong(Truong truong) {
        this.truong = truong;
    }
    //toString 
    public String toString(){
        return super.toString()+"\nLop: "+lop+"\nNganh: "+nganh+truong.toString();
    }
}
