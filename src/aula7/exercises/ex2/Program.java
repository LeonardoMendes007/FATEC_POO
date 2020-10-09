package aula7.exercises.ex2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Program extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		Pane painel = new Pane();
		Scene scn = new Scene(painel,400, 150);

		Label lblPhoneNumber = new Label("Enter your phone number:");

		lblPhoneNumber.relocate(30, 10);
		
		TextField tfPhoneNumber = new TextField();

		tfPhoneNumber.relocate(180, 10);
		
		Label lblName = new Label("Enter your name: ");

		lblName.relocate(30, 50);
		
		TextField tfName = new TextField();

		tfName.relocate(180, 50);
		
		Button btOk = new Button("Ok");

		btOk.relocate(50, 100);
		
		Button btCancel = new Button("Cancel");

		btCancel.relocate(100, 100);
		
		painel.getChildren().addAll(btOk,btCancel, lblPhoneNumber, tfPhoneNumber, lblName, tfName);
		stage.setScene(scn);
		stage.setTitle("Agenda de Contatos");
		stage.show();
	}

	public static void main(String[] args) {
		Application.launch(Program.class, args);
	}

}
