package bai3_chuong3;

	import java.util.Scanner;
	public class DiaChi {
	    private String thon;
	    private String xa;
	    private String huyen;
	    private String tinh;
	    //constructor
	    public DiaChi(){}
	    public DiaChi(String thon, String xa, String huyen, String tinh) {
	        this.thon = thon;
	        this.xa = xa;
	        this.huyen = huyen;
	        this.tinh = tinh;
	    }
	    //getter and setter
	    public String getThon() {
	        return thon;
	    }
	    public void setThon(String thon) {
	        this.thon = thon;
	    }
	    public String getXa() {
	        return xa;
	    }
	    public void setXa(String xa) {
	        this.xa = xa;
	    }
	    public String getHuyen() {
	        return huyen;
	    }
	    public void setHuyen(String huyen) {
	        this.huyen = huyen;
	    }
	    public String getTinh() {
	        return tinh;
	    }
	    public void setTinh(String tinh) {
	        this.tinh = tinh;
	    }
	    public void nhap(){
	        Scanner ip = new Scanner(System.in);
	        System.out.print("Thon: ");
	        thon = ip.nextLine();
	        System.out.print("Xa: ");
	        xa = ip.nextLine();
	        System.out.print("Huyen: ");
	        huyen = ip.nextLine();
	        System.out.print("Tinh: ");
	        tinh = ip.nextLine();
	    }
	    //toString
	    public String toString(){
	        return "\nThon: "+thon+"\nXa: "+xa+"\nHuyen "+huyen+"\nTinh: "+tinh;
	    }
	}

