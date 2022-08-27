package chapter02;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex03_SumOfArray {
	
	static int sumOfArray(int[]a) {
		int sum = 0;
		for(int i=0; i<a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("원하는 배열의 길이를 입력하세요.");
		
		int length = sc.nextInt();
		int[] a = new int[length];
		
		for(int i=0; i<length; i++) {
			a[i] = rand.nextInt(20);
		}
		System.out.println(Arrays.toString(a));
		System.out.println("배열의 모든 요소의 합 = "+sumOfArray(a));
	}

}
