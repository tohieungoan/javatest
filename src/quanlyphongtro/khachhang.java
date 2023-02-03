package quanlyphongtro;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class khachhang extends nguoi{
	private	ArrayList<khachhang> tt = new ArrayList<khachhang>();
	// Scanner sc=new Scanner(System.in);
	// khachhang kh=new khachhang();
	// private ArrayList<nguoi>tt;
	// nguoi n=new nguoi();
	// public khachhang() {
	// 	this.tt=new ArrayList<nguoi>();
	// }
    //  public khachhang(ArrayList<nguoi> tt) {
		
	// 	this.tt = tt;
	// }
	private double ngaytro;
     private String loaitro;
     private double giaphong;
	public khachhang() {
	}
	public khachhang(String name,int ngaysinh,String cmnd,double ngaytro, String loaitro, double giaphong) {
		super(name,ngaysinh,cmnd);
		this.ngaytro = ngaytro;
		this.loaitro = loaitro;
		this.giaphong = giaphong;
	}
	public double getNgaytro() {
		return ngaytro;
	}
	public void setNgaytro(double ngaytro) throws checkexeption  {
		if(ngaytro<0) throw new checkexeption("NGAY TRO PHAI LON HON HOAC BANG 0");
		this.ngaytro = ngaytro;
	}
	public String getLoaitro() {
		return loaitro;
	}
	public void setLoaitro(String loaitro) throws checkexeption {
		for(int i=0;i<loaitro.length();i++) {
		if(loaitro.charAt(i)>'a'&&loaitro.charAt(i)<'z'||loaitro.charAt(i)==' ') {
		}else {
			throw new checkexeption("LOAI TRO SAI DINH DANG!");
		}
		}
		this.loaitro = loaitro;
	}
	public double getGiaphong() {
		return giaphong;
	}
	public void setGiaphong(double giaphong) throws checkexeption {
		if(giaphong<=0) throw new checkexeption("GIA PHONG PHAI LON HON 0");
		this.giaphong = giaphong;
	}

     public void nhapthongtin() {
		Scanner sc = new Scanner(System.in);
    	 System.out.println("NHAP SO NGUOI CAN THEM VAO :");
    	 int a=sc.nextInt();
		 sc.nextLine();
    	 for(int i=0;i<a;i++) {
			khachhang kh = new khachhang();
    		 while(true) {
    			 try {
    		 System.out.println("TEN KHACH TRO :"+(i+1));
			 String name=sc.nextLine();
			 kh.setName(name);
    		       break;
    			 }catch (Exception e) {
    				  System.err.println(e.getMessage());
    				 
    			 }
    		 }
    		     while(true) {
    			  try {
    				  System.out.println("NGAY SINH :"+(i+1));
    				  int ngaysinh=sc.nextInt();
    				  kh.setNgaysinh(ngaysinh);
    				  break;
    			  }catch (Exception e) {
    				  System.err.println(e.getMessage());
    			  }
    		  }
    		     while(true) {
    		    	 try {
    		    		 System.out.println("CMND :"+(i+1));
    		    		 String cmnd =sc.nextLine();
    		    		 kh.setCmnd(cmnd);
    		    		 break;
    		    	 }catch (Exception e) {
    		    		 System.err.println(e.getMessage());
    		    	 }
    		     }
    		     while(true) {
    		    	 try {
    		    		 System.out.println("SO NGAY TRO :");
    		    	     double ngaytro=sc.nextDouble();
    		    	     kh.setNgaytro(ngaytro);
    		    		 break;
    		    	 }catch(Exception e) {
    		    		 System.err.println(e.getMessage());
    		    	 }
    		     }
    		     while(true) {
    		    	 try {
    		    		 System.out.println("LOAI TRO :");
    		    		 loaitro=sc.nextLine();
    		    		 kh.setLoaitro(loaitro);
    		    		 break;
    		    	 }catch (Exception e) {
    		    		 System.out.println(e.getMessage());
    		    	 }
    		     }
    		     while(true) {
    		    	 try {
    		    		 System.out.println("GIA PHONG :");
    		    		 giaphong=sc.nextDouble();
    		    		 kh.setGiaphong(giaphong);
    		    		 break;
    		    	 }catch (Exception e) {
    		    		 System.out.println(e.getMessage());
    		    	 }
    		     }
				 
    		     tt.add(kh);
    		 
    	 }
     }
      
	 public void xuat(){
		{
			for (khachhang kh : tt) {
			  kh.output();
			}
			 }
	}
	public void output() {
		System.out.println("*******************************Hóa Đơn Khách hàng *****************************");
		System.out.println("khach hang ten la :"+this.getName());
		System.out.println("ngay thang nam sinh khach hang : "+this.getNgaysinh());
		System.out.println("so cmnd khach hang :"+this.getCmnd());
		System.out.println("ngay thue :"+this.getNgaytro());
		System.out.println("loai phong tro :"+this.getLoaitro());
		System.out.println("gia tien :"+this.getGiaphong());
	}
}
