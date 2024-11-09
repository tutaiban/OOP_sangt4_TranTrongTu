package bai4_chuong3;

public class BenhVien {
    private String ten;
    private String diaChi;
    private String giamDoc;
    //constructor
    public BenhVien(){}
    public BenhVien(String ten, String diaChi, String giamDoc) {
        this.ten = ten;
        this.diaChi = diaChi;
        this.giamDoc = giamDoc;
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
    public String getGiamDoc() {
        return giamDoc;
    }
    public void setGiamDoc(String giamDoc) {
        this.giamDoc = giamDoc;
    }
    //toString
    public String toString(){
        return "\nTen benh vien: "+ten+"Dia chi: "+diaChi+"\nGiam doc: "+giamDoc;
    }
}
