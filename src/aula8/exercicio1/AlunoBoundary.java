package aula8.exercicio1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class AlunoBoundary extends Application implements EventHandler<ActionEvent>{
	
	private Pane pane = new Pane();
	private GridPane grid = new GridPane();
	
	private TextField txtId = new TextField();
	private TextField txtRa = new TextField();
	private TextField txtNome = new TextField();
	private TextField txtNascimento = new TextField();
	
	private Button btAdicionar = new Button("Adicionar");
	private Button btPesquisar = new Button("Pesquisar");
	
	private List<Aluno> list = new ArrayList<Aluno>();
	
	private SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
	
	@Override
	public void start(Stage stage) throws Exception {
		
		
		
		Scene scn = new Scene(pane,400,200);
		
		
		grid.add(new Label("Id:"),0 , 0);
		grid.add(txtId,1 , 0);
		grid.add(new Label("Ra:"),0 , 1);
		grid.add(txtRa,1 , 1);
		grid.add(new Label("Nome:"),0, 2);
		grid.add(txtNome,1 , 2);
		grid.add(new Label("Nascimento:"),0 ,3);
		grid.add(txtNascimento,1 , 3);
		
		grid.add(btAdicionar, 0, 4);
		grid.add(btPesquisar, 1, 4);
		
		
		
		pane.getChildren().add(grid);
		
		stage.setScene(scn);
		stage.setTitle("Gestão Alunos");
		stage.show();
		
	}

	public static void main(String[] args) {
		Application.launch(AlunoBoundary.class, args);
	}
	
	private void entityToBoundary(Aluno a) {
		txtId.setText(a.getId().toString());
		txtRa.setText(a.getRa());
		txtNome.setText(a.getNome());
		txtNascimento.setText(format.format(a.getNascimento()));
	}
	
	private Aluno boundaryToEntity(){
		Aluno a = new Aluno();
		a.setId(Long.parseLong(txtId.getText()));
		a.setRa(txtRa.getText());
		a.setNome(txtNome.getText());	
		try {
			a.setNascimento(format.parse(txtNascimento.getText()));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return a;
		
	}

	@Override
	public void handle(ActionEvent e) {
	   if(e.getTarget() == btAdicionar) {
		   Aluno a = boundaryToEntity();
		   
		   list.add(a);
		   
	   }else if(e.getTarget() == btPesquisar) {
		   
		   list.stream().filter(x -> x.getNome() == txtNome.getText()).forEach(x -> entityToBoundary(x));
	   }
				
	}
	
}
