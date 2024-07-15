package kosa.mission;

import java.util.Scanner;
import java.util.Stack;

public class StackMission {
	public static void main(String[] args) {
		// Ű����κ��� ���� ������ �Է�
		// ((2+3)+10) => ��ȣ�� ��ġ�ϴ��� ����ġ�ϴ��� �Ǵ�
		Stack<String> stack = new Stack<String>();

		Scanner sc = new Scanner(System.in);

		// Ű����κ��� �Է��� �޴´�.
		String input = sc.nextLine();

		// try catch ���� ���� ������ '(' �� ��� stack�� push�ǰ� ')' �� ��� stack�� �����ϴ� '('�� pop�� �Ǿ� �����µ�
		// ���� ')' �� '(' ���� �� ���� ��� �̹� stack���� �����ϴ� '('�� ���µ� '('�� ���ߵǴ� ��Ȳ�� �߻��� �� �����Ƿ� 
		// EmptyStackException ���ܰ� �߻��Ѵ�. �׷��Ƿ� ���� �߻��� �� catch ���� "��ȣ�� ����ġ �մϴ�"��� ������ �ֱ� ���ؼ� try catch �� �ۼ�!
		try {
			// Ű����κ��� �Է¹��� ���ڸ� �ϳ��� char�� �ִ´�.
			for (int i = 0; i < input.length(); i++) {
				char c = input.charAt(i);
				// Ű����κ��� �Է¹��� ���� �߿��� '(' �� stack�� �ִ´�.
				if (c == '(') {
					// stack�� push�� ��� String�� �� �� �ֱ� ������ char�� '' �̰� String�� "" �̱� ������ char �ڿ� "" �ٿ��ֱ�
					stack.push(c + "");
					// Ű����κ��� �Է¹��� ���� �߿��� ')'�� ���� ��� stack�� �����ϴ� '('�� pop ���ش�!
				} else if (c == ')') {
					stack.pop();
				}
			}
			// stack �ȿ� '('�� ���ٸ� '('�� ')'�� ���� ��ġ�ϱ� ������ �ùٸ� ��ȣ�� �ȴ�!
			if (stack.isEmpty()) {
				System.out.println("��ȣ�� ��ġ�ϴ�.");
				// stack �ȿ� '('�� �����Ѵٸ� '('�� ')'�� ���� ����ġ�ϱ� ������ �ùٸ� ��ȣ�� �ƴϴ�!
			} else {
				System.out.println("��ȣ�� ����ġ �ϴ�");
			}
			// stack�ȿ� '('�� �������� �ʴµ� ')'�� ���� '('�� pop�ؾ� �ϴ� ��Ȳ�� �߻��ϸ� ���ܰ� �߻��ϹǷ� ����ó�����ش�!
		} catch (Exception e) {
			System.out.println("��ȣ�� ����ġ �ϴ�");
		}
	}
}
