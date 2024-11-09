package bai11_chuong3;

public class test {
	    public static void main(String[] args) {
	        GVCoHuu gvCH[] = new GVCoHuu[2];
	        GVThinhGiang gvTG[] = new GVThinhGiang[2];
	        for(int i = 0;i<2;i++){
	            gvCH[i] = new GVCoHuu();
	            System.out.print("Enter i4 of gvCH "+(i+1));
	            gvCH[i].nhapThongTin();
	        }
	        for(int i=0;i<2;i++){
	            System.out.println("Information of gvCH "+(i+1));
	            gvCH[i].inThongTin();
	        }
	        for(int i = 0;i<2;i++){
	            gvTG[i] = new GVThinhGiang();
	            System.out.print("Enter i4 of gvTG "+(i+1));
	            gvTG[i].nhapThongTin();
	        }
	        for(int i=0;i<2;i++){
	            System.out.println("Information of gvTG "+(i+1));
	            gvTG[i].inThongTin();
	        }
	    }

}
