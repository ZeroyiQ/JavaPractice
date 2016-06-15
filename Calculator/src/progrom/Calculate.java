package progrom;

import java.util.Stack;

public class Calculate {
	// ����һ���ַ�ջ��
	private Stack<Character> signStack;
	// ����һ������ջ��
	private Stack<Double> numStack;
	private StringBuffer text;
	private boolean flag = false;

	/**
	 * calculate�Ĺ�����
	 * 
	 * @param text
	 */
	public Calculate(String text) {
		this.text = new StringBuffer(text);
		this.signStack = new Stack<Character>();
		this.numStack = new Stack<Double>();
	}

	public boolean ischEmpty() {
		text.deleteCharAt(0);
		while (text.length() > 0) {
			char ch = text.charAt(0);
			text.deleteCharAt(0);
			switch (ch) {
			case '*':
			case '/':
			case '+':
			case '-':
				signStack.push(ch);
				break;

			default:
				break;
			}
		}
		return signStack.isEmpty();
	}

	/**
	 * ������ʽ��ֵ
	 * 
	 * @return
	 * @throws Exception
	 */
	public double equal() throws Exception {

		// �ж��ַ����Ƿ�ȡ��
		while (text.length() > 0) {

			// ��ȡ��ǰ�ַ����ĵ�һ���ַ���
			char ch = text.charAt(0);
			text.deleteCharAt(0);
			double num = 0;
			boolean flagNum = false;

			// ����ǰ��ȡ���������֡�
			while (ch >= '0' && ch <= '9') {
				num = num * 10 + ch - '0';
				flagNum = true;
				if (text.length() > 0) {
					ch = text.charAt(0);
					text.deleteCharAt(0);
				} else {
					break;
				}
			}

			// ����ǰ��ȡ������С����
			if (ch == '.') {
				double point = 1;
				if (text.length() > 0) {
					ch = text.charAt(0);
					text.deleteCharAt(0);
					while (ch >= '0' && ch <= '9') {
						point *= 10;
						num += (ch - '0') / point;
						flagNum = true;
						if (text.length() > 0) {
							ch = text.charAt(0);
							text.deleteCharAt(0);
						} else {
							break;
						}
					}
				} else {
					throw new IllegalArgumentException("������ʽ��ʽ���Ϸ�!!");
				}

			}

			// ȡ�����֣�������ѹջ
			if (flagNum) {
				if (flag) {
					num = -1 * num;
					flag = false;
				}
				numStack.push(num);
				// ���������ʽ�Ľ����Ѿ������ˡ�
				if (text.length() == 0 && ch >= '0' && ch <= '9') {
					break;
				}
			}

			// �����ж�
			if (ch == '-' && numStack.isEmpty()) {
				flag = true;
				continue;
			}

			// ������ջΪ�� ջ��Ԫ��Ϊ������ ch�������� ��ֱ�ӽ�����ѹ��ջ
			if (signStack.isEmpty() || signStack.peek() == '(' || ch == '(') {
				signStack.push(ch);
				continue;
			}
			switch (ch) {
			case ')': {// ����ǰ������������,�򲻶ϵĵ���һ���������������������ֱ������������Ϊֹ
				while (this.numStack.size() >= 2 && !signStack.isEmpty() && signStack.peek() != '(') {
					this.cal();
				}
				if (!this.signStack.isEmpty() && signStack.peek() == '(') {
					this.signStack.pop(); // ������������š�
					continue;
				}
			}
			case '*':
			case '/':
				// ������ջջ��Ԫ��Ϊ+��-��(
				// ���߷���ջΪ�գ�����ζ�ŷ���ջջ�����ű�ch���ȼ��ף����ԣ���chѹջ�����򣬽�����ջջ��Ԫ�ص�������Ȼ��ʼ����
				while (numStack.size() >= 2 && !(signStack.isEmpty() || signStack.peek() == '('
						|| signStack.peek() == '+' || signStack.peek() == '-')) {
					this.cal(); 
				}
				// ������ջջ��Ԫ�����ȼ���ch�ĵ͡�
				if (signStack.isEmpty() || this.signStack.peek() == '(' || this.signStack.peek() == '+'
						|| this.signStack.peek() == '-') {
					signStack.push(ch);
					continue;
				}
			case '+':
			case '-': {
				// ����ǰ����ջջ��Ԫ�ز���(������ջҲ��Ϊ�գ��򽫷���ջջ��Ԫ�ص�������Ȼ��ʼ����
				while (numStack.size() >= 2 && (!signStack.isEmpty() || signStack.peek() != '(')) {
					cal();
				}
				if (signStack.isEmpty() || signStack.peek() == '(') {
					// ������ջջ��Ԫ��Ϊ(�������ջΪ�գ���chѹջ
					signStack.push(ch);
					continue;
				} else {
					throw new IllegalArgumentException("������ʽ��ʽ���Ϸ�!");
				}
			}
			default:
				throw new IllegalArgumentException("������Ƿ�!");
			}
		}

		while (!signStack.isEmpty() && numStack.size() >= 2) {
			this.cal();
		}
		// ����������ջ�н���һ��Ԫ�أ���֤�����ʽ��ȷ��ջ��Ԫ�ؾ��Ǳ��ʽ��ֵ
		return this.numStack.size() == 1 ? this.numStack.pop() : 0;
	}

	/**
	 * ����ָ���Ĳ����������������������
	 * 
	 * @throws Exception
	 */
	private void cal() throws Exception {
		double b = numStack.pop();
		double a = numStack.pop();
		char op = signStack.pop();
		double result = 0;
		switch (op) {
		case '+':
			result = a + b;
			break;
		case '-':
			result = a - b;
			break;
		case '*':
			result = a * b;
			break;
		case '/':
			if (b == 0) {
				// �����쳣
				throw new ArithmeticException("��������Ϊ0!");
			}
			result = a / b;
			break;
		default:
			break;
		}
		// ������Ľ��ѹջ��
		this.numStack.push(result);
	}
}