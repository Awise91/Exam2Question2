package application;
	
import customer.model.Customer;
import customer.model.CustomerListWrapper;
import javafx.application.Application;

import java.io.File;
import java.io.IOException;
import java.util.prefs.Preferences;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import customer.view.customerController;
import customer.view.RootLayoutController;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
	
	private static ObservableList<Customer> customerData = FXCollections.observableArrayList();
	
	public Main () {
		
	}
	public static void main(String[] args) {
		launch(args);
	}
	
	
	public ObservableList<Customer> getCustomerData() {
		return customerData;
	}
	
	
	public void start(Stage stage) {
		
	    	GridPane grid = new GridPane();
	    	RadioButton male = new RadioButton("Male");
	    	RadioButton female = new RadioButton("Female");
	    	final ToggleGroup group = new ToggleGroup();
	    	male.setToggleGroup(group);
	    	female.setToggleGroup(group);
	    	VBox btns = new VBox();
	    	
	    	ComboBox<String> State = new ComboBox<String>();
		    State.getItems().addAll("Alabama",
			        "Alaska",
			        "Arizona",
			        "Arkansas",
			        "California",
			        "Colorado",
			        "Connecticut",
			        "Delaware",
			        "Florida",
			        "Georgia",
			        "Hawaii",
			        "Idaho",
			        "Illinois",
			        "Nebraska",
			        "Nevada",
			        "New Hampshire",
			        "New Jersey",
			        "New Mexico",
			        "New York",
			        "North Carolina",
			        "North Dakota",
			        "Ohio",
			        "Oklahoma",
			        "Oregon",
			        "Pennsylvania",
			        "Indiana",
			        "Iowa",
			        "Kansas",
			        "Kentucky",
			        "Louisiana",
			        "Maine",
			        "Maryland",
			        "Massachusetts",
			        "Michigan",
			        "Minnesota",
			        "Mississippi",
			        "Missouri",
			        "Montana",
			        "Rhode Island",
			        "South Carolina",
			        "South Dakota",
			        "Tennessee",
			        "Texas",
			        "Utah",
			        "Vermont",
			        "Virginia",
			        "Washington",
			        "West Virginia",
			        "Wisconsin",
			        "Wyoming"
			    );
	    	
	    	grid.add(new Label("First Name"), 0, 0);
	    	grid.add(new Label("Middle Initial"),0,1);
	    	grid.add(new Label("Last Name"),0,2);
	    	grid.add(new Label("Gender"), 0,3);
	    	grid.add(new Label("Address"), 0,4);
	    	grid.add(new Label("City"),0,5);
	    	grid.add(new Label("State"),0,6);
	    	grid.add(new Label("Zipcode"),0,7);
	    	grid.add(new TextField("First"),1,0);
	    	grid.add(new TextField("Initial"),1,1);
	    	grid.add(new TextField("Last"),1,2);
	    	grid.add(btns,1,3);
	    	btns.getChildren().add(male);
	    	btns.getChildren().add(female);
	    	grid.add(new TextField("Address"),1,4);
	    	grid.add(new TextField("City"), 1, 5);
	    	grid.add(State,1,6);
	    	grid.add(new TextField("Zip"),1,7);
	    	
	    	
	    	stage.setScene(new Scene(grid, 400, 400));
	    	stage.show();
	}
	
	
}
