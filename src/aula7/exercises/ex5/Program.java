package aula7.exercises.ex5;

import java.util.function.Consumer;
import java.util.function.Function;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

public class Program extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		BorderPane painel = new BorderPane();
		painel.setPadding(new Insets(10));
		Scene scn = new Scene(painel, 275, 340);

		TextField tfView = new TextField();
		tfView.setMinWidth(190);
		tfView.setMaxWidth(200);
		tfView.setMaxHeight(20);
		tfView.setMinHeight(60);
		tfView.setEditable(false);
		
		Button btCe = new Button("CE");
		btCe.setMaxWidth(60);
		btCe.setMinWidth(60);
		btCe.setMaxHeight(60);
		btCe.setMinHeight(60);
		
		HBox tile = new HBox(tfView,btCe);
		tile.setMargin(btCe, new Insets(0, 0, 0, 5));
		tile.setAlignment(Pos.TOP_RIGHT);
		
		
		painel.setTop(tile);
		
		Consumer<Button> setMaxMin = (b) -> {
			b.setMaxWidth(60);
			b.setMinWidth(60);
			b.setMaxHeight(60);
			b.setMinHeight(60);
		};
		
		Button[] btNum = new Button[10];
		
		for (int i = 0; i < 10; i++) {
			btNum[i] = new Button("" + i);
			setMaxMin.accept(btNum[i]);
			
			
		}
		
		TilePane tileCenter = new TilePane();
		tileCenter.setPadding(new Insets(10, 0,0, 0));
		tileCenter.setVgap(5);
		tileCenter.setHgap(5);
		
		
		Function<String, Button> criaButton = (s) -> {
			
			Button bt = new Button(s);
			bt.setMaxWidth(60);
			bt.setMinWidth(60);
			bt.setMaxHeight(60);
			bt.setMinHeight(60);
			
			return bt;
		};
		
		tileCenter.getChildren().addAll(btNum[1],btNum[2],btNum[3],criaButton.apply("+"));
		tileCenter.getChildren().addAll(btNum[4],btNum[5],btNum[6],criaButton.apply("-"));
		tileCenter.getChildren().addAll(btNum[7],btNum[8],btNum[9],criaButton.apply("*"));
		tileCenter.getChildren().addAll(criaButton.apply("."),btNum[0],criaButton.apply("="),criaButton.apply("/"));
		
		
		painel.setCenter(tileCenter);

		stage.setScene(scn);
		stage.setTitle("Calculadora");
		stage.show();
	}

	public static void main(String[] args) {
		Application.launch(Program.class, args);
	}

}