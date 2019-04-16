package backjoon;
import java.util.*;

public class BackJoonStack {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer>stack = new Stack<Integer>();
		
		int n = sc.nextInt();
		
		for(int i=0;i<=n;i++) {
			String command =  sc.nextLine();
			String sub[] = command.split(" ");
			
			switch (sub[0]) {
			case "top":
				System.out.println(stack.isEmpty() ? -1:stack.peek());
				break;
			case "empty":
				System.out.println(stack.isEmpty() ? 1:0 );
				break;
			case "size":
				System.out.println(stack.size());
				break;
			case "pop":
				System.out.println(stack.isEmpty() ? -1:stack.pop());
				break;
			case "push":
				stack.push(Integer.parseInt(sub[1]));
				break;

			}			
		}
	}
}
