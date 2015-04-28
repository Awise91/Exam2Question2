package customer.view;

import java.awt.TextField;

import customer.model.Customer;
import application.Main;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.GridPane;

public class customerOverViewController {
	
	@FXML
	private TextField customerTable;
	
	@FXML
	private TextField FirstNameField;
	
	@FXML
	private TextField MiddleInitField;
	
	@FXML
	private TextField LastNameField;
	
	@FXML
	private RadioButton Male;
	
	@FXML
	private RadioButton Female;
	
	@FXML
	private TextField AddressField;
	
	@FXML
	private TextField CityField;
	
	@FXML
	private ChoiceBox StateField;
	
	@FXML
	private TextField ZipField;
	
	
	private Main mainApp;

	public customerOverViewController() {
	}
	
	private void initialize () {
		GridPane grid = new GridPane();
		
		First.setText("Enter your first name");
    }
		
	
	showCustomerDetails(null);
	}
	public void setMain(Main mainApp) {
		this.mainApp = mainApp;
	}
	
	private void showCustomerDetails(Customer customer) {
        if (customer != null) {
            // Fill the labels with info from the person object.
            FirstNameField.setText(customer.getFirstName());
            MiddleInitField.setText(customer.getMiddleInit());
            LastNameField.setText(customer.getLastName());
            GenderButton.setSelected(customer.getGender());
            AddressField.setText(customer.getAddress());
            CityField.setText(customer.getCity());
            StateField.setChoiceBox(customer.getState());
            ZipField.setText(customer.getZip());
            
        } else {
            // Person is null, remove all the text.
            FirstNameField.setText("");
            MiddleInitField.setText("");
            LastNameField.setText("");
            GenderButton.setButton();
            AddressField.setText("");
            CityField.setText("");
            StateField.setChoiceBox();
            ZipField.setText("");
        }
    }
    @FXML
    private void handleDeleteCustomer() {
        int selectedIndex = personTable.getSelectionModel().getSelectedIndex();
        if (selectedIndex >= 0) {
            personTable.getItems().remove(selectedIndex);
        }
    }
    @FXML
    private void handleNewCustomer() {
        Customer tempCustomer = new Customer();
        boolean okClicked = mainApp.showCustomerEditDialog(tempCustomer);
        if (okClicked) {
            mainApp.getCustomerData().add(tempCustomer);
        }
    }
}
public class PersonOverviewController {

    @FXML
    private void initialize() {
        // Initialize the person table with the two columns.
        firstNameColumn.setCellValueFactory(
                cellData -> cellData.getValue().firstNameProperty());
        lastNameColumn.setCellValueFactory(
                cellData -> cellData.getValue().lastNameProperty());

        // Clear person details.
        showPersonDetails(null);

        // Listen for selection changes and show the person details when changed.
        personTable.getSelectionModel().selectedItemProperty().addListener(
                (observable, oldValue, newValue) -> showPersonDetails(newValue));
   */
   // Add observable list data to the table
        personTable.setItems(mainApp.getPersonData());
    }
    /**
     * Fills all text fields to show details about the person.
     * If the specified person is null, all text fields are cleared.
     * 
     * @param person the person or null
     */
    /**
     * Called when the user clicks on the delete button.
     */
    }
    /**
     * Called when the user clicks the new button. Opens a dialog to edit
     * details for a new person.
     */


    /**
     * Called when the user clicks the edit button. Opens a dialog to edit
     * details for the selected person.
     */
    @FXML
    private void handleEditPerson() {
        Person selectedPerson = personTable.getSelectionModel().getSelectedItem();
        if (selectedPerson != null) {
            boolean okClicked = mainApp.showPersonEditDialog(selectedPerson);
            if (okClicked) {
                showPersonDetails(selectedPerson);
            }
    }
