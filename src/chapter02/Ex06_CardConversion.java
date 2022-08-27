package chapter02;

import java.util.Scanner;

public class Ex06_CardConversion {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("10진수를 기수변환합니다.");
		System.out.println("0보다 작은 정수는 절대값으로 치환됩니다.");
		
		System.out.print("변환할 정수 : ");
		int num = sc.nextInt();
		if(num<0) num = -num;
		System.out.println("입력한 정수 : "+num);
		
		int card;
		do {
			System.out.print("어떤 진수로 변환할까요? (2~36) : ");
			card = sc.nextInt();
		}while(card < 2 || card > 36);
		
		int digit = 0;
		int[] dno = new int[32];
		System.out.println(card+"|\t"+num);
		while(num > 0) {
			int r = num%card;
			num /= card;
			dno[digit] = r;
			digit++;
			System.out.println(" + ----------");
			if(num!=0)
				System.out.println(card+"|\t"+num+" --- "+r);
			else
				System.out.println("\t"+num+" --- "+r);
		}
		System.out.print(card+"진수로 ");
		for(int i=digit-1; i>=0; i--) {
			System.out.print(dno[i]);
		}
		System.out.println(" 입니다.");
	}

}
