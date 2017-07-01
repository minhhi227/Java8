package prob4;

import java.io.IOException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Login extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
   
    	Parent root = FXMLLoader.load(getClass().getResource("fxml_example1.fxml"));
        
    	primaryStage.setTitle("FXML Welcome");
    	primaryStage.setScene(new Scene(root, 300, 275));
        
        //scene.getStylesheets().add(getClass().getResource("Login.css").toExternalForm());
       
     
        Text target = (Text)root.lookup("#actiontarget");
        target.setFill(Color.FIREBRICK);
        target.setText("Default text");
        
        //you can attach an event handler here, by reading
        //the event-generating component (by id) and attaching the event-handler
        Button btn = (Button)root.lookup("#button");
        
        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e) {
            	target.setText("Sign in button pressed");
            }
        });


        
        primaryStage.show();
    }
}