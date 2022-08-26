package week1.chapter01;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		System.out.print("a : "); 
		int a = sc.nextInt();
		System.out.print("b : "); 
		int b = sc.nextInt();
		System.out.print("c : "); 
		int c = sc.nextInt();
		System.out.print("d : "); 
		int d = sc.nextInt();
		
		System.out.println("입력한 숫자 중 최대값 : "+max4(a,b,c,d));
		System.out.println("입력한 숫자 중 최소값 : "+min4(a,b,c,d));
	}
	
	static int max4(int a, int b, int c, int d) {
		int max = a;
		if(b > max) max = b;
		if(c > max) max = c;
		if(d > max) max = d;
		return max;
	}
	
	static int min3(int a, int b, int c) {
		int min = a;
		if(b < min) min = b;
		if(c < min) min = c;
		return min;
	}
	
	static int min4(int a, int b, int c, int d) {
		int min = a;
		if(b < min) min = b;
		if(c < min) min = c;
		if(d < min) min = d;
		return min;
	}
}
