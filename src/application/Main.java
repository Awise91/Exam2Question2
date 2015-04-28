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

import ch.makery.address.view.PersonEditDialogController;
import customer.view.customerOverViewController;
import customer.view.RootLayoutController;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Main extends Application {
	
	private ObservableList<Customer> customerData = FXCollections.observableArrayList();
	
	public Main () {
		
	}
	
	public ObservableList<Customer> getCustomerData() {
		return customerData;
	}
	
	private Stage primaryStage;
    private BorderPane rootLayout;
    
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("CustomerApp");

        initRootLayout();

        showcustomerOverView();
    }
    
    public void initRootLayout() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("view/RootLayout.fxml"));
            rootLayout = (BorderPane) loader.load();

            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            
            RootLayoutController controller = loader.getController();
            controller.setMain(this);

            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void showcustomerOverView() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("view/customerOverView.fxml"));
            AnchorPane personOverview = (AnchorPane) loader.load();

        
            rootLayout.setCenter(personOverview);

            customerOverViewController controller = loader.getController();
            controller.setMain(this);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public Stage getPrimaryStage() {
        return primaryStage;
    }
    
    public void setCustomerFilePath(File file) {
        Preferences prefs = Preferences.userNodeForPackage(Main.class);
        if (file != null) {
            prefs.put("filePath", file.getPath());

            // Update the stage title.
            primaryStage.setTitle("CustomerApp - " + file.getName());
        } else {
            prefs.remove("filePath");

            // Update the stage title.
            primaryStage.setTitle("CustomerApp");
        }
    }
    
    public void loadPersonDataFromFile(File file) {
        try {
            JAXBContext context = JAXBContext
                    .newInstance(CustomerListWrapper.class);
            Unmarshaller um = context.createUnmarshaller();

            // Reading XML from the file and unmarshalling.
            CustomerListWrapper wrapper = (CustomerListWrapper) um.unmarshal(file);

            customerData.clear();
            customerData.addAll(wrapper.getCustomers());

            // Save the file path to the registry.
            
            setCustomerFilePath(file);
    }
        public void savePersonDataToFile(File file) {
            try {
                JAXBContext context = JAXBContext
                        .newInstance(CustomerListWrapper.class);
                Marshaller m = context.createMarshaller();
                m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

                // Wrapping our person data.
                CustomerListWrapper wrapper = new CustomerListWrapper();
                wrapper.setCustomers(customerData);

                // Marshalling and saving XML to the file.
                m.marshal(wrapper, file);

                // Save the file path to the registry.
                setCustomerFilePath(file);
            }
        


/*	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	*/
	public static void main(String[] args) {
		launch(args);
	}
}
