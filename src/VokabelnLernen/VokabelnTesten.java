package VokabelnLernen;

import javafx.application.Application;
import javafx.collections.*;
import javafx.event.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.effect.*;
import javafx.scene.layout.*;
import javafx.stage.*;

public class VokabelnTesten extends Application
{
	
	private TextField german;
	private TextField english;
	private Button save;
	private Label info;
	private Label hiereintragen;
	private Parent root;
	private Algorithmus algo;
	private final static String TEXT = "Ein neues Wort in das Wörterbuch eintragen";
	
	@Override
	public void init()
	{
		algo = new Algorithmus();
		
		german = new TextField();
		german.setPrefWidth(300);
		german.setPromptText("Hier das Deutsche Wort eingeben");
		
		english = new TextField();
		english.setPrefWidth(300);
		english.setPromptText("Hier das Englische Wort eingeben");
		
		hiereintragen = new Label(TEXT);
		info = new Label("");
		
		save = new Button("Hinzufügen");
		save.setOnAction(event -> {
			
		});
		
		root = createSceneGraph();
		
	}
	
	public Parent createSceneGraph()
	{
		BorderPane panel = new BorderPane();
		FlowPane p1 = new FlowPane();
		p1.getChildren().addAll(german, english, save);
		
		panel.setTop(hiereintragen);
		panel.setCenter(p1);
		panel.setBottom(info);
		
		return panel;
	}
	
	@Override
	public void start(Stage primaryStage)
	{
		primaryStage.setTitle("Wörterbuch");
		Scene scene = new Scene(root, 600, 200);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String [] xxx)
	{
		launch(xxx);
	}
	
}
