package entity;

public abstract class SinhVien {
	public static String Truong="JavaBasic";
	private String Ten;
	private String Khoa;
	private Double DiemTB;
	
	
	public Double getDiemTB() {
		return DiemTB;
	}
	public void setDiemTB(Double diemTB) {
		DiemTB = diemTB;
	}
	public String getTen() {
		return Ten;
	}
	public void setTen(String ten) {
		Ten = ten;
	}
	public String getKhoa() {
		return Khoa;
	}
	public void setKhoa(String khoa) {
		Khoa = khoa;
	}
	public SinhVien(String Ten,String Khoa){
		this.Ten =Ten;
		this.Khoa=Khoa;
	}
	public void outputSV() {
		System.out.println("{ Truong: "+Truong +"  "
							+"Ten: "+this.getTen()+"  "
							+"Khoa: "+this.getKhoa()+"  "
							);
	}

}
