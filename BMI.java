package lab04;

import java.util.Scanner;

public class BMI {
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		Double weight = sc.nextDouble();
		Double height = sc.nextDouble();
		Double BMI = weight/(height*height);
		
		if(BMI < 18.5) System.out.println("Thieu can");
		else if(18.5<=BMI && BMI<23) System.out.println("Binh thuong");
		else if(23<=BMI && BMI<24.99) System.out.println("Thua can");
		else if(BMI > 25) System.out.println("Beo phi");
		sc.close();
	}
}
