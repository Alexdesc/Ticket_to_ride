package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import java.io.IOException;
import javafx.event.ActionEvent;
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
			MenuPane = (BorderPane)FXMLLoader.load(getClass().getResource("GameStage.fxml"));
			MenuScene = new Scene(MenuPane,845,635);
			MenuScene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			MenuStage = new Stage();
			MenuStage.setScene(MenuScene);
			//System.out.println(MenuStage);
			MenuStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
		Game g = new Game(3);
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
