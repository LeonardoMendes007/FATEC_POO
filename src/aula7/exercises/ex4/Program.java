package aula7.exercises.ex4;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Program extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		GridPane painel = new GridPane();
		painel.setPadding(new Insets(10));
		painel.setVgap(5);
		Scene scn = new Scene(painel, 500, 150);

		Label lblId = new Label("Id");
		lblId.setMinWidth(100);
		lblId.setMaxWidth(150);


		painel.add(lblId, 0, 0);

		TextField tfId = new TextField();
		tfId.setMinWidth(300);
		tfId.setMaxWidth(400);
		
		painel.add(tfId, 1, 0);

		Label lblNome = new Label("Nome");

		
		painel.add(lblNome, 0, 1);

		TextField tfNome = new TextField();

		painel.add(tfNome, 1, 1);

		Label lblTelefone = new Label("Telefone");

		lblTelefone.relocate(10, 0);
		painel.add(lblTelefone, 0, 2);

		TextField tfTelefone = new TextField();

		painel.add(tfTelefone, 1, 2);

		Button btSalvar = new Button("Salvar");

		btSalvar.relocate(10, 0);
		painel.add(btSalvar, 0, 3);

		Button btPesquisar = new Button("Pesquisar");

		painel.add(btPesquisar, 1, 3);

		stage.setScene(scn);
		stage.setTitle("Agenda de Contatos");
		stage.show();
	}

	public static void main(String[] args) {
		Application.launch(Program.class, args);
	}

}
