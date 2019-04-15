package backjoon;

import java.util.Scanner;

public class Yogurt {
		
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);

		String result[] = new String[3];
		int aCount = 0;
		int bCount = 0;
		
		for(int j=0; j <result.length;j++) {
			for(int i=0; i <=3;i++) {
				int nextInt = sc.nextInt();
				
				if(nextInt == 0) {
					aCount ++;
				}else if(nextInt == 1) {
					bCount ++;
				}
				
				if(i != 3) {
					//sc.nextLine();
				}else {
					// 0 => 1 1 => 3  도
					// 0 => 2 1 => 2  개
					// 0 => 3 1 => 1  걸
					// 0 => 4 1 => 0  윷
					// 0 => 0 1 => 4  모
					if(aCount == 1 && bCount == 3) {
						result[j] = "A";
					}else if(aCount == 2 && bCount == 2) {
						result[j] = "B";
					}else if(aCount == 3 && bCount == 1) {
						result[j] = "C";
					}else if(aCount == 4 && bCount == 0) {
						result[j] = "D";
					}else if(aCount == 0 && bCount == 4) {
						result[j] = "E";
					}
					aCount = 0;
					bCount = 0;
				}
				
			}
		}
		
		for(int i=0;i<3;i++) {
			System.out.println(result[i]);
		}
	}
}
