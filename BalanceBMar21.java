import java.util.*;
public class BalanceBMar21 {

	static void BracketsBalance(String expr) {
		Deque<Character> stack = new ArrayDeque<Character>();
		String expr1 = expr;
		for (int i = 0; i < expr.length(); i++) {
			char x = expr.charAt(i);

			if (x == '(' || x == '[' || x == '{') {
				stack.push(x);
				continue;
			}
			switch (x) {
			case ')':
				stack.pop();
				break;

			case '}':
				stack.pop();
				break;

			case ']':
				stack.pop();
				break;
			}
		}
		while (!stack.isEmpty()) {
			char c = stack.pop();
			char k;
			switch (c) {
			case '(':
				k = ')';
				expr1 = expr1 + Character.toString(k);
				break;
			case '{':
				k = '}';
				expr1 = expr1 + Character.toString(k);
				break;
			case '[':
				k = ']';
				expr1 = expr1 + Character.toString(k);
				break;
			}

		}
		System.out.println(expr1);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String expr = new String();
		expr=sc.nextLine();
		BracketsBalance(expr);
	}
}
