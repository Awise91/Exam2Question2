package customer.view;

import java.awt.TextField;
import java.io.File;

import customer.model.Customer;
import application.Main;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.GridPane;
import javafx.stage.FileChooser;

public class customerController {
	
	@FXML
	private Label FirstName = new Label("First Name");
	
	@FXML
	private TextField FirstNameField = new TextField("Enter your first name");
	
	@FXML
	private Label MidInit = new Label("Middle Initial");
	
	@FXML
	private TextField MiddleInitField = new TextField("Enter your middle initial");
	
	@FXML
	private Label LastName = new Label("Last Name");
	
	@FXML
	private TextField LastNameField = new TextField("Enter your last name");
	
	@FXML
	private RadioButton male = new RadioButton("Male");
	
	@FXML
	private RadioButton female = new RadioButton("Female");
	
	@FXML Label Address = new Label("Address");
	
	@FXML
	private TextField AddressField = new TextField("Enter your address");
	
	@FXML Label City = new Label("City");
	
	@FXML
	private TextField CityField = new TextField("Enter city");

	@FXML
	private Label Zip = new Label("Zipcode");
	
	@FXML
	private TextField ZipField;
	
	@FXML
	private Label State = new Label("State");
	
	@FXML
	ObservableList<String> States = 
		    FXCollections.observableArrayList(
		        "Alabama",
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
		//final ComboBox comboBox = new ComboBox(States);
	

	}
	

	
	
	