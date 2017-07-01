package prob1;
	
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
			 
			 TextField name = (TextField)root.lookup("#name");
		     //name.setFill(Color.FIREBRICK);
		     //name.setText("Default text");
		     
		     TextField street = (TextField)root.lookup("#street");
		     //street.setFill(Color.FIREBRICK);
		     //street.setText("Default text");
		     
		     TextField city = (TextField)root.lookup("#city");
		     //city.setFill(Color.FIREBRICK);
		     //city.setText("Default text");
		     
		     TextField state = (TextField)root.lookup("#state");
		     //state.setFill(Color.FIREBRICK);
		     //state.setText("Default text"); 
		     
		     TextField zip = (TextField)root.lookup("#zip");
		     //zip.setFill(Color.FIREBRICK);
		     //zip.setText("Default text");
		        
			 Button button = (Button)root.lookup("#button");
		     button.setOnAction(new EventHandler<ActionEvent>() {

		            @Override
		            public void handle(ActionEvent e) {        
		                name.setText("Dave Smith");
		                street.setText("123 North B");
		                state.setText("Iowa");
		                zip.setText("52556");
		                city.setText("Fairfield");
		                System.out.println(name.getText());
		                System.out.println(street.getText());
		                System.out.println(city.getText() +"," + state.getText() +" " + zip.getText());
		                
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
}
