package progrom;

import java.util.Stack;

public class Calculate {
	// 创建一个字符栈。
	private Stack<Character> signStack;
	// 创建一个数字栈。
	private Stack<Double> numStack;
	private StringBuffer text;
	private boolean flag = false;

	/**
	 * calculate的构造器
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
	 * 计算表达式的值
	 * 
	 * @return
	 * @throws Exception
	 */
	public double equal() throws Exception {

		// 判断字符串是否取完
		while (text.length() > 0) {

			// 获取当前字符串的第一个字符。
			char ch = text.charAt(0);
			text.deleteCharAt(0);
			double num = 0;
			boolean flagNum = false;

			// 若当前读取到的是数字。
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

			// 若当前读取到的是小数点
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
					throw new IllegalArgumentException("输入表达式格式不合法!!");
				}

			}

			// 取得数字，则将数字压栈
			if (flagNum) {
				if (flag) {
					num = -1 * num;
					flag = false;
				}
				numStack.push(num);
				// 若整个表达式的解析已经结束了。
				if (text.length() == 0 && ch >= '0' && ch <= '9') {
					break;
				}
			}

			// 符号判断
			if (ch == '-' && numStack.isEmpty()) {
				flag = true;
				continue;
			}

			// 若符号栈为空 栈顶元素为左括号 ch是左括号 则直接将符号压入栈
			if (signStack.isEmpty() || signStack.peek() == '(' || ch == '(') {
				signStack.push(ch);
				continue;
			}
			switch (ch) {
			case ')': {// 若当前符号是右括号,则不断的弹出一个运算符和两个操作数，直到遇到左括号为止
				while (this.numStack.size() >= 2 && !signStack.isEmpty() && signStack.peek() != '(') {
					this.cal();
				}
				if (!this.signStack.isEmpty() && signStack.peek() == '(') {
					this.signStack.pop(); // 弹出这个左括号。
					continue;
				}
			}
			case '*':
			case '/':
				// 若符号栈栈顶元素为+、-、(
				// 或者符号栈为空，则意味着符号栈栈顶符号比ch优先级底，所以，将ch压栈。否则，将符号栈栈顶元素弹出来，然后开始计算
				while (numStack.size() >= 2 && !(signStack.isEmpty() || signStack.peek() == '('
						|| signStack.peek() == '+' || signStack.peek() == '-')) {
					this.cal(); 
				}
				// 若符号栈栈顶元素优先级比ch的低。
				if (signStack.isEmpty() || this.signStack.peek() == '(' || this.signStack.peek() == '+'
						|| this.signStack.peek() == '-') {
					signStack.push(ch);
					continue;
				}
			case '+':
			case '-': {
				// 若当前符号栈栈顶元素不是(，符号栈也不为空，则将符号栈栈顶元素弹出来，然后开始计算
				while (numStack.size() >= 2 && (!signStack.isEmpty() || signStack.peek() != '(')) {
					cal();
				}
				if (signStack.isEmpty() || signStack.peek() == '(') {
					// 若符号栈栈顶元素为(、或符号栈为空，则将ch压栈
					signStack.push(ch);
					continue;
				} else {
					throw new IllegalArgumentException("输入表达式格式不合法!");
				}
			}
			default:
				throw new IllegalArgumentException("运算符非法!");
			}
		}

		while (!signStack.isEmpty() && numStack.size() >= 2) {
			this.cal();
		}
		// 若最终数字栈中仅存一个元素，则证明表达式正确，栈顶元素就是表达式的值
		return this.numStack.size() == 1 ? this.numStack.pop() : 0;
	}

	/**
	 * 依据指定的操作数、运算符，进行运算
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
				// 算术异常
				throw new ArithmeticException("除数不能为0!");
			}
			result = a / b;
			break;
		default:
			break;
		}
		// 将运算的结果压栈。
		this.numStack.push(result);
	}
}