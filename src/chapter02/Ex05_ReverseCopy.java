package chapter02;

import java.util.Arrays;
import java.util.Scanner;

public class Ex05_ReverseCopy {
	
	static void rcopy(int[] a, int[] b) {
		int last = b.length-1;
		for(int i=0; i<a.length; i++) {
			b[last] = a[i];
			last--;
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
		rcopy(a,b);
		System.out.println("입력한 배열 a :"+Arrays.toString(a));
		System.out.println("a를 거꾸로 복사한 배열 b:"+Arrays.toString(b));
	}

}
