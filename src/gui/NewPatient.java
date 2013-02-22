package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.CardLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

import javax.swing.JTextPane;

import patient.Patient;
import resources.Address;

public class NewPatient extends JFrame {

	private JPanel contentPane;
	private final JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
	private JTextField txtFirstName;
	private JTextField txtLastName;
	private JTextField txtYear;
	private JTextField txtPhonenumber;
	private JTextField txtAddressTwo;
	private JTextField txtAddressOne;
	private JTextField txtCity;
	private JTextField txtState;
	private JTextField txtCountry;
	private JTextField txtZip;
	private JTextField txtPhysician;
	private JTextPane txtAllergies;
	private JTextPane txtHistory;
	private JFrame previewFrame;
	private JComboBox boxGender;
	private JComboBox boxMonth;
	private JComboBox boxDate;
	
	private Patient pt;
	private JTextField txtSSN;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		NewPatient.run();
	}

	static void run() {
		try {
			NewPatient frame = new NewPatient();
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the frame.
	 */
	public NewPatient() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		contentPane.add(tabbedPane, "name_55488950141109");

		JPanel namePanel = new JPanel();
		tabbedPane.addTab("Name", null, namePanel, null);
		GridBagLayout gbl_namePanel = new GridBagLayout();
		gbl_namePanel.columnWidths = new int[] { 30, 76, 114, 30, 0 };
		gbl_namePanel.rowHeights = new int[] { 30, 0, 0, 30, 0 };
		gbl_namePanel.columnWeights = new double[] { 0.0, 0.0, 1.0, 0.0,
				Double.MIN_VALUE };
		gbl_namePanel.rowWeights = new double[] { 1.0, 0.0, 0.0, 1.0,
				Double.MIN_VALUE };
		namePanel.setLayout(gbl_namePanel);

		JLabel FirstNameLabel = new JLabel("First Name");
		GridBagConstraints gbc_FirstNameLabel = new GridBagConstraints();
		gbc_FirstNameLabel.anchor = GridBagConstraints.WEST;
		gbc_FirstNameLabel.insets = new Insets(0, 0, 5, 5);
		gbc_FirstNameLabel.gridx = 1;
		gbc_FirstNameLabel.gridy = 1;
		namePanel.add(FirstNameLabel, gbc_FirstNameLabel);

		txtFirstName = new JTextField();
		GridBagConstraints gbc_txtFirstName = new GridBagConstraints();
		gbc_txtFirstName.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtFirstName.anchor = GridBagConstraints.NORTH;
		gbc_txtFirstName.insets = new Insets(0, 0, 5, 5);
		gbc_txtFirstName.gridx = 2;
		gbc_txtFirstName.gridy = 1;
		namePanel.add(txtFirstName, gbc_txtFirstName);
		txtFirstName.setColumns(10);

		JLabel lblLastName = new JLabel("Last Name");
		GridBagConstraints gbc_lblLastName = new GridBagConstraints();
		gbc_lblLastName.anchor = GridBagConstraints.EAST;
		gbc_lblLastName.insets = new Insets(0, 0, 5, 5);
		gbc_lblLastName.gridx = 1;
		gbc_lblLastName.gridy = 2;
		namePanel.add(lblLastName, gbc_lblLastName);

		txtLastName = new JTextField();
		GridBagConstraints gbc_txtLastName = new GridBagConstraints();
		gbc_txtLastName.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtLastName.insets = new Insets(0, 0, 5, 5);
		gbc_txtLastName.gridx = 2;
		gbc_txtLastName.gridy = 2;
		namePanel.add(txtLastName, gbc_txtLastName);
		txtLastName.setColumns(10);

		JPanel personalPanel = new JPanel();
		tabbedPane.addTab("Personal", null, personalPanel, null);
		GridBagLayout gbl_personalPanel = new GridBagLayout();
		gbl_personalPanel.columnWidths = new int[] { 30, 0, 0, 30, 0 };
		gbl_personalPanel.rowHeights = new int[] { 30, 0, 0, 0, 0, 30, 0 };
		gbl_personalPanel.columnWeights = new double[] { 1.0, 1.0, 1.0, 1.0,
				Double.MIN_VALUE };
		gbl_personalPanel.rowWeights = new double[] { 1.0, 1.0, 0.0, 0.0, 0.0, 1.0,
				Double.MIN_VALUE };
		personalPanel.setLayout(gbl_personalPanel);

		JLabel lblGender = new JLabel("Biological Gender");
		GridBagConstraints gbc_lblGender = new GridBagConstraints();
		gbc_lblGender.anchor = GridBagConstraints.EAST;
		gbc_lblGender.insets = new Insets(0, 0, 5, 5);
		gbc_lblGender.gridx = 1;
		gbc_lblGender.gridy = 1;
		personalPanel.add(lblGender, gbc_lblGender);

		boxGender = new JComboBox();
		boxGender.setModel(new DefaultComboBoxModel(new String[] {
				"No Selection", "Male", "Female" }));
		GridBagConstraints gbc_boxGender = new GridBagConstraints();
		gbc_boxGender.insets = new Insets(0, 0, 5, 5);
		gbc_boxGender.fill = GridBagConstraints.HORIZONTAL;
		gbc_boxGender.gridx = 2;
		gbc_boxGender.gridy = 1;
		personalPanel.add(boxGender, gbc_boxGender);

		JLabel lblBirth = new JLabel("Birth");
		GridBagConstraints gbc_lblBirth = new GridBagConstraints();
		gbc_lblBirth.anchor = GridBagConstraints.EAST;
		gbc_lblBirth.insets = new Insets(0, 0, 5, 5);
		gbc_lblBirth.gridx = 1;
		gbc_lblBirth.gridy = 2;
		personalPanel.add(lblBirth, gbc_lblBirth);

		JPanel DatePanel = new JPanel();
		GridBagConstraints gbc_DatePanel = new GridBagConstraints();
		gbc_DatePanel.anchor = GridBagConstraints.WEST;
		gbc_DatePanel.insets = new Insets(0, 0, 5, 5);
		gbc_DatePanel.fill = GridBagConstraints.VERTICAL;
		gbc_DatePanel.gridx = 2;
		gbc_DatePanel.gridy = 2;
		personalPanel.add(DatePanel, gbc_DatePanel);

		boxMonth = new JComboBox();
		boxMonth.setModel(new DefaultComboBoxModel(new String[] { "0", "1",
				"2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
		DatePanel.add(boxMonth);

		boxDate = new JComboBox();
		boxDate.setModel(new DefaultComboBoxModel(new String[] { "0", "1", "2",
				"3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13",
				"14", "15", "16", "17", "18", "19", "20", "21", "22", "23",
				"24", "25", "26", "27", "28", "29", "30", "31" }));
		DatePanel.add(boxDate);

		txtYear = new JTextField();
		DatePanel.add(txtYear);
		txtYear.setColumns(10);

		JLabel lblPhoneNumber = new JLabel("Phone Number");
		GridBagConstraints gbc_lblPhoneNumber = new GridBagConstraints();
		gbc_lblPhoneNumber.anchor = GridBagConstraints.EAST;
		gbc_lblPhoneNumber.insets = new Insets(0, 0, 5, 5);
		gbc_lblPhoneNumber.gridx = 1;
		gbc_lblPhoneNumber.gridy = 3;
		personalPanel.add(lblPhoneNumber, gbc_lblPhoneNumber);

		txtPhonenumber = new JTextField();
		GridBagConstraints gbc_txtPhonenumber = new GridBagConstraints();
		gbc_txtPhonenumber.insets = new Insets(0, 0, 5, 5);
		gbc_txtPhonenumber.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPhonenumber.gridx = 2;
		gbc_txtPhonenumber.gridy = 3;
		personalPanel.add(txtPhonenumber, gbc_txtPhonenumber);
		txtPhonenumber.setColumns(10);
		
		JLabel lblSSN = new JLabel("Social Security Number");
		GridBagConstraints gbc_lblSSN = new GridBagConstraints();
		gbc_lblSSN.anchor = GridBagConstraints.EAST;
		gbc_lblSSN.insets = new Insets(0, 0, 5, 5);
		gbc_lblSSN.gridx = 1;
		gbc_lblSSN.gridy = 4;
		personalPanel.add(lblSSN, gbc_lblSSN);
		
		txtSSN = new JTextField();
		GridBagConstraints gbc_txtSSN = new GridBagConstraints();
		gbc_txtSSN.insets = new Insets(0, 0, 5, 5);
		gbc_txtSSN.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtSSN.gridx = 2;
		gbc_txtSSN.gridy = 4;
		personalPanel.add(txtSSN, gbc_txtSSN);
		txtSSN.setColumns(10);

		JPanel addressPanel = new JPanel();
		tabbedPane.addTab("Address", null, addressPanel, null);
		GridBagLayout gbl_addressPanel = new GridBagLayout();
		gbl_addressPanel.columnWidths = new int[] { 30, 0, 263, 30, 0 };
		gbl_addressPanel.rowHeights = new int[] { 30, 30, 30, 0, 0, 0, 0, 30, 0 };
		gbl_addressPanel.columnWeights = new double[] { 1.0, 0.0, 1.0, 1.0,
				Double.MIN_VALUE };
		gbl_addressPanel.rowWeights = new double[] { 1.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 0.0, 1.0, Double.MIN_VALUE };
		addressPanel.setLayout(gbl_addressPanel);

		JLabel lblAddressLine = new JLabel("Address Line 1");
		GridBagConstraints gbc_lblAddressLine = new GridBagConstraints();
		gbc_lblAddressLine.anchor = GridBagConstraints.EAST;
		gbc_lblAddressLine.insets = new Insets(0, 0, 5, 5);
		gbc_lblAddressLine.gridx = 1;
		gbc_lblAddressLine.gridy = 1;
		addressPanel.add(lblAddressLine, gbc_lblAddressLine);

		txtAddressOne = new JTextField();
		GridBagConstraints gbc_txtAddressOne = new GridBagConstraints();
		gbc_txtAddressOne.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtAddressOne.insets = new Insets(0, 0, 5, 5);
		gbc_txtAddressOne.gridx = 2;
		gbc_txtAddressOne.gridy = 1;
		addressPanel.add(txtAddressOne, gbc_txtAddressOne);
		txtAddressOne.setColumns(10);

		JLabel lblAddressLine_1 = new JLabel("Address Line 2");
		GridBagConstraints gbc_lblAddressLine_1 = new GridBagConstraints();
		gbc_lblAddressLine_1.anchor = GridBagConstraints.EAST;
		gbc_lblAddressLine_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblAddressLine_1.gridx = 1;
		gbc_lblAddressLine_1.gridy = 2;
		addressPanel.add(lblAddressLine_1, gbc_lblAddressLine_1);

		txtAddressTwo = new JTextField();
		GridBagConstraints gbc_txtAddressTwo = new GridBagConstraints();
		gbc_txtAddressTwo.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtAddressTwo.insets = new Insets(0, 0, 5, 5);
		gbc_txtAddressTwo.gridx = 2;
		gbc_txtAddressTwo.gridy = 2;
		addressPanel.add(txtAddressTwo, gbc_txtAddressTwo);
		txtAddressTwo.setColumns(10);

		JLabel lblCity = new JLabel("City");
		GridBagConstraints gbc_lblCity = new GridBagConstraints();
		gbc_lblCity.anchor = GridBagConstraints.EAST;
		gbc_lblCity.insets = new Insets(0, 0, 5, 5);
		gbc_lblCity.gridx = 1;
		gbc_lblCity.gridy = 3;
		addressPanel.add(lblCity, gbc_lblCity);

		txtCity = new JTextField();
		GridBagConstraints gbc_txtCity = new GridBagConstraints();
		gbc_txtCity.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtCity.insets = new Insets(0, 0, 5, 5);
		gbc_txtCity.gridx = 2;
		gbc_txtCity.gridy = 3;
		addressPanel.add(txtCity, gbc_txtCity);
		txtCity.setColumns(10);

		JLabel lblState = new JLabel("State");
		GridBagConstraints gbc_lblState = new GridBagConstraints();
		gbc_lblState.anchor = GridBagConstraints.EAST;
		gbc_lblState.insets = new Insets(0, 0, 5, 5);
		gbc_lblState.gridx = 1;
		gbc_lblState.gridy = 4;
		addressPanel.add(lblState, gbc_lblState);

		txtState = new JTextField();
		GridBagConstraints gbc_txtState = new GridBagConstraints();
		gbc_txtState.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtState.insets = new Insets(0, 0, 5, 5);
		gbc_txtState.gridx = 2;
		gbc_txtState.gridy = 4;
		addressPanel.add(txtState, gbc_txtState);
		txtState.setColumns(10);

		JLabel lblCountry = new JLabel("Country");
		GridBagConstraints gbc_lblCountry = new GridBagConstraints();
		gbc_lblCountry.anchor = GridBagConstraints.EAST;
		gbc_lblCountry.insets = new Insets(0, 0, 5, 5);
		gbc_lblCountry.gridx = 1;
		gbc_lblCountry.gridy = 5;
		addressPanel.add(lblCountry, gbc_lblCountry);

		txtCountry = new JTextField();
		GridBagConstraints gbc_txtCountry = new GridBagConstraints();
		gbc_txtCountry.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtCountry.insets = new Insets(0, 0, 5, 5);
		gbc_txtCountry.gridx = 2;
		gbc_txtCountry.gridy = 5;
		addressPanel.add(txtCountry, gbc_txtCountry);
		txtCountry.setColumns(10);

		JLabel lblZip = new JLabel("Zip");
		GridBagConstraints gbc_lblZip = new GridBagConstraints();
		gbc_lblZip.anchor = GridBagConstraints.EAST;
		gbc_lblZip.insets = new Insets(0, 0, 5, 5);
		gbc_lblZip.gridx = 1;
		gbc_lblZip.gridy = 6;
		addressPanel.add(lblZip, gbc_lblZip);

		txtZip = new JTextField();
		GridBagConstraints gbc_txtZip = new GridBagConstraints();
		gbc_txtZip.insets = new Insets(0, 0, 5, 5);
		gbc_txtZip.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtZip.gridx = 2;
		gbc_txtZip.gridy = 6;
		addressPanel.add(txtZip, gbc_txtZip);
		txtZip.setColumns(10);

		JPanel medicalPanel = new JPanel();
		tabbedPane.addTab("Medical", null, medicalPanel, null);
		GridBagLayout gbl_medicalPanel = new GridBagLayout();
		gbl_medicalPanel.columnWidths = new int[] { 30, 0, 0, 30, 0 };
		gbl_medicalPanel.rowHeights = new int[] { 30, 0, 0, 0, 30, 0 };
		gbl_medicalPanel.columnWeights = new double[] { 0.0, 0.0, 1.0, 0.0,
				Double.MIN_VALUE };
		gbl_medicalPanel.rowWeights = new double[] { 0.0, 0.0, 1.0, 1.0, 0.0,
				Double.MIN_VALUE };
		medicalPanel.setLayout(gbl_medicalPanel);

		JLabel lblPhysician = new JLabel("Physician");
		GridBagConstraints gbc_lblPhysician = new GridBagConstraints();
		gbc_lblPhysician.insets = new Insets(0, 0, 5, 5);
		gbc_lblPhysician.anchor = GridBagConstraints.EAST;
		gbc_lblPhysician.gridx = 1;
		gbc_lblPhysician.gridy = 1;
		medicalPanel.add(lblPhysician, gbc_lblPhysician);

		txtPhysician = new JTextField();
		GridBagConstraints gbc_txtPhysician = new GridBagConstraints();
		gbc_txtPhysician.insets = new Insets(0, 0, 5, 5);
		gbc_txtPhysician.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPhysician.gridx = 2;
		gbc_txtPhysician.gridy = 1;
		medicalPanel.add(txtPhysician, gbc_txtPhysician);
		txtPhysician.setColumns(10);

		JLabel lblAllergies = new JLabel("Allergies");
		GridBagConstraints gbc_lblAllergies = new GridBagConstraints();
		gbc_lblAllergies.anchor = GridBagConstraints.EAST;
		gbc_lblAllergies.insets = new Insets(0, 0, 5, 5);
		gbc_lblAllergies.gridx = 1;
		gbc_lblAllergies.gridy = 2;
		medicalPanel.add(lblAllergies, gbc_lblAllergies);

		txtAllergies = new JTextPane();
		GridBagConstraints gbc_txtAllergies = new GridBagConstraints();
		gbc_txtAllergies.insets = new Insets(0, 0, 5, 5);
		gbc_txtAllergies.fill = GridBagConstraints.BOTH;
		gbc_txtAllergies.gridx = 2;
		gbc_txtAllergies.gridy = 2;
		medicalPanel.add(txtAllergies, gbc_txtAllergies);

		JLabel lblPastMedicalHistory = new JLabel("Past Medical History");
		GridBagConstraints gbc_lblPastMedicalHistory = new GridBagConstraints();
		gbc_lblPastMedicalHistory.anchor = GridBagConstraints.EAST;
		gbc_lblPastMedicalHistory.insets = new Insets(0, 0, 5, 5);
		gbc_lblPastMedicalHistory.gridx = 1;
		gbc_lblPastMedicalHistory.gridy = 3;
		medicalPanel.add(lblPastMedicalHistory, gbc_lblPastMedicalHistory);

		txtHistory = new JTextPane();
		GridBagConstraints gbc_txtHistory = new GridBagConstraints();
		gbc_txtHistory.insets = new Insets(0, 0, 5, 5);
		gbc_txtHistory.fill = GridBagConstraints.BOTH;
		gbc_txtHistory.gridx = 2;
		gbc_txtHistory.gridy = 3;
		medicalPanel.add(txtHistory, gbc_txtHistory);

		JPanel confirmationPanel = new JPanel();
		tabbedPane.addTab("Confirmation", null, confirmationPanel, null);
		GridBagLayout gbl_confirmationPanel = new GridBagLayout();
		gbl_confirmationPanel.columnWidths = new int[] { 135, 0, 0 };
		gbl_confirmationPanel.rowHeights = new int[] { 75, 0, 0, 0, 0 };
		gbl_confirmationPanel.columnWeights = new double[] { 0.0, 0.0,
				Double.MIN_VALUE };
		gbl_confirmationPanel.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0,
				Double.MIN_VALUE };
		confirmationPanel.setLayout(gbl_confirmationPanel);

		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reset();
			}
		});
		GridBagConstraints gbc_btnReset = new GridBagConstraints();
		gbc_btnReset.insets = new Insets(0, 0, 5, 0);
		gbc_btnReset.gridx = 1;
		gbc_btnReset.gridy = 1;
		confirmationPanel.add(btnReset, gbc_btnReset);

		JButton btnPreview = new JButton("Preview");
		btnPreview.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				preview();
			}
		});
		GridBagConstraints gbc_btnPreview = new GridBagConstraints();
		gbc_btnPreview.insets = new Insets(0, 0, 5, 0);
		gbc_btnPreview.gridx = 1;
		gbc_btnPreview.gridy = 2;
		confirmationPanel.add(btnPreview, gbc_btnPreview);

		JButton btnConfirmAndSubmit = new JButton("Confirm and Submit");
		btnConfirmAndSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				save();
			}
		});
		GridBagConstraints gbc_btnConfirmAndSubmit = new GridBagConstraints();
		gbc_btnConfirmAndSubmit.gridx = 1;
		gbc_btnConfirmAndSubmit.gridy = 3;
		confirmationPanel.add(btnConfirmAndSubmit, gbc_btnConfirmAndSubmit);
	}

	private void preview() {
		JOptionPane.showMessageDialog(previewFrame,
				"Name " + txtFirstName.getText() + " " + txtLastName.getText());
		// TODO could copy some of what is found by the save method
	}

	private void save() {
		if (valid()) {
			createPatient();
			pt.toFile();
		}
	}

	private void createPatient() {
		// TODO finish the create PT method
		Address address = buildAddress();
		pt=new Patient();
		pt.setNameFirst(txtFirstName.getText());
		pt.setNameLast(txtLastName.getText());
		pt.setGender((String) boxGender.getSelectedItem());
		pt.setAddress(address);
		
		pt.setBirth(buildDate());//TODO fix this
		pt.setPhysician(txtPhysician.getText());
		pt.setPhoneNumber(txtPhonenumber.getText());;
		pt.setMedicalHistory(txtHistory.getText());
		pt.setAllergies(txtAllergies.getText());


	}
	
	private String buildDate(){
        String monthString;
        switch (boxMonth.getSelectedIndex()) {
            case 1:  monthString = "January";
                     break;
            case 2:  monthString = "February";
                     break;
            case 3:  monthString = "March";
                     break;
            case 4:  monthString = "April";
                     break;
            case 5:  monthString = "May";
                     break;
            case 6:  monthString = "June";
                     break;
            case 7:  monthString = "July";
                     break;
            case 8:  monthString = "August";
                     break;
            case 9:  monthString = "September";
                     break;
            case 10: monthString = "October";
                     break;
            case 11: monthString = "November";
                     break;
            case 12: monthString = "December";
                     break;
            default: monthString = "Invalid month";
                     break;
        }
        return monthString + " " + boxDate.getSelectedIndex() + ", " + txtYear.getText();
	}

	private Address buildAddress() {
		Address address = new Address();
		address.setStreetAddress(txtAddressOne.getText());
		address.setCity(txtCity.getText());
		address.setState(txtState.getText());
		address.setZipCode(txtZip.getText());
		address.setCountry(txtCountry.getText());
		return address;
	}

	private void reset() {
		txtFirstName.setText("");
		txtLastName.setText("");
		txtYear.setText("");
		txtPhonenumber.setText("");
		txtAddressTwo.setText("");
		txtAddressOne.setText("");
		txtCity.setText("");
		txtState.setText("");
		txtCountry.setText("");
		txtZip.setText("");
		txtPhysician.setText("");
		txtAllergies.setText("");
		txtHistory.setText("");
		boxGender.setSelectedItem("No Selection");
		boxDate.setSelectedItem("0");
		boxMonth.setSelectedItem("0");
	}

	private boolean valid() {
		String emptyFields = "The fields were left blank: \n";
		boolean valid = true;

		if (txtFirstName.getText().equals("")) {
			emptyFields = emptyFields + "**First Name \n";
			valid = false;
		}
		if (txtLastName.getText().equals("")) {
			emptyFields = emptyFields + "**Last Name \n";
			valid = false;
		}
		if (txtYear.getText().equals("")) {
			emptyFields = emptyFields + "**Birth Year \n";
			valid = false;
		}
		if (txtPhonenumber.getText().equals("")) {
			emptyFields = emptyFields + "**Phone Number \n";
			valid = false;
		}
		if (txtAddressOne.getText().equals("")) {
			emptyFields = emptyFields + "**Address Line One \n";
			valid = false;
		}
		if (txtCity.getText().equals("")) {
			emptyFields = emptyFields + "**City \n";
			valid = false;
		}
		if (txtState.getText().equals("")) {
			emptyFields = emptyFields + "**State \n";
			valid = false;
		}
		if (txtCountry.getText().equals("")) {
			emptyFields = emptyFields + "**Country \n";
			valid = false;
		}
		if (txtZip.getText().equals("")) {
			emptyFields = emptyFields + "**Zip Code \n";
			valid = false;
		}
		if (txtPhysician.getText().equals("")) {
			emptyFields = emptyFields + "**Physician \n";
			valid = false;
		}

		if (!valid) {
			emptyFields = emptyFields
					+ "Please fill these in before proceeding";
			JOptionPane.showMessageDialog(previewFrame, emptyFields);
		}
		return valid;
	}

	public void setFirstName(String input) {
		txtFirstName.setText(input);
	}

	public void setLastName(String input) {
		txtLastName.setText(input);
	}

	public void setGender(String input) {
		boxGender.setSelectedItem(input);
	}

	public void setYear(String input) {
		txtYear.setText(input);
	}

	public void setPhonenumber(String input) {
		txtPhonenumber.setText(input);
	}

	public void setAddressOne(String input) {
		txtAddressOne.setText(input);
	}

	public void setAddressTwo(String input) {
		txtAddressTwo.setText(input);
	}

	public void setCity(String input) {
		txtCity.setText(input);
	}

	public void setState(String input) {
		txtState.setText(input);
	}

	public void setCountry(String input) {
		txtCountry.setText(input);
	}

	public void setZip(String input) {
		txtZip.setText(input);
	}

	public void setPhysician(String input) {
		txtPhysician.setText(input);
	}

	public void setAllergies(String input) {
		txtAllergies.setText(input);
	}

	public void setHistory(String input) {
		txtHistory.setText(input);
	}

}