package String;

import java.util.Stack;

public class validParenthesis {

	public static void main(String[] args) {
		String str = "({[[]})";
		System.out.println(isValid(str) ? "Valid String" : "Invalid String");
	}

	public static boolean isValid(String str) {

		Stack<Character> stack = new Stack<Character>();

		for (char ch : str.toCharArray()) {
			if (ch == '(' || ch == '{' || ch == '[') {
				stack.push(ch);
			} else {
				if (ch == ')' && stack.pop() != '(' || ch == ']' && stack.pop() != '['
						|| ch == '}' && stack.pop() != '{') {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}

}
