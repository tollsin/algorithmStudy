package backjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;


public class DeudBoJab {
	public static void main(String[] args) {
		int n,m;
		
		HashSet<String> sound;
		ArrayList<String> see,result ;	
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		sc.nextLine();
		sound = new HashSet<String>();		
		see = new ArrayList<String>();
		result = new ArrayList<String>();
		
		for(int i=0;i<n; i++) {
			sound.add(sc.nextLine());
		}
		for(int i=0;i<m;i++) {
			see.add(sc.nextLine());
		}
		
		for(String aa :see) {
			if(sound.contains(aa)) {
				result.add(aa);
			}
		}
		Collections.sort(result);
		System.out.println(result.size());
		for(String rr : result ) {
			System.out.println(rr);
		} 
	}
}