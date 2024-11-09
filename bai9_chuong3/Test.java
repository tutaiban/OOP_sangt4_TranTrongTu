package bai9_chuong3;

import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int r;
        do{
            System.out.print("Enter number of rectangles: ");
            r = ip.nextInt();
        }while(r<1||r>5);
        Rectangle hcn[] = new Rectangle[r];
        for(int i=0;i<r;i++){
            hcn[i] = new Rectangle();
            System.out.println("Enter rectangle "+(i+1));
            System.out.print("Enter color: ");
            hcn[i].setColor(ip.nextLine());
            System.out.print("Enter length: ");
            hcn[i].setLength(ip.nextInt());
            System.out.print("Enter width: ");
            hcn[i].setWidth(ip.nextInt());
        }
        //display hcn
        for(int i=0;i<r;i++){
            System.out.println("Rectangle "+(i+1));
            System.out.print(hcn[i]);
        }
    }
}
