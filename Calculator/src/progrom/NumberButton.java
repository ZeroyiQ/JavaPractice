package progrom;

import javafx.scene.control.TextField;

public class NumberButton {

	/**
	 * 设置静态常数 flag 用来判断文本框是否要清空后添加数值
	 */
	private static int flag = 0;

	public void setFlag(int flag) {
		NumberButton.flag = flag;
	}

	/**
	 * 添加数值
	 * 
	 * @param text
	 *            文本框
	 * @param num
	 *            增添数值
	 */
	public void setTextField(TextField text, int num) {
		if (flag == 1) {

			text.setText("" + num);
			NumberButton.flag = 0;
		} else {
			text.setText(text.getText() + num);
		}
	}
}
