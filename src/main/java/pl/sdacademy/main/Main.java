/**
 * 
 */
package pl.sdacademy.main;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * @author olszewskij
 *
 */
public class Main extends Application {

	/*
	 * (non-Javadoc)
	 * 
	 * 
	 * @see javafx.application.Application#start(javafx.stage.Stage)
	 */
	@Override
	public void start(Stage primaryStage) throws Exception {
		// Uruchomienie aplikacji
		StackPane stackPane = new StackPane();
		Button button = new Button("Przycisk");
		stackPane.getChildren().add(button);

		Scene scene = new Scene(stackPane, 400, 400);
		primaryStage.setTitle("First Application");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Uruchomienie aplikacji z metody start
		launch(args);

	}

}
