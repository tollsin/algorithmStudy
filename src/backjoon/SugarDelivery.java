package backjoon;

import java.util.Scanner;

public class SugarDelivery {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sugarTotal = sc.nextInt();
		int sugarF = 0;
		int sugarT = 0;
		
		while(sugarTotal%5 != 0 && sugarTotal >=0) {
			sugarT ++;
			sugarTotal -=3;
		}
		
		if(sugarTotal <0) {
			System.out.println(-1);	
		}else {
			sugarF  = sugarTotal/5;
			System.out.println(sugarT + sugarF);
		}
		
	}
		
}
