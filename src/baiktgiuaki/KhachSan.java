package baiktgiuaki;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
public class KhachSan extends Nguoi{
private int songaytro;
private String loaiphongtro;
private double giaphongtro;
private int sodem;
private	ArrayList<KhachSan> dskh = new ArrayList<KhachSan>();
private ArrayList<KhachSan> dshon3 = new ArrayList<KhachSan>();
public KhachSan() {
}
public KhachSan(String name, int ngaysinh, int thangsinh, int namsinh, String socmnd , int songaytro, String loaiphongtro, double giaphongtro , int sodem) {
	super(name , ngaysinh , thangsinh , namsinh , socmnd);
	this.songaytro = songaytro;
	this.loaiphongtro = loaiphongtro;
	this.giaphongtro = giaphongtro;
	this.sodem = sodem;
}
public int getSongaytro() {
	return songaytro;
}
public void setSongaytro(int songaytro) throws Exception {
	if(songaytro<=0){
		throw new Exception("songaytro is less than 0");	
	}
	this.songaytro = songaytro;
}
public String getLoaiphongtro() {
	return loaiphongtro;
}
public void setLoaiphongtro(String loaiphongtro) throws Exception { 
	int b = Integer.parseInt(loaiphongtro);
	if(b>3||b<1){
		throw new Exception("loaiphongtro is error");
	}
	this.loaiphongtro = loaiphongtro;
}
public double getGiaphongtro() {
	return giaphongtro;
}
public void setGiaphongtro(double giaphongtro) throws Exception {
	if(giaphongtro<=0){
        throw new Exception("giaphongtro is less than 0");    
    }
	this.giaphongtro = giaphongtro;
}

public int getSodem() {
	return sodem;
}
public void setSodem(int sodem) {
	this.sodem = sodem;
}
public void nhap() {
	int q =0;
	Scanner sc = new Scanner(System.in);
	System.out.println("nhap vao so luong khach thue tro : ");
	int a = sc.nextInt();
	for(int i = 0 ; i<a;i++) {
		KhachSan A = new KhachSan();
		sc.nextLine();
		A.xuatnguoi();
		while(q==0){
			try{
				System.out.println("nhap vao so ngay thue :");
			A.songaytro = sc.nextInt();
			q=1;
			A.setSongaytro(A.songaytro);
			}
			catch( Exception e){
				q=0;
				System.err.println(e.getMessage());
			}
		}
		sc.nextLine();
       while(q==1){
		try{
			System.out.println("nhap vao loai phong tro(1,2,3) :");
				A.loaiphongtro = sc.next();
				q=0;
				A.setLoaiphongtro(A.loaiphongtro);
		}
		catch( Exception e){
            q=1;
			System.err.println(e.getMessage());
	   }
	}
	   while(q==0){
		try{
			System.out.println("nhap vao gia tien :");
			A.giaphongtro = sc.nextDouble();
			q=1;
			A.setGiaphongtro(A.giaphongtro);

		}
		catch(Exception e){
			q=0;
            System.err.println(e.getMessage());
		}
	   }
	    A.setSodem(i);
		dskh.add(A);
		if(A.getSongaytro()>3) {
			dshon3.add(A);
		}
	}

}
public void xuat() {
	System.out.println("*******************************Hóa Đơn Khách hàng *****************************");
	System.out.println("khach hang ten la :"+this.getName());
	System.out.println("ngay thang nam sinh khach hang : "+this.getNgaysinh()+"/"+this.getThangsinh()+"/"+this.getNamsinh());
	System.out.println("so cmnd khach hang :"+this.getSocmnd());
	System.out.println("ngay thue :"+this.getSongaytro());
	System.out.println("loai phong tro :"+this.getLoaiphongtro());
	System.out.println("gia tien :"+this.getGiaphongtro());
}
public void output() {
	for (KhachSan kh : dskh) {
      kh.xuat();
    }
	 }
public void xoa() {
	Scanner sc = new Scanner(System.in);
	System.out.println("nhap vao tên khách hàng cần xóa ");
	String a = sc.nextLine();
	for(KhachSan ks : dskh ) {
		if(a.equals(ks.getName())) {
		dskh.remove(ks.getSodem());
		break;
		}
	}
}
public void sapxepkh() {
	Collections.sort(dshon3 , new Comparator<KhachSan>() {

		@Override
		public int compare(KhachSan o1, KhachSan o2) {
			// TODO Auto-generated method stub
			if(o1.getSongaytro()>o2.getSongaytro()) {
				return -1;
			}
			return 1;
		}
	});
}
public void xuathon3(){
	{
		for (KhachSan kh : dshon3) {
	      kh.xuat();
	    }
		 }
}
}

