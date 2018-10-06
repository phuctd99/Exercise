package lab051;

import java.util.Scanner;

public class CamSanh extends QuaCam{
	CamSanh(){
		this.setLoaicam("Cam Sanh");
	}
	public void inThongTin(){
		System.out.println("Day la loai cam "+this.getLoaicam());
		super.inThongTin();//lop cha gan nhat
	}
}
