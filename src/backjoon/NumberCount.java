package backjoon;

import java.util.Scanner;



public class NumberCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		Long mut = (long) (a*b*c);
		int numberArr[] = new int[10]; 
		
		String number = mut + "";
		
		for(int i=0;i < number.length();i++) {
			numberArr[Integer.parseInt(number.charAt(i) + "")] += 1;
			
		}
		
		for(int i=0; i< numberArr.length;i++) {
			System.out.println(numberArr[i]);
		}
		
	}	
}
