package aula10.view;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

class Codigo implements EventHandler<ActionEvent> {

	@Override
	public void handle(ActionEvent event) {
		
		System.out.println("Botão apertado");
		
	}
	
}

public class TesteEventos extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		BorderPane border = new BorderPane();
		Scene scn = new Scene(border, 400, 200);
		Button btn = new Button("Me Aperte");
		Label lbl = new Label("Texto");
		border.setBottom(btn);
		border.setTop(lbl);
		
		Codigo cod = new Codigo();
		
		btn.addEventHandler(MouseEvent.ANY, x -> System.out.println(x.getEventType().getName()));
		
		stage.setScene(scn);
		stage.setTitle("Teste de Eventos");
		stage.show();
		
	}
	
	public static void main(String[] args) {
		Application.launch(TesteEventos.class, args);
	}

}
