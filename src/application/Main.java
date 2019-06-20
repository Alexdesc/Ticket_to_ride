package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	
	@FXML Button closeButton;
	@FXML TextField PlayerNames;
	@FXML Button AddPlayersButton;
	@FXML Button StartGameButton;
	@FXML ImageView GameImage;
	private BorderPane MenuPane;
	private Scene MenuScene;
	private Stage MenuStage;
	
	@Override
	public void start(Stage menuStage) throws IOException {
			this.MenuStage=menuStage;
			MenuPane = (BorderPane)FXMLLoader.load(getClass().getResource("Sample.fxml"));
			MenuScene = new Scene(MenuPane,845,635);
			MenuScene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			MenuStage = new Stage();
			MenuStage.setScene(MenuScene);
			//System.out.println(MenuStage);
			MenuStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	
	
	@FXML public void gestionBoutonCancel(ActionEvent event) { 
		Stage stage = (Stage) closeButton.getScene().getWindow();
	    stage.close(); }


	@FXML public void gestionBoutonAddPlayer(ActionEvent event) { 
		//Joueur Player = new Joueur (PlayerNames);
		PlayerNames.clear();
		}
	@FXML public void gestionBoutonToStart(ActionEvent event) throws IOException { 
		/*if (Joueur.isEmpty==false){*/
			MenuStage=(Stage) closeButton.getScene().getWindow();
			GameViewManager gameManager = new GameViewManager();
			gameManager.initializeGameStage(MenuStage);
		/*}*/
		}
	
	
}
	
	
