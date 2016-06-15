package controlcircle;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class BallMspaint extends Application {
	protected CirclePane circlePane = new CirclePane();

	public static void main(String[] args) {
		launch(args);

	}

	/**
	 * 用HBox横向布局 排布四个（Left、Right、Up、Down）四个按钮
	 * 
	 * @return hBox
	 */
	private HBox getHBox() {
		HBox hBox = new HBox(10);
		hBox.setAlignment(Pos.CENTER);
		hBox.setStyle("-fx-background-color: #336699");
		hBox.setPadding(new Insets(10, 15, 10, 15));

		Button btn_left = new Button("Left");
		Button btn_right = new Button("Right");
		Button btn_up = new Button("Up");
		Button btn_down = new Button("down");
		btn_down.setPrefSize(50, 20);
		btn_up.setPrefSize(50, 20);
		btn_right.setPrefSize(50, 20);
		btn_left.setPrefSize(50, 20);

		// 设置监听器
		btn_left.setOnAction(e -> {
			circlePane.left();
		});
		btn_right.setOnAction(e -> {
			circlePane.right();
		});
		btn_up.setOnAction(e -> {
			circlePane.up();
		});
		btn_down.setOnAction(e -> {
			circlePane.down();
		});

		hBox.getChildren().addAll(btn_left, btn_right, btn_up, btn_down);
		return hBox;
	}

	@Override
	public void start(Stage primaryStage) {
		BorderPane borderPane = new BorderPane();
		// 设置键盘事件监听器
		borderPane.setOnKeyPressed(e -> {
			switch (e.getCode()) {
			case LEFT:
				circlePane.left();
				break;
			case RIGHT:
				circlePane.right();
				break;
			case UP:
				circlePane.up();
				break;
			case DOWN:
				circlePane.down();
				break;
			default:
				circlePane.circle.setCenterX(circlePane.circle.getCenterX());
				circlePane.circle.setCenterY(circlePane.circle.getCenterY());
				break;
			}
		});
		borderPane.setCenter(circlePane);
		borderPane.setBottom(getHBox());
		BorderPane.setAlignment(getHBox(), Pos.CENTER);

		Scene scene = new Scene(borderPane, 350, 300);
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.setTitle("编程练习16-3");
		primaryStage.show();

	}
}

// 创建画板矩形
class RectanglePane extends Rectangle {
	private Rectangle rectangle = new Rectangle(325, 250);

	public Rectangle getRectangle() {
		rectangle.setStroke(Color.BLACK);
		rectangle.setFill(Color.WHITE);
		return rectangle;
	}

}

class CirclePane extends BorderPane {
	// 创建画板标签、画板、小球
	private Label label = new Label("画板");
	public Circle circle = new Circle(175, 140, 15);
	private RectanglePane rectangle = new RectanglePane();

	// CirclePane 的构造方法
	public CirclePane() {
		label.setFont(new Font("宋体", 15));
		label.setTextFill(Color.WHITE);
		circle.setStroke(Color.BLACK);
		circle.setFill(Color.WHITE);

		this.setCenter(rectangle.getRectangle());
		this.getChildren().add(circle);
		this.setTop(label);
		this.setStyle("-fx-background-color:#336699");

	}

	// 小球的移动方法（有边界检测）
	public void left() {
		circle.setCenterX(
				circle.getCenterX() > circle.getRadius() + 16 ? (circle.getCenterX() - 5) : circle.getCenterX());
	}

	public void right() {
		circle.setCenterX(circle.getCenterX() < (rectangle.getRectangle().getWidth() + 16 - circle.getRadius())
				? (circle.getCenterX() + 5) : circle.getCenterX());
	}

	public void up() {
		circle.setCenterY(
				circle.getCenterY() > circle.getRadius() + 20 ? (circle.getCenterY() - 5) : circle.getCenterY());
	}

	public void down() {
		circle.setCenterY(circle.getCenterY() < (rectangle.getRectangle().getHeight() + 20 - circle.getRadius())
				? (circle.getCenterY() + 5) : circle.getCenterY());
	}
}