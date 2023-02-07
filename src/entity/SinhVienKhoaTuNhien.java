package entity;

public class SinhVienKhoaTuNhien extends SinhVien{
	private Double Toan;
	private Double Ly;
	private Double Hoa;
	public Double getToan() {
		return Toan;
	}
	public void setToan(Double toan) {
		Toan = toan;
	}
	public Double getLy() {
		return Ly;
	}
	public void setLy(Double ly) {
		Ly = ly;
	}
	public Double getHoa() {
		return Hoa;
	}
	public void setHoa(Double hoa) {
		Hoa = hoa;
	}
	public SinhVienKhoaTuNhien(String Ten,String Khoa,Double Toan,Double Ly,Double Hoa){
		 super(Ten, Khoa);
		 this.Toan= Toan;
		 this.Ly= Ly;
		 this.Hoa= Hoa;
		 super.setDiemTB(DiemTBTN());
	 }
	public void outputTN() {
		super.outputSV();
		System.out.println("Toan: "+this.getToan()+"  "
							+"Ly: "+this.getLy()+"  "
							+"Hoa: "+this.getHoa());
	}
	public double DiemTBTN() {
		return((this.getToan()*2)+this.getLy()+this.getHoa())/4;
			
	}
}
