package aula7.exercises.ex7;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

	public class Drawing extends Application{

		Pane pane;
		Rectangle square;
		Ellipse eli;
		Ellipse eli2;
		Line lineUm;
		Line lineTwo;
		Line lineThree;
		
		@Override
		public void start(Stage stage) throws Exception {
			pane = new Pane();
			square = new Rectangle(100,100,100,100);
			
			square.setFill(Color.WHITE);
			square.setStroke(Color.BLACK);
			square.relocate(0, 51);
			
			lineUm = new Line();
			lineTwo = new Line();
			lineThree = new Line();
			
			lineUm.setStartX(0);
			lineUm.setEndX(50);
			lineUm.setStartY(50);
			lineUm.setEndY(0);
			

			lineTwo.setStartX(50);
			lineTwo.setEndX(100);
			lineTwo.setStartY(0);
			lineTwo.setEndY(50);
			
			lineThree.setStartX(0);
			lineThree.setEndX(100);
			lineThree.setStartY(50);
			lineThree.setEndY(50);

			createElipse();
			
			pane.getChildren().add(lineUm);
			pane.getChildren().add(lineTwo);
			pane.getChildren().add(lineThree);
			pane.getChildren().add(square);

			Scene scn = new Scene(pane, 500, 400);
			
			stage.setScene(scn);
			stage.show();
		}
		
		
		public void createElipse() { 
			int x = 150;
			int y = 80;
			int position = 130;
			int position2 = 0;
			while(y >= 10) {                   
				eli = new Ellipse();
				eli.setRadiusX(x);
				eli.setRadiusY(y);
				eli.setFill(Color.TRANSPARENT);
				eli.setStroke(Color.BLACK);
				eli.relocate(position, position2);
				y-=5;
				position2+=5;
				pane.getChildren().add(eli);
			}
			x = 150;
			y = 80;
			position = 130;
			position2 = 0;
			while(x >= 10) {
				eli2 = new Ellipse();
				eli2.setRadiusX(x);
				eli2.setRadiusY(y);
				eli2.setFill(Color.TRANSPARENT);
				eli2.setStroke(Color.BLACK);
				eli2.relocate(position,position2);
				position+=5;
				x-=5;
				pane.getChildren().add(eli2);
			}
		}
		public static void main(String[] args) {
			Application.launch(args);
		}
	}

