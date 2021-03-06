package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{30, 111, 30, 0};
		gbl_panel.rowHeights = new int[]{30, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{1.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JButton btnNewUser = new JButton("New User");
		btnNewUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				NewPatient.run();
			}
		});
		GridBagConstraints gbc_btnNewUser = new GridBagConstraints();
		gbc_btnNewUser.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewUser.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewUser.gridx = 1;
		gbc_btnNewUser.gridy = 1;
		panel.add(btnNewUser, gbc_btnNewUser);
		
		JButton btnLoadUser = new JButton("Load User From File");
		GridBagConstraints gbc_btnLoadUser = new GridBagConstraints();
		gbc_btnLoadUser.insets = new Insets(0, 0, 5, 5);
		gbc_btnLoadUser.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnLoadUser.gridx = 1;
		gbc_btnLoadUser.gridy = 2;
		panel.add(btnLoadUser, gbc_btnLoadUser);
		
		JButton btnLoadByName = new JButton("Load by Name");
		GridBagConstraints gbc_btnLoadByName = new GridBagConstraints();
		gbc_btnLoadByName.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnLoadByName.insets = new Insets(0, 0, 5, 5);
		gbc_btnLoadByName.gridx = 1;
		gbc_btnLoadByName.gridy = 3;
		panel.add(btnLoadByName, gbc_btnLoadByName);
		
		JButton btnLoadFromRfid = new JButton("Load From RFID");
		GridBagConstraints gbc_btnLoadFromRfid = new GridBagConstraints();
		gbc_btnLoadFromRfid.insets = new Insets(0, 0, 5, 5);
		gbc_btnLoadFromRfid.gridx = 1;
		gbc_btnLoadFromRfid.gridy = 4;
		panel.add(btnLoadFromRfid, gbc_btnLoadFromRfid);
	}

}