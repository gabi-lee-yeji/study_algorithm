package chapter02;

import java.util.Arrays;
import java.util.Scanner;

public class Ex04_CopyArray {
	static void copy(int[]a, int[]b) {
		for(int i=0; i<a.length; i++) {
			b[i] = a[i];
		}
	}
	
	public static void main(String[] args) {
		System.out.println("원하는 배열의 길이를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int[] a = new int[length];
		int[] b = new int[length];		
		
		for(int i=0; i<length; i++) {
			System.out.print("a["+i+"]의 값: ");
			a[i] = sc.nextInt();
		}
		copy(a,b);
		System.out.println("입력한 배열 a :"+Arrays.toString(a));
		System.out.println("a를 복사한 배열 b:"+Arrays.toString(b));
	}

}
