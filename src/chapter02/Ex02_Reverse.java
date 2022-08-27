package chapter02;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex02_Reverse {
	
	static void swap(int[]a, int i, int j) {
		int temp = a[j];
		a[j] = a[i];
		a[i] = temp;
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
		
		for(int i=0; i<length/2; i++) {
			int j = length-i-1;
			System.out.println("a["+i+"]와 a["+j+"]을 교환합니다.");
			swap(a,i,j);
			System.out.println(Arrays.toString(a));
		}
		
		System.out.println("역순 정렬을 마쳤습니다.");
	}

}
