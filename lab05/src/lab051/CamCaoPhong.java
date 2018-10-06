package lab051;

import java.util.Scanner;

public class CamCaoPhong extends QuaCam{
	CamCaoPhong(){
		this.setLoaicam("Cam Cao Phong");
	}
	public void inThongTin(){
		System.out.println("Day la loai cam "+this.getLoaicam());
		super.inThongTin();//lop cha gan nhat
	}
}
