package backjoon;

import java.util.Scanner;

public class CompetitionOrIntern {
	public static void main(String[] args) {
		int women,men,intern;
		Scanner sc = new Scanner(System.in);
		women = sc.nextInt();
		men = sc.nextInt();
		intern = sc.nextInt();
		
		int team = 0;
		
		// 여학생이 2명이상 남학생이 1명이상 팀에 포함되지않은 학생 수가 인턴 + 3 보다 많이면 false
		while(women >= 2 && men >= 1 && women + men >= 3 + intern) {
			women -= 2;
			men--;
			team ++;
		}
		
		System.out.println(team);
		
	}
	
	
	
}
