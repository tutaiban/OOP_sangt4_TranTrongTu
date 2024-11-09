package bai10_chuong3;

public class Test {

	    public static void main(String[] args) {

	        HocVienDH hvDH[] = new HocVienDH[2];
	        HocVienLT hvLT[] = new HocVienLT[2];
	        //HVDH
	        for(int i=0;i<2;i++){
	            hvDH[i] = new HocVienDH();
	            System.out.println("Enter i4 of hoc vien "+(i+1));
	            hvDH[i].nhapThongTin();
	        }
	        for(int i=0;i<2;i++){
	            System.out.println("Information of hoc vien "+(i+1));
	            hvDH[i].inThongTin();
	        }
	        //HVLT
	         for(int i=0;i<2;i++){
	            hvLT[i] = new HocVienLT();
	            System.out.println("Enter i4 of hoc vien "+(i+1));
	            hvLT[i].nhapThongTin();
	        }
	        for(int i=0;i<2;i++){
	            System.out.println("Information of hoc vien "+(i+1));
	            hvLT[i].inThongTin();
	        }
	    }
	}
