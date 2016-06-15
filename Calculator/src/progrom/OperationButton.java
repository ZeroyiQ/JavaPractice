package progrom;

import javafx.scene.control.TextField;

public class OperationButton {
	private ErrorClass error = new ErrorClass();
	private NumberButton numFlag = new NumberButton();
	
	/**
	 * 根据不同的运算符，调用各自方法
	 * @param text	文本框
	 * @param operation	运算符
	 */
	public void setTextField(TextField text, String operation) {
		switch (operation) {
		case "+":
			numFlag.setFlag(0);
			this.addText(text, operation);
			break;
		case "-":
			numFlag.setFlag(0);
			this.addText(text, operation);
			break;
		case "*":
			numFlag.setFlag(0);
			this.addText(text, operation);
			break;
		case "/":
			numFlag.setFlag(0);
			this.addText(text, operation);
			break;
		case "C":
			text.setText("");
			break;
		case "退格":
			//判断下是否文本框不为空
			if (error.backSpace(text)) {
				text.setText(text.getText(0, text.getLength() - 1));
			}
			break;
		case "1/x":
			if (error.derivative(text)) {
				text.setText("1/"+text.getText());
			}else{
				text.setText("1/(" + text.getText()+")");
			}
			
			break;
		case "+/-":
			if (error.plus_minus(text)) {
				double i = -1 * Double.parseDouble(text.getText());
				text.setText("" + i);
			}

			break;
		case ".":
			this.addText(text, operation);
			break;
		case "=":
			numFlag.setFlag(1);
			
			//创建Calculate类，传入文本框的内容
			Calculate calculate = new Calculate(text.getText());
			
			//计算结果，抛出异常
			try {
				text.setText("" + calculate.equal());
			} catch (Exception e1) {
				text.setText(e1.getMessage());

			}
			break;
		default:
			break;
		}
	}
	
	/**
	 * 添加运算符号
	 * @param text	文本框
	 * @param operation	运算符
	 */
	public void addText(TextField text, String operation) {
		text.setText(text.getText() + operation);
	}
}
