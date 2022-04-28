package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;


import java.io.IOException;


import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.stage.Stage;

//
	
//AnchorPane root = (AnchorPane) FXMLLoader.load(Main.class.getResource("sample.fxml"));

public class Controller {
	@FXML

	private Stage stage;
	private Scene scene;
	
	public void switchToScene1(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("/Main.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void switchToScene2(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("/Interface.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

	public void newMethod() {
		System.out.println("Please work");
	}
	
	
}
