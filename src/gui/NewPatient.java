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
import javax.swing.JEditorPane;

public class NewPatient extends JFrame {

	private JPanel contentPane;
	private final JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
	private JTextField txtFirstName;
	private JTextField txtLastName;
	private JTextField textField;
	private JTextField txtYear;
	private JTextField txtPhonenumber;
	private JTextField txtPhysician;
	public JFrame previewFrame;	
	
	
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
		gbl_namePanel.columnWidths = new int[]{120, 76, 114, 0};
		gbl_namePanel.rowHeights = new int[]{95, 0, 0, 0};
		gbl_namePanel.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_namePanel.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		namePanel.setLayout(gbl_namePanel);
		
		JLabel FirstNameLabel = new JLabel("First Name");
		GridBagConstraints gbc_FirstNameLabel = new GridBagConstraints();
		gbc_FirstNameLabel.anchor = GridBagConstraints.WEST;
		gbc_FirstNameLabel.insets = new Insets(0, 0, 5, 5);
		gbc_FirstNameLabel.gridx = 1;
		gbc_FirstNameLabel.gridy = 1;
		namePanel.add(FirstNameLabel, gbc_FirstNameLabel);
		
		txtFirstName = new JTextField();
		txtFirstName.setText("Ex. John");
		GridBagConstraints gbc_txtFirstName = new GridBagConstraints();
		gbc_txtFirstName.anchor = GridBagConstraints.NORTHWEST;
		gbc_txtFirstName.insets = new Insets(0, 0, 5, 0);
		gbc_txtFirstName.gridx = 2;
		gbc_txtFirstName.gridy = 1;
		namePanel.add(txtFirstName, gbc_txtFirstName);
		txtFirstName.setColumns(10);
		
		JLabel lblLastName = new JLabel("Last Name");
		GridBagConstraints gbc_lblLastName = new GridBagConstraints();
		gbc_lblLastName.anchor = GridBagConstraints.EAST;
		gbc_lblLastName.insets = new Insets(0, 0, 0, 5);
		gbc_lblLastName.gridx = 1;
		gbc_lblLastName.gridy = 2;
		namePanel.add(lblLastName, gbc_lblLastName);
		
		txtLastName = new JTextField();
		txtLastName.setText("Ex. Smith");
		GridBagConstraints gbc_txtLastName = new GridBagConstraints();
		gbc_txtLastName.anchor = GridBagConstraints.WEST;
		gbc_txtLastName.gridx = 2;
		gbc_txtLastName.gridy = 2;
		namePanel.add(txtLastName, gbc_txtLastName);
		txtLastName.setColumns(10);
		
		JPanel personalPanel = new JPanel();
		tabbedPane.addTab("Personal", null, personalPanel, null);
		GridBagLayout gbl_personalPanel = new GridBagLayout();
		gbl_personalPanel.columnWidths = new int[]{30, 0, 0, 30, 0};
		gbl_personalPanel.rowHeights = new int[]{75, 0, 0, 0, 0};
		gbl_personalPanel.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_personalPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		personalPanel.setLayout(gbl_personalPanel);
		
		JLabel lblGender = new JLabel("Gender");
		GridBagConstraints gbc_lblGender = new GridBagConstraints();
		gbc_lblGender.anchor = GridBagConstraints.WEST;
		gbc_lblGender.insets = new Insets(0, 0, 5, 5);
		gbc_lblGender.gridx = 1;
		gbc_lblGender.gridy = 1;
		personalPanel.add(lblGender, gbc_lblGender);
		
		JComboBox boxGender = new JComboBox();
		boxGender.setModel(new DefaultComboBoxModel(new String[] {"No Selection", "Male", "Female"}));
		GridBagConstraints gbc_boxGender = new GridBagConstraints();
		gbc_boxGender.insets = new Insets(0, 0, 5, 5);
		gbc_boxGender.fill = GridBagConstraints.HORIZONTAL;
		gbc_boxGender.gridx = 2;
		gbc_boxGender.gridy = 1;
		personalPanel.add(boxGender, gbc_boxGender);
		
		JLabel lblBirth = new JLabel("Birth");
		GridBagConstraints gbc_lblBirth = new GridBagConstraints();
		gbc_lblBirth.anchor = GridBagConstraints.WEST;
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
		
		JComboBox boxMonth = new JComboBox();
		boxMonth.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		DatePanel.add(boxMonth);
		
		JComboBox boxDate = new JComboBox();
		boxDate.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		DatePanel.add(boxDate);
		
		txtYear = new JTextField();
		DatePanel.add(txtYear);
		txtYear.setColumns(10);
		
