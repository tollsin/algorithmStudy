package backjoon;

import java.util.Scanner;

public class TwoThousandSevenYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int day =0;		
		// 1월 일떄는 일수만 계산
		if(x == 1) {
			day = y;
		}else {
			// 월에 맞게 일수 계산
			for(int i=1; i<x;i++) {
				if(i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12 ) {
					day = day + 31;
				}else if(i == 2) {
					day = day + 28;
				}else {
					day = day + 30;
				}	
			}
			day = day + y;
		}
		// 7일 기준으로 나눈후 올림
		int k = (int) Math.ceil(day % 7);	
		String result = "";	
		if(k == 1) result = "MON";
		else if(k == 2) result = "TUE";
		else if(k == 3) result = "WED";	
		else if(k == 4) result = "THU";
		else if(k == 5) result = "FRI";
		else if(k == 6) result = "SAT";	
		else if(k == 0) result = "SUN";		
		System.out.println(result);

	}
}
