package prob2;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			 Parent root = FXMLLoader.load(getClass().getResource("fxml_example1.fxml"));
		        
			 primaryStage.setTitle("Address Form");
			 primaryStage.setScene(new Scene(root, 600, 275));
			 
			 TextField input = (TextField)root.lookup("#input");
		     TextField output = (TextField)root.lookup("#output");
		     
		        
			 Button countBtn = (Button)root.lookup("#count");
			 countBtn.setOnAction(new EventHandler<ActionEvent>() {

		            @Override
		            public void handle(ActionEvent e) {
		            	String tmp = input.getText();
		            	Integer count = tmp.trim().length();
		                output.setText(count.toString());
		                
		            }
		        });
		     Button reverseBtn = (Button)root.lookup("#reverse");
		     reverseBtn.setOnAction(new EventHandler<ActionEvent>() {

		            @Override
		            public void handle(ActionEvent e) { 
		            	String tmp = input.getText();
		                output.setText(new StringBuilder(tmp).reverse().toString());
		                
		            }
		        });
		     Button removeBtn = (Button)root.lookup("#remove");
		     removeBtn.setOnAction(new EventHandler<ActionEvent>() {

		            @Override
		            public void handle(ActionEvent e) {
		                output.setText(removeDuplicates(input.getText()).trim());
		                
		            }
		        });
			 primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	public String removeDuplicates(String input){
	    String result = "";
	    for (int i = 0; i < input.length(); i++) {
	        if(!result.contains(String.valueOf(input.charAt(i)))) {
	            result += String.valueOf(input.charAt(i));
	        }
	    }
	    return result;
	}
}
