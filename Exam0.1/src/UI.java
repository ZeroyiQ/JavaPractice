import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class UI extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage arg0){
		GridPane gridPane = new GridPane();
		Label name = new Label("用户名");
		Label password = new Label("密码");
		TextField nameField = new TextField();
		PasswordField psField = new PasswordField();
		Button login = new Button("登陆");
		
		gridPane.add(name, 0, 0);
		gridPane.add(nameField, 1, 0);
		gridPane.add(password, 0, 1);
		gridPane.add(psField, 1, 1);
		gridPane.add(login, 1, 2);
		
		login.setOnAction(e->{
			if(nameField.getText().equals("大鲨鱼") && psField.getText().equals("123456")){
				 
				System.out.println("欢迎你，大鲨鱼！");
			}
			else{
				System.out.println("用户名或者密码错误！");
			}
		});
		
		Scene scene = new Scene(gridPane);
		arg0.setScene(scene);
		arg0.setTitle("登陆");
		arg0.show();
	}

}
