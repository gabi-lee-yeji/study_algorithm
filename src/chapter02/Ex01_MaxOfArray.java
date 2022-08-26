package chapter02;

import java.util.Random;
import java.util.Scanner;

public class Ex01_MaxOfArray {
	static int maxOf(int[] a) {
		int max = a[0];
		for(int i=0; i<a.length; i++) {
			if(a[i]>max) max = a[i];
		}
		return max;
	}
	
	public static void main(String[] args) {
		Random rand = new Random();
		
		System.out.println("키의 최대값 구하기");
		int num = rand.nextInt(10);
		int height[] = new int[num];
		System.out.println("사람 수 :"+num);
		System.out.println("===키(height)===");
		for(int i=0; i<num; i++) {
			height[i] = 100+rand.nextInt(100);
			System.out.println("height["+i+"] :"+height[i]);
		}
		System.out.println("키의 최댓값 :"+maxOf(height));
	}

}
