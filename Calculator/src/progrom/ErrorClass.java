package progrom;

import javafx.scene.control.TextField;

public class ErrorClass {

	/**
	 * 判断是否有文字能够删除
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
	 * 求倒判断x内是否含有运算符
	 * @param text
	 * @return
	 */
	public boolean derivative(TextField text) {
		Calculate calculate = new Calculate(text.getText());
		return calculate.ischEmpty();
	}

	/**
	 * 判断是否非空或者非零是否是纯数字
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
