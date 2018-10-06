package lab051;

public class QuaCam extends HoaQua{
	private String loaicam;
	public void inThongTin(){
		System.out.println("Day la qua cam");
		super.inThongTin();  //super goi den lop cha gan nhat
	}
	public String getLoaicam() {
		return loaicam;
	}
	public void setLoaicam(String loaicam) {
		this.loaicam = loaicam;
	}
}
