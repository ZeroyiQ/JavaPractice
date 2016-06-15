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
		//�����ı�����ʼΪ"Java is fun"
		Text text = new Text(150, 25, "Java is fun");
		text.setFont(new Font("����",15));
		Pane pane = new Pane();
		pane.getChildren().add(text);
		//��pane�����������
		pane.setOnMouseClicked(e -> {
			if (e.getClickCount() % 2 == 1) {
				text.setText("Java is power");
			} else {
				text.setText("Java is fun");
			}
		});

		Scene scene = new Scene(pane, 300,50);
		pStage.setTitle("�����ϰ16-6");
		pStage.setScene(scene);
		pStage.setResizable(false);
		pStage.show();
	}
}
