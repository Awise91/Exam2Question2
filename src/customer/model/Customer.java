package customer.model;

import javafx.beans.property.StringProperty;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.RadioButton;

public class Customer {
	private final StringProperty FirstName;
	private final StringProperty MiddleInit;
	private final StringProperty LastName;
	private final RadioButton Gender;
	private final StringProperty Address;
	private final StringProperty City;
	private final ChoiceBox State;
	private final StringProperty Zip;
	
	public Customer(StringProperty firstName, StringProperty middleInit,
			StringProperty lastName, RadioButton gender,
			StringProperty address, StringProperty city, ChoiceBox state,
			StringProperty zip) {
		super();
		FirstName = firstName;
		MiddleInit = middleInit;
		LastName = lastName;
		Gender = gender;
		Address = address;
		City = city;
		State = state;
		Zip = zip;
	}

	public String getFirstName() {
		return FirstName;
	}

	public StringProperty getMiddleInit() {
		return MiddleInit;
	}

	public StringProperty getLastName() {
		return LastName;
	}

	public RadioButton getGender() {
		return Gender;
	}

	public StringProperty getAddress() {
		return Address;
	}

	public StringProperty getCity() {
		return City;
	}

	public ChoiceBox getState() {
		return State;
	}

	public StringProperty getZip() {
		return Zip;
	}
	
}
