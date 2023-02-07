package main;


import java.util.ArrayList;

import entity.SinhVien;
import entity.SinhVienKhoaTuNhien;
import entity.SinhVienKhoaXaHoi;
import entity.codeX;

public class main {
	public static void main(String args[]) {
		
		//Sinh Vien Khoa Tu Nhien
		SinhVienKhoaTuNhien sv1=new SinhVienKhoaTuNhien("Nam","Khoa Tu Nhien",9.0,5.0,10.0);
		SinhVienKhoaTuNhien sv2=new SinhVienKhoaTuNhien("Sang","Khoa Tu Nhien",9.0,5.0,10.0);
		SinhVienKhoaTuNhien sv3=new SinhVienKhoaTuNhien("Vinh","Khoa Tu Nhien",1.0,5.0,6.0);
		//Sinh Vien Khoa Xa Hoi
		SinhVienKhoaXaHoi sv4=new SinhVienKhoaXaHoi("Kien","Khoa Xa Hoi",9.0,5.0,10.0);
		SinhVienKhoaXaHoi sv5=new SinhVienKhoaXaHoi("Lai","Khoa Xa Hoi",9.0,5.0,10.0);
		
		ArrayList<SinhVien> arrListSV =new ArrayList<>();
		arrListSV.add(sv1);
		arrListSV.add(sv2);
		arrListSV.add(sv3);
		arrListSV.add(sv4);
		arrListSV.add(sv5);
		
		
		
		
		
		
		
		System.out.println(">>>>  "+codeX.soPI.getCode());
		 
//		SinhVienKhoaTuNhien arr2[] = {sv1,sv2};
		//System.out.println(">> arr2.02.getTen = "+arr2[1].getTen());
		
//		System.out.println(">>Get(0): "+arrListSVKTN.get(0));
//		System.out.println(">>Get(1): "+arrListSVKTN.get(1));
//		System.out.println(">>Size: "+arrListSVKTN.size());
		
		
		
		
		
//		System.out.println("Java 8");
//		arrListSVKTN.forEach(e->{
//			e.output();
//		});
		
//		Bài Tập:
//			Tạo các methods cho SVKXH
//			Tạo 5 SV:2XH/3TN note giá trị bắt kì
//			Đếm SV Khoa
//			Tìm Sv TN( trên TB/Dưới Tb)
//			Tìm SV XH(Tên)
		
	}
//	public static void OutPutTypeSV(List<SinhVien> e) {
//		
//	}
	
}
