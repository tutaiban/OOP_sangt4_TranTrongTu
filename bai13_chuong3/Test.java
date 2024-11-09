package bai13_chuong3;

public class Test {
	public static void main(String[] args) {
        LaoDongPT p1 = new LaoDongPT();
        KiSu p2 = new KiSu();
        System.out.println("Nhap thong tin nguoi t1: ");
        p1.nhapThongTin();
        System.out.println("Thong tin nguoi thu nhat: ");
        p1.inThongTin();
        System.out.println("Nhap thong tin nguoi thu 2 : ");
        p2.nhapThongTin();
        System.out.println("Thong tin nguoi thu 2: ");
        p2.inThongTin();
    }
}
