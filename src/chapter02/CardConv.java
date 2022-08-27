package chapter02;

import java.util.Arrays;
import java.util.Scanner;

public class CardConv {
	
	static int cardConv(int x, int r, char[] d) {
		int digits = 0;
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		//x = 입력받은 수, r = 변환할 진수
		do {
			d[digits++] = dchar.charAt(x%r);
			x /= r;
		}while (x != 0);
		
		for(int i=0; i<digits/2; i++) {
			char t = d[i];
			d[i] = d[digits-i-1];
			d[digits-i-1] = t;
		}
		
		return digits;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no, cd, dno;
		boolean retry = true;
		char[] cno = new char[32];
		
		System.out.println("10진수를 기수 변환합니다.");
		while(retry) {
			System.out.print("변환할 음이 아닌 정수 : ");
			no = sc.nextInt();
			if(no<0) {
				System.out.println("0보다 작은 수는 절대값으로 치환됩니다.");
				no = -no;
			}
			
			do {
				System.out.print("어떤 진수로 변환할까요? ");
				cd = sc.nextInt();
			}while(cd < 2 || cd > 36);
			
			dno = cardConv(no, cd, cno);
			
			System.out.print(cd+"진수로 ");
			for(int i=0; i<dno; i++) {
				System.out.print(cno[i]);
			}
			System.out.println(" 입니다.");
			
			System.out.println("한번 더 변환할까요? (1 = 예 / 0 = 아니요)");
			if(sc.nextInt()==0) retry = false;
		}
	}

}
