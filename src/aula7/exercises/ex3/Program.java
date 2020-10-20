package aula7.exercises.ex3;

import java.util.Arrays;

import com.sun.javafx.collections.ObservableListWrapper;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Program extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		Pane painel = new Pane();
		Scene scn = new Scene(painel, 600, 260);

		Label lblNomeProduto = new Label("Nome do produto: ");

		lblNomeProduto.relocate(20, 20);

		TextField tfNomeProduto = new TextField();

		tfNomeProduto.relocate(150, 18);
		tfNomeProduto.setMaxWidth(500);
		tfNomeProduto.setMinWidth(400);

		Label lblQuantidade = new Label("Quantidade: ");

		lblQuantidade.relocate(20, 60);

		TextField tfQuantidade = new TextField();

		tfQuantidade.relocate(150, 58);
		tfQuantidade.setMaxWidth(500);
		tfQuantidade.setMinWidth(400);

		Label lblDimensao = new Label("Dimensao: ");

		lblDimensao.relocate(20, 100);

		TextField tfDimensaoL = new TextField();

		tfDimensaoL.relocate(150, 98);
		tfDimensaoL.setMaxWidth(70);

		TextField tfDimensaoA = new TextField();

		tfDimensaoA.relocate(150 + 70 + 10, 98);
		tfDimensaoA.setMaxWidth(70);

		TextField tfDimensaoP = new TextField();

		tfDimensaoP.relocate(150 + 70 + 10 + 70 + 10, 98);
		tfDimensaoP.setMaxWidth(70);
		
		Slider slPot = new Slider();

		slPot.relocate(150, 140);
		slPot.setMaxWidth(70);

		Label lblPeso = new Label("Peso: ");

		lblPeso.relocate(20, 138);

		Label lblEstoque = new Label("Estoque: ");

		lblEstoque.relocate(20, 178);

		ComboBox<String> cbEstoque = new ComboBox<>();
		cbEstoque.relocate(150, 178);
		cbEstoque.setMinWidth(100);
		cbEstoque.setMaxWidth(100);

		cbEstoque.getItems().addAll("Central", "Filial 1", "Filial 2", "Depósito");


		Button btOk = new Button("Ok");

		btOk.relocate(20, 218);

		Button btCancel = new Button("Cancel");

		btCancel.relocate(70, 218);

		painel.getChildren().addAll(slPot,btOk,btCancel,cbEstoque, lblEstoque, lblPeso, tfDimensaoP, tfDimensaoA, lblDimensao, tfDimensaoL,
				lblNomeProduto, tfNomeProduto, lblQuantidade, tfQuantidade);
		stage.setScene(scn);
		stage.setTitle("Agenda de Contatos");
		stage.show();
	}

	public static void main(String[] args) {
		Application.launch(Program.class, args);
	}

}
