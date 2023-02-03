package quanlyphongtro;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
           khachhang kh2=new khachhang();
           int n=0;
           do {
        	   System.out.println("CHUONG TRINH QUAN LY TRO");
        	   System.out.println("0.THOAT CHUONG TRINH");
        	   System.out.println("1.NHAP VAO MOT DAY KHACH TRO ");
        	   System.out.println("2.HIEN THI RA MAN HINH THONG TIN VE CAC CA NHAN");
        	   System.out.println("3.TIM KIEM VA SAP XEP THONG TIN KHACH TRO O QUA 3 NGAY");
        	   int x=sc.nextInt();
        	   switch(x) {
        	   case 0:
        		   System.out.println("BAN DA THOAT CHUONG TRINH");
        	   case 1:
        		   kh2.nhapthongtin();
        	   case 2:
        		   kh2.xuat();
        		   
        	   }
	}while(n!=0);
	}

}
