package progrom;

import javafx.scene.control.TextField;

public class ErrorClass {

	/**
	 * �ж��Ƿ��������ܹ�ɾ��
	 * 
	 * @param text
	 * @return
	 */
	public boolean backSpace(TextField text) {
		boolean temp = false;

		if (text.getLength() != 0) {
			temp = true;
		}
		return temp;
	}
	/**
	 * ���ж�x���Ƿ��������
	 * @param text
	 * @return
	 */
	public boolean derivative(TextField text) {
		Calculate calculate = new Calculate(text.getText());
		return calculate.ischEmpty();
	}

	/**
	 * �ж��Ƿ�ǿջ��߷����Ƿ��Ǵ�����
	 * 
	 * @param text
	 * @return
	 */
	public boolean plus_minus(TextField text) {
		Calculate calculate = new Calculate(text.getText());
		boolean temp = false;
		if (calculate.ischEmpty()) {
			temp = true;
			if (text.getText().equals("") || text.getText().equals("0")) {
				temp = false;
			}
		}
		return temp;
	}
}
