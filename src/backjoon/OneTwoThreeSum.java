package backjoon;

import java.util.Scanner;

public class OneTwoThreeSum {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,dp[];
		int x = 100;
		int T =0;	
		Scanner sc = new Scanner(System.in);
		//T = sc.nextInt();		
	
		dp = new int[101];

		dp[0] = 1;
		
		dp[1] = 1;
		
		dp[2] = 2;

		for(int i=3;i<=x;i++ ) {
			dp[i] = dp[i-1] + dp[i-2] + dp[i-3];				
		}
		
		int count =0;
		
		for(int i=0;i<=x;i++) {
			System.out.println(dp[i]);
		}
		
	/*	while(T != count) {
		
			n = sc.nextInt();			
			
			System.out.println(dp[n]);
			
			count++;
		}*/
	}
}
