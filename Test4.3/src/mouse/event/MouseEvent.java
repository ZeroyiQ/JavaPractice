package mouse.event;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MouseEvent extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage pStage) {
		//设置文本，初始为"Java is fun"
		Text text = new Text(150, 25, "Java is fun");
		text.setFont(new Font("宋体",15));
		Pane pane = new Pane();
		pane.getChildren().add(text);
		//给pane添加鼠标监听器
		pane.setOnMouseClicked(e -> {
			if (e.getClickCount() % 2 == 1) {
				text.setText("Java is power");
			} else {
				text.setText("Java is fun");
			}
		});

		Scene scene = new Scene(pane, 300,50);
		pStage.setTitle("编程练习16-6");
		pStage.setScene(scene);
		pStage.setResizable(false);
		pStage.show();
	}
}
