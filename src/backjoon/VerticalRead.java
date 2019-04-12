package backjoon;

import java.util.Scanner;

public class VerticalRead {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//5Line입력.
		String line1 = sc.nextLine();
		String line2 = sc.nextLine();
		String line3 = sc.nextLine();
		String line4 = sc.nextLine();
		String line5 = sc.nextLine();
		String result ="";
		// 5Line 중 가장 긴 문자열의 길이수를 구함
		int lineLenght =0;
		lineLenght = Math.max(line1.length(),lineLenght);
		lineLenght = Math.max(line2.length(),lineLenght);
		lineLenght = Math.max(line3.length(),lineLenght);
		lineLenght = Math.max(line4.length(),lineLenght);
		lineLenght = Math.max(line5.length(),lineLenght);
		// 가장긴 문자열의 길이만큼 반복
		for(int i=0;i<lineLenght;i++) {
			//반복문횟수보다 라인 길이가 짧으면 넘어감
			if(i < line1.length()) result += line1.charAt(i);						
			if(i < line2.length()) result += line2.charAt(i);				
			if(i < line3.length()) result += line3.charAt(i);	
			if(i < line4.length()) result += line4.charAt(i);							
			if(i < line5.length()) result += line5.charAt(i);				
		}
		System.out.println(result);
		
	}
}
