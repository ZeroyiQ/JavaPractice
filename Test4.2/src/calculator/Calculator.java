package calculator;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Calculator extends Application {
	//����ĸ��༭�ĵ������һ�����㰴ť
	private TextField tf_investmentAmount = new TextField();
	private TextField tf_year = new TextField();
	private TextField tf_yearlyInterestRate = new TextField();
	private TextField tf_futureValue = new TextField();
	private Button btn_calculator = new Button("Calculator");
	
	
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) {
		//��GirdPane ����
		GridPane gridPane = new GridPane();	
		gridPane.setHgap(25);
		gridPane.setVgap(10);
		gridPane.setStyle("-fx-background-color: #E0FFFF");
		gridPane.add(new Label("Ͷ���ܶ�"), 0, 0);
		gridPane.add(tf_investmentAmount, 1, 0);
		gridPane.add(new Label("����"), 0, 1);
		gridPane.add(tf_year, 1, 1);
		gridPane.add(new Label("������"), 0, 2);
		gridPane.add(tf_yearlyInterestRate, 1, 2);
		gridPane.add(new Label("δ��ֵ"), 0, 3);
		gridPane.add(tf_futureValue, 1, 3);
		gridPane.add(btn_calculator, 1, 4);
		gridPane.setAlignment(Pos.CENTER);
		
		//��δ��ֵ���óɲ��ܱ༭
		tf_futureValue.setEditable(false);
		
		GridPane.setHalignment(btn_calculator, HPos.RIGHT);
		
		btn_calculator.setOnAction(e->calculateValue());
		
		Scene scene = new Scene(gridPane,300,200);
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.setTitle("�����ϰ16-5");
		primaryStage.show();
	}
	//����δ��ֵ����
	private void calculateValue() {
		double investmentAmount = Double.parseDouble(tf_investmentAmount.getText());
		int year = Integer.parseInt(tf_year.getText());
		double yearlyInterestTRate = Double.parseDouble(tf_yearlyInterestRate.getText())/100;
		double futureValue = investmentAmount*Math.pow((1+yearlyInterestTRate/12), year*12);
	
		tf_futureValue.setText(String.format("%.2f", futureValue));
	}
}
