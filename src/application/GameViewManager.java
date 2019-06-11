package application;

import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class GameViewManager {

	private AnchorPane gamePane;
	private Scene gameScene;
	private Stage gameStage;
	private Stage menuStage;
	
	private static final int GAME_WIDTH=1200;
	private static final int GAME_HEIGHT=600;
	
	public GameViewManager() {
		initializeStage();
	}
	
	private void initializeStage() {
		gamePane = new AnchorPane();
		gameScene = new Scene(gamePane, GAME_WIDTH, GAME_HEIGHT);
		gameStage = new Stage();
		gameStage.setScene(gameScene);
	}
	
	public void createNewGame( Stage menuStage/*, <List> Joueurs*/ ) {
		this.menuStage=menuStage;
		//System.out.println(menuStage);
		this.menuStage.hide();
		europeMap();
		gameStage.show();
	}
	
	private void europeMap() {
		Image image = new Image("application/board.jpg");
		ImageView map= new ImageView();
		map.setImage(image);
		map.setFitHeight(600);
		map.setFitWidth(1200);
		map.setLayoutX(0);
		map.setLayoutY(0);
		gamePane.getChildren().add(map);
	}
}
