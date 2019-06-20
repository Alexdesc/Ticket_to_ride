package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class GameViewManager {

	private BorderPane gamePane;
	private Scene gameScene;
	private Stage gameStage;
	private Stage menuStage;
	@FXML Button closeButton;
	@FXML TextField PlayerNames;
	@FXML Button AddPlayersButton;
	@FXML Button StartGameButton;
	@FXML ImageView GameImage;
	

	
	public GameViewManager() throws IOException {
		
	}
	
	protected void initializeGameStage(Stage menuStage) throws IOException {
		
		this.menuStage=menuStage;
		this.menuStage.hide();
		gamePane = (BorderPane)FXMLLoader.load(getClass().getResource("GameStage.fxml"));
		gameScene = new Scene(gamePane,845,635);
		gameScene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		gameStage = new Stage();
		gameStage.setScene(gameScene);
		//System.out.println(MenuStage);
		gameStage.show();
		
	}


}
