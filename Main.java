package lab04;

public class Main {
	public static void main(String [] args){
		int a = bigger(3,5);
		System.out.println(a);
	}
	// ham tim so lon hon
	public static int bigger(int x, int y){
		return (x > y ? x : y);
	}
	// ham tim gia tri nho nhat cua mang so nguyen
	public static int minArray(int[] arr){
		int min = Integer.MAX_VALUE;
		for(int i=0; i<arr.length; i++){
			if(arr[i] < min) min = arr[i];
		}
		return min;
	}
}
