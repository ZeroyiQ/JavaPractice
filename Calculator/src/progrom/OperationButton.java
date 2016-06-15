package progrom;

import javafx.scene.control.TextField;

public class OperationButton {
	private ErrorClass error = new ErrorClass();
	private NumberButton numFlag = new NumberButton();
	
	/**
	 * ���ݲ�ͬ������������ø��Է���
	 * @param text	�ı���
	 * @param operation	�����
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
		case "�˸�":
			//�ж����Ƿ��ı���Ϊ��
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
			
			//����Calculate�࣬�����ı��������
			Calculate calculate = new Calculate(text.getText());
			
			//���������׳��쳣
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
	 * ����������
	 * @param text	�ı���
	 * @param operation	�����
	 */
	public void addText(TextField text, String operation) {
		text.setText(text.getText() + operation);
	}
}
