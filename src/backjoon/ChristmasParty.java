package backjoon;


import java.util.Scanner;

public class ChristmasParty {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();	
		int m = sc.nextInt();
		int taget[] = new int[m];
		int gamePoint[] = new int [n];
		
		for(int i=0;i<m;i++) {
			taget[i] = sc.nextInt();
			if(i == m-1) {				
				sc.nextLine();
			}
		}
			
		for(int j = 0;j<m;j++) {
			for(int i=0;i<n;i++) {
				int tagerNum  =  taget[j] - 1;
				int nextInt = sc.nextInt() -1;
				if(taget[j] -1 == nextInt) {
					gamePoint[i] += 1;
				}else {
					gamePoint[tagerNum] += 1;
				}	
				if(i == n-1) {					
					sc.nextLine();
				}
			}
			
			
		}
		
		for(int i=0; i<n;i++) {
			System.out.println(gamePoint[i]);
		}
		
		
		
		
	}
}
