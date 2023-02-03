package baiktgiuaki;
import java.util.Scanner;
public class Nguoi {
private String name;
private int ngaysinh;
private int thangsinh;
private int namsinh;
private String socmnd;
public Nguoi() {
}
public Nguoi(String name, int ngaysinh, int thangsinh, int namsinh, String socmnd) {
	super();
	this.name = name;
	this.ngaysinh = ngaysinh;
	this.thangsinh = thangsinh;
	this.namsinh = namsinh;
	this.socmnd = socmnd;
}
public String getName() {
	return name;
}
public void setName(String name) throws Exception {
	 String a = "^[a-zA-Z[ ]]+$";
	 boolean b = name.matches(a);
	 if(b==false){
		throw new Exception("nhap loi ten");
	 }
	this.name = name;
}

public int getNgaysinh() {
	return ngaysinh;
}
public void setNgaysinh(int ngaysinh) throws Exception {
	if(ngaysinh<0||ngaysinh>31){
        throw new Exception("nhap loi ngay sinh");
    }	
	this.ngaysinh = ngaysinh;
}
public int getThangsinh() {
	return thangsinh;
}
public void setThangsinh(int thangsinh) throws Exception{
	if(thangsinh<0||thangsinh>12){
        throw new Exception("nhap loi thang sinh");
} 
	this.thangsinh = thangsinh;
}
public int getNamsinh() {
	return namsinh;
}
public void setNamsinh(int namsinh) throws Exception {
    if(namsinh>9999||namsinh<1500){ throw new Exception("nhap sai nam sinh");
}
this.namsinh = namsinh;
}
public String getSocmnd() {
	return socmnd;
}
public void setSocmnd(String socmnd) throws Exception {
    String b = "^[0-9\\d*]{12}$";
    boolean c = socmnd.matches(b);
		if(c==false){
			throw new Exception("nhap sai dinh dang so cmnd");
		}
	this.socmnd = socmnd;
}
public void xuatnguoi(){
	Scanner sc = new Scanner(System.in);
	int h =0;
	while(h==0){
		try{
	System.out.println("nhap ten nguoi thue tro :" );
	setName(sc.nextLine());
	h=h+1;
	this.setName(getName());
	}
	catch(Exception e)
	{
		h=0;
		System.err.println(e.getMessage());
}
}
	while(h==1){
		try{
			System.out.println("nhap ngay sinh :" );
			ngaysinh = sc.nextInt();
			h=0;
			setNgaysinh(ngaysinh);
		}
		catch ( Exception e){
			h=1;
			System.err.println(e.getMessage());
		}
	}
	while(h==0){
		try{
            System.out.println("nhap thang sinh :");
        thangsinh = sc.nextInt();
		h=1;
		    setThangsinh(thangsinh);
	}
	catch(Exception c){
		h=0;
        System.err.println(c.getMessage());
	}
}
	while(h==1){
		try{
            System.out.println("nhap nam sinh :");
       namsinh = sc.nextInt();
	   h=0;
            setNamsinh(namsinh);
	}
	catch(Exception c){
		h=1;
        System.err.println(c.getMessage());
	}
	}
    while(h==0){
        try{
			System.out.println("nhap socmnd :");
			socmnd = sc.next();
			h=1;
			setSocmnd(socmnd);
		}
		catch(Exception c){
			h=0;
			System.err.println(c.getMessage());
		}
	}
}
}
