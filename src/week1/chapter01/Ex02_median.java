package week1.chapter01;

import java.util.Scanner;

public class Ex02_median {
	static int med3(int a, int b, int c) {
		/*Median에 비해 효율이 떨어짐
		 * 제어식(연산)의 횟수가 더 많음
		 * */ 
		if((b >= a && c <= a) || (b <= a && c >= a)) {
			return a;
		}else if((a > b && c < b) || (a < b && c > b)) {
			return b;
		}
		return c;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("중앙값 구하기 ver.2");
		System.out.print("a의 값 : ");
		int a = sc.nextInt();
		System.out.print("b의 값 : ");
		int b = sc.nextInt();
		System.out.print("c의 값 : ");
		int c = sc.nextInt();
		
		System.out.println("중앙값 : "+med3(a,b,c));
	}

}
