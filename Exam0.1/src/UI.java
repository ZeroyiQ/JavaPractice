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
		Label name = new Label("�û���");
		Label password = new Label("����");
		TextField nameField = new TextField();
		PasswordField psField = new PasswordField();
		Button login = new Button("��½");
		
		gridPane.add(name, 0, 0);
		gridPane.add(nameField, 1, 0);
		gridPane.add(password, 0, 1);
		gridPane.add(psField, 1, 1);
		gridPane.add(login, 1, 2);
		
		login.setOnAction(e->{
			if(nameField.getText().equals("������") && psField.getText().equals("123456")){
				 
				System.out.println("��ӭ�㣬�����㣡");
			}
			else{
				System.out.println("�û��������������");
			}
		});
		
		Scene scene = new Scene(gridPane);
		arg0.setScene(scene);
		arg0.setTitle("��½");
		arg0.show();
	}

}
