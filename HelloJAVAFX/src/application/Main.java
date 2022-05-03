package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
	
		try {
			Parent root = FXMLLoader.load(getClass().getResource("/Interface.fxml"));
			Scene scene = new Scene(root,1000,558);
			Stage stage = new Stage();
			stage.setResizable(false);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
		
	}
}
	
//import javafx.animation.RotateTransition;
//import javafx.animation.TranslateTransition;
//import javafx.application.Application;
//import javafx.stage.Stage;
//import javafx.util.Duration;
//import javafx.scene.Group;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.layout.BorderPane;
//import javafx.scene.paint.Color;
//import javafx.scene.shape.Rectangle;
//import javafx.scene.transform.Rotate;
//
//
//public class Main extends Application {
//	@Override
//	public void start(Stage primaryStage) {
//		try {
//			BorderPane root = new BorderPane();
//			Scene scene = new Scene(root,400,400);
//			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
//			primaryStage.setScene(scene);
//			primaryStage.show();
//		} catch(Exception e) {
//			e.printStackTrace();
//		}
//		 Button btn = new Button("TEST FX");
//	        Group group = new Group(btn);
//	        Scene scene = new Scene(group, 2000, 2000);
//	 
//	        //Duration = 2.5 seconds
//	        Duration duration = Duration.millis(2500);
//	        //Create new translate transition
//	        TranslateTransition transition = new TranslateTransition(duration, btn);
//	        //Move in X axis by +200
//	        transition.setByX(500);
//	        //Move in Y axis by +100
//	        transition.setByY(300);
//	        //Go back to previous position after 2.5 seconds
//	        transition.setAutoReverse(true);
//	        //Repeat animation twice
//	        transition.setCycleCount(2);
//	        transition.play();
//	 
//	        primaryStage.setScene(scene);
//	        primaryStage.show();
//	        Rectangle rect = new Rectangle(120,100,100,100);   
//	        rect.setFill(Color.RED);
//	        RotateTransition rotate = new RotateTransition();
//	        rotate.setDuration(Duration.millis(1000));   
//	        rotate.setAxis(Rotate.Y_AXIS);  
//	        rotate.setCycleCount(500);
//	        rotate.setNode(rect);
//	        rotate.play(); 
//	        
//	}
//	
//	public static void main(String[] args) {
//        Application.launch(args);
//         
//    }
//	
//}
