package customer.view;

import java.io.File;
import javafx.fxml.FXML;
import javafx.stage.FileChooser;
import application.Main;

public class RootLayoutController {
	
	private Main mainApp;
	
	public void setMain(Main mainApp) {
		this.mainApp = mainApp;
	}
	@FXML
	private void handleNew() {
		mainApp.getCustomerData().clear();
	}
	
	@FXML
	   private void handleOpen() {
	       FileChooser fileChooser = new FileChooser();
	
    
        }
    }

    /**
     * Opens an about dialog.
     */
   /* @FXML
    private void handleAbout() {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("AddressApp");
        alert.setHeaderText("About");
        alert.setContentText("Author: Marco Jakob\nWebsite: http://code.makery.ch");

        alert.showAndWait();
    }*/

    /**
     * Closes the application.
     */

