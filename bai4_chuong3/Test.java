package bai4_chuong3;

public class Test {
	public static void main(String[] args) {
        BenhVien bv = new BenhVien("Thuan Thanh","Bac Ninh","A");
        BenhNhan bn = new BenhNhan("Minh",19,"Nam","Khong","Bthg",bv);
        System.out.println(bn);
    }
}
