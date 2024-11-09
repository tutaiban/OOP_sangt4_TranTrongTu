package bai5_chuong3;

public class Test {
	public static void main(String[] args) {
        Truong truong = new Truong("Haui","Bac Tu Liem","A");
        SinhVien sv = new SinhVien("Minh",19,"Nam","IT05","IT",truong);
        System.out.println(sv);
    }
}
