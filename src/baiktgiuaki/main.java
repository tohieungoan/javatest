package baiktgiuaki;
import java.util.Scanner;
public class main {
	public static void main(String[] args) {
		KhachSan B = new KhachSan();
		Scanner sc = new Scanner (System.in);
		int b = 0;
		while (b==0) {
		System.out.println("nhap 1 de nhap thong tin :  ");
		System.out.println("nhap 2 de xuat thong tin  :");
		System.out.println("nhap 3 de xoa thong tin khach hang theo ten :");
		System.out.println("nhap 4 de sap xep va xuat thong tin theo so ngay tro hon 3");
		System.out.println("nhap 0 de thoat ");
			System.out.println("dua ra lua chon cua ban :");
			int a = sc.nextInt();
			if(a==1) {
				B.nhap();
			}
			if(a==2) {
			B.output();
			}
			if(a==3) {
				B.xoa();
			}
			if(a==4) {
				B.sapxepkh();
				B.xuathon3();
			}
			if(a==0) {
				b = 2;
			}
		}
	}

}
