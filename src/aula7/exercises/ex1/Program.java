package aula7.exercises.ex1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Program extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		Pane painel = new Pane();
		Scene scn = new Scene(painel,200, 200);

		Label lblHelloWorld = new Label("Hello World");
		
		painel.getChildren().addAll(lblHelloWorld);
		stage.setScene(scn);
		stage.setTitle("Hello World");
		stage.show();
	}

	public static void main(String[] args) {
		Application.launch(Program.class, args);
	}

}