		JLabel lblPhoneNumber = new JLabel("Phone Number");
		GridBagConstraints gbc_lblPhoneNumber = new GridBagConstraints();
		gbc_lblPhoneNumber.anchor = GridBagConstraints.WEST;
		gbc_lblPhoneNumber.insets = new Insets(0, 0, 0, 5);
		gbc_lblPhoneNumber.gridx = 1;
		gbc_lblPhoneNumber.gridy = 3;
		personalPanel.add(lblPhoneNumber, gbc_lblPhoneNumber);
		
		txtPhonenumber = new JTextField();
		txtPhonenumber.setText("ex. 1112223333");
		GridBagConstraints gbc_txtPhonenumber = new GridBagConstraints();
		gbc_txtPhonenumber.insets = new Insets(0, 0, 0, 5);
		gbc_txtPhonenumber.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPhonenumber.gridx = 2;
		gbc_txtPhonenumber.gridy = 3;
		personalPanel.add(txtPhonenumber, gbc_txtPhonenumber);
		txtPhonenumber.setColumns(10);
		
		JPanel addressPanel = new JPanel();
		tabbedPane.addTab("Address", null, addressPanel, null);
		GridBagLayout gbl_addressPanel = new GridBagLayout();
		gbl_addressPanel.columnWidths = new int[]{120, 0, 0, 0, 0};
		gbl_addressPanel.rowHeights = new int[]{30, 30, 30, 0, 0};
		gbl_addressPanel.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_addressPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		addressPanel.setLayout(gbl_addressPanel);
		
		JLabel lblNewLabel = new JLabel("New label");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 3;
		addressPanel.add(lblNewLabel, gbc_lblNewLabel);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 0, 5);
		gbc_textField.anchor = GridBagConstraints.WEST;
		gbc_textField.gridx = 2;
		gbc_textField.gridy = 3;
		addressPanel.add(textField, gbc_textField);
		textField.setColumns(10);
		
		JPanel medicalPanel = new JPanel();
		tabbedPane.addTab("Medical", null, medicalPanel, null);
		GridBagLayout gbl_medicalPanel = new GridBagLayout();
		gbl_medicalPanel.columnWidths = new int[]{30, 0, 0, 0};
		gbl_medicalPanel.rowHeights = new int[]{0, 0, 0, 0};
		gbl_medicalPanel.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_medicalPanel.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		medicalPanel.setLayout(gbl_medicalPanel);
		
		JLabel lblPhysician = new JLabel("Physician");
		GridBagConstraints gbc_lblPhysician = new GridBagConstraints();
		gbc_lblPhysician.insets = new Insets(0, 0, 0, 5);
		gbc_lblPhysician.anchor = GridBagConstraints.EAST;
		gbc_lblPhysician.gridx = 1;
		gbc_lblPhysician.gridy = 2;
		medicalPanel.add(lblPhysician, gbc_lblPhysician);
		
		txtPhysician = new JTextField();
		GridBagConstraints gbc_txtPhysician = new GridBagConstraints();
		gbc_txtPhysician.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPhysician.gridx = 2;
		gbc_txtPhysician.gridy = 2;
		medicalPanel.add(txtPhysician, gbc_txtPhysician);
		txtPhysician.setColumns(10);
		
		JPanel confirmationPanel = new JPanel();
		tabbedPane.addTab("Confirmation", null, confirmationPanel, null);
		GridBagLayout gbl_confirmationPanel = new GridBagLayout();
		gbl_confirmationPanel.columnWidths = new int[]{135, 0, 0};
		gbl_confirmationPanel.rowHeights = new int[]{75, 0, 0, 0, 0};
		gbl_confirmationPanel.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_confirmationPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		confirmationPanel.setLayout(gbl_confirmationPanel);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NewPatient.run();
				
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
				JOptionPane.showMessageDialog(previewFrame,
						"Name " + txtFirstName.getText() +" "+ txtLastName.getText());
			}
		});
		GridBagConstraints gbc_btnPreview = new GridBagConstraints();
		gbc_btnPreview.insets = new Insets(0, 0, 5, 0);
		gbc_btnPreview.gridx = 1;
		gbc_btnPreview.gridy = 2;
		confirmationPanel.add(btnPreview, gbc_btnPreview);
		
		JButton btnConfirmAndSubmit = new JButton("Confirm and Submit");
		GridBagConstraints gbc_btnConfirmAndSubmit = new GridBagConstraints();
		gbc_btnConfirmAndSubmit.gridx = 1;
		gbc_btnConfirmAndSubmit.gridy = 3;
		confirmationPanel.add(btnConfirmAndSubmit, gbc_btnConfirmAndSubmit);
	}
}
