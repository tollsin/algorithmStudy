package backjoon;

import java.util.Scanner;

public class StairsClimb {
	
	public static void main(String[] args) {
		int n,stairs[],dp[];

		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		stairs = new int[n+1];
		dp = new int[n+1];
		
		for(int i=1;i<=n;i++) {
			stairs[i] = sc.nextInt();
		}
		dp[1] = stairs[1];

		if(n >= 2) dp[2] = dp[1]+stairs[2];
	    
		
	    for(int i=3;i<=n;i++) {
			dp[i] = Math.max(stairs[i-1]+dp[i-3]+stairs[i],dp[i-2]+stairs[i]);
			   
		}
		System.out.println(dp[n]);	
	}
}
