package ui;

import javafx.application.Application;
import progrom.*;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class UI extends Application {

	// 创建文本框
	private TextField field = new TextField();

	public TextField getField() {
		return this.field;
	}

	public void setField(TextField field) {
		this.field = field;
	}

	// 程序启动入口
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) {
		// 初始化文本框
		field.setText("");

		// 设置文本框
		field.setAlignment(Pos.CENTER_RIGHT);
		field.setEditable(false);

		// 设置布局
		BorderPane borderPane = new BorderPane();
		borderPane.setTop(field);
		borderPane.setCenter(getkey());

		Scene scene = new Scene(borderPane, 240,170);
//		scene.getStylesheets().add(UI.class.getResource("ui.css").toExternalForm());

		stage.setScene(scene);
		stage.setResizable(false);
		stage.setTitle("计算器");
		stage.show();

	}

	/**
	 * 得到按钮
	 * 
	 * @return GridPane key
	 */
	private GridPane getkey() {

		// 创建网格布局
		GridPane gridPane = new GridPane();

		// 创建 按钮组
		Button[] btn_num = new Button[10];
		Button[] btn_sign = new Button[10];
		String[] sign = new String[] { "+", "C", "-", "退格", "*", "1/x", "+/-", ".", "/", "=" };
		NumberButton numberButton = new NumberButton();
		OperationButton operationButton = new OperationButton();

		// 设置数字按钮
		for (int i = 0; i < btn_num.length; i++) {
			int temp = i;
			btn_num[i] = new Button("" + i);
			btn_num[i].setPrefSize(50, 40);
			btn_num[i].setStyle("-fx-text-fill: black");
			btn_num[i].setOnAction(e -> {
				numberButton.setTextField(field, temp);
			});

		}

		// 设置运算符号按钮
		for (int i = 0; i < sign.length; i++) {
			String operation = sign[i];
			btn_sign[i] = new Button(sign[i]);
			btn_sign[i].setPrefSize(50, 40);
			btn_sign[i].setStyle("-fx-text-fill:blue");
			btn_sign[i].setOnAction(e -> {
				operationButton.setTextField(field, operation);
			});
		}

		// 设置前三行界面
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				gridPane.add(btn_num[i * 3 + j + 1], j, i);
			}
			for (int j = 0; j < 2; j++) {
				gridPane.add(btn_sign[i * 2 + j], j + 3, i);
			}
		}

		// 设置最后一行界面
		for (int i = 0; i < 5; i++) {
			if (i == 0) {
				gridPane.add(btn_num[i], i, 3);
			} else {
				gridPane.add(btn_sign[5 + i], i, 3);
			}
		}

		return gridPane;
	}

}
