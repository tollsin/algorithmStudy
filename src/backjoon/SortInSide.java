package backjoon;

import java.util.Arrays;
import java.util.Scanner;

public class SortInSide {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String numStr = sc.nextLine();
		
		Long num[] = new Long[numStr.length()];
		
		for(int i=0;i<numStr.length();i++) {
			num[i] = Long.parseLong(numStr.charAt(i)+"");
		}

		Arrays.sort(num);

		for(int i=num.length-1 ; i >=0 ;i--) {
			System.out.print(num[i]);

		}
		
	
	}
}
