package progrom;

import javafx.scene.control.TextField;

public class NumberButton {

	/**
	 * ���þ�̬���� flag �����ж��ı����Ƿ�Ҫ��պ������ֵ
	 */
	private static int flag = 0;

	public void setFlag(int flag) {
		NumberButton.flag = flag;
	}

	/**
	 * �����ֵ
	 * 
	 * @param text
	 *            �ı���
	 * @param num
	 *            ������ֵ
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
