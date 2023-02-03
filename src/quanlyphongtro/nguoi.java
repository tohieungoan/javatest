package quanlyphongtro;

import java.util.ArrayList;
import java.util.Scanner;
public class nguoi {
       private String name;
      protected int ngaysinh;
       private String cmnd;
	public nguoi() {
	}
	public nguoi(String name, int ngaysinh, String cmnd) {
		
		this.name = name;
		this.ngaysinh = ngaysinh;
		this.cmnd = cmnd;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) throws checkexeption {
		if(name.equals("")) throw new checkexeption("TEN BI RONG");
		for(int i=0;i<name.length();i++) {
	    if(name.charAt(i)>'a'&&name.charAt(i)<'z'||name.charAt(i)>'A'&&name.charAt(i)<'Z'||name.charAt(i)==' ') {
	    	
	    }else {
	    	throw new checkexeption("NHAP  SAI DU LIEU");
	    }
		}
		this.name = name;
	
	}
	public int getNgaysinh() {
		return ngaysinh;
	}
	public void setNgaysinh(int ngaysinh) throws checkexeption {
		if(ngaysinh<=0||ngaysinh>31) throw new checkexeption("loi ngay sinh");
		
		this.ngaysinh = ngaysinh;
	}
	public String getCmnd() {
		return cmnd;
	}
	public void setCmnd(String cmnd) throws checkexeption{
		for(int i=0;i<cmnd.length();i++) {
		if(cmnd.charAt(i)>'0'&&cmnd.charAt(i)<'9')
		{
			
		}else {
			throw new checkexeption("CMND KHONG DUOC CO  KY TU TRONG BANG CHU CAI");
		}
		}
		this.cmnd = cmnd;
	}
       
}
