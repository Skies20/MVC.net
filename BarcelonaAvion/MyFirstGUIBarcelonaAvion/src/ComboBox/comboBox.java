package ComboBox;

import java.awt.EventQueue;
import java.util.Enumeration;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JEditorPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;

public class comboBox extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	String[] Vehicle = {"Car", "Motorcycle", "Bike"};
	String[] Car = {"Toyota", "Mitsubishi", "BMW"};
	String[] Motorcycle = {"Ducati", "Honda", "Kawasaki"};
	String[] Bike = {"Scott", "Trek", "Kona"};
	
	String[] Books = {"Manga", "Comics", "Novel"};
	String[] Manga = {"Fantasy", "Romantic", "Horror"};
	String[] Comics = {"Comedy", "Horror", "Science Fiction"};
	String[] Novel = {"Romantic", "Mystery", "Historical"};
	
	private JComboBox cbVehicle;
	private JComboBox cbBrand;
	private JLabel lblVehicle;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JRadioButton rdbtnMale;
	private JRadioButton rdbtnFemale;
	private JRadioButton rdbtnAlien;
	private JCheckBox chckbxNewCheckBox;
	private JCheckBox chckbxNewCheckBox_1;
	private JCheckBox chckbxNewCheckBox_2;
	private JButton btnNewButton;
	private JButton btnConfirmSex;
	private JLabel lblTypesOfBook;
	private JLabel lblNewLabel;
	private JComboBox cbBooks;
	private JComboBox cbTypes;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					comboBox frame = new comboBox();
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
	public comboBox() {
		initComponent();
		createEvent();
	}
	public void initComponent() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 543);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		cbVehicle = new JComboBox();

		cbVehicle.setModel(new DefaultComboBoxModel(Vehicle));
		cbVehicle.setBounds(94, 63, 236, 22);
		contentPane.add(cbVehicle);
		
		lblVehicle = new JLabel("Vehicle"); 
		lblVehicle.setBounds(94, 38, 46, 14);
		contentPane.add(lblVehicle);
		
		cbBrand = new JComboBox();
		
		cbBrand.setBounds(94, 132, 236, 22);
		contentPane.add(cbBrand);
		JLabel lblBrand = new JLabel("Brand");
		lblBrand.setBounds(94, 107, 46, 14);
		contentPane.add(lblBrand);
		
		btnNewButton = new JButton("Confirm");
		btnNewButton.setEnabled(false);

		btnNewButton.setBounds(64, 453, 109, 31);
		contentPane.add(btnNewButton);
		
		chckbxNewCheckBox = new JCheckBox("Are you sure?");
		chckbxNewCheckBox.setBounds(64, 371, 148, 23);
		contentPane.add(chckbxNewCheckBox);
		
		chckbxNewCheckBox_1 = new JCheckBox("Are you really sure??");
		chckbxNewCheckBox_1.setBounds(64, 397, 166, 23);
		contentPane.add(chckbxNewCheckBox_1);
		
		chckbxNewCheckBox_2 = new JCheckBox("AGREE AGREE AGREE!!");
		chckbxNewCheckBox_2.setBounds(64, 423, 166, 23);
		contentPane.add(chckbxNewCheckBox_2);
		
		rdbtnFemale = new JRadioButton("Female");
		buttonGroup.add(rdbtnFemale);
		rdbtnFemale.setBounds(250, 397, 109, 23);
		contentPane.add(rdbtnFemale);
		
		rdbtnMale = new JRadioButton("Male");
		buttonGroup.add(rdbtnMale);
		rdbtnMale.setBounds(250, 371, 109, 23);
		contentPane.add(rdbtnMale);
		
		rdbtnAlien = new JRadioButton("Alien");
		buttonGroup.add(rdbtnAlien);
		rdbtnAlien.setBounds(250, 423, 109, 23);
		contentPane.add(rdbtnAlien);
		
		cbBooks = new JComboBox();
		cbBooks.setModel(new DefaultComboBoxModel(new String[] {"Books"}));
		cbBooks.setBounds(94, 251, 236, 22);
		contentPane.add(cbBooks);
		
		cbTypes = new JComboBox();
		cbTypes.setBounds(94, 320, 236, 22);
		contentPane.add(cbTypes);
		
		lblNewLabel = new JLabel("Books");
		lblNewLabel.setBounds(94, 226, 46, 14);
		contentPane.add(lblNewLabel);
		
		lblTypesOfBook = new JLabel("Types of books");
		lblTypesOfBook.setBounds(94, 295, 116, 14);
		contentPane.add(lblTypesOfBook);
		
		btnConfirmSex = new JButton("Confirm");
		btnConfirmSex.setEnabled(false);
		btnConfirmSex.setBounds(250, 455, 99, 27);
		contentPane.add(btnConfirmSex);
	}
	public void createEvent() {
		cbVehicle.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		if (cbVehicle.getSelectedItem().equals("Car")) {
			cbBrand.setModel(new DefaultComboBoxModel(Car));
		} else if (cbVehicle.getSelectedItem().equals("Motorcycle")) {
		cbBrand.setModel(new DefaultComboBoxModel(Motorcycle));
		} else if (cbVehicle.getSelectedItem().equals("Bike")) {
			cbBrand.setModel(new DefaultComboBoxModel(Bike));
		}
		cbBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		cbTypes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		}
		});//vehicle choices
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxNewCheckBox.isSelected() && chckbxNewCheckBox_1.isSelected() && chckbxNewCheckBox_2.isSelected()) {
					btnNewButton.setEnabled(true);
				}else {
					btnNewButton.setEnabled(false);
				}
			}
		});
		chckbxNewCheckBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxNewCheckBox.isSelected() && chckbxNewCheckBox_1.isSelected() && chckbxNewCheckBox_2.isSelected()) {
					btnNewButton.setEnabled(true);
				}else {
					btnNewButton.setEnabled(false);
				}
			}
		});
		chckbxNewCheckBox_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxNewCheckBox.isSelected() && chckbxNewCheckBox_1.isSelected() && chckbxNewCheckBox_2.isSelected()) {
					btnNewButton.setEnabled(true);
				}else {
					btnNewButton.setEnabled(false);
				}
			}
		});
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxNewCheckBox.isSelected() && chckbxNewCheckBox_1.isSelected() && chckbxNewCheckBox_2.isSelected()) {
					btnNewButton.setEnabled(true);
				}else {
					btnNewButton.setEnabled(false);
				}
			}
		});//confirm if all three are selected
		
		rdbtnMale.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		rdbtnFemale.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		rdbtnAlien.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
//		btnConfirmSex.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				boolean chooseOne = false; 
//						AbstractButtonfor (Enumeration<AbstractButton> buttons =
//						rbSex.getElements(); buttons.hasMoreElements();) {
//					
//				}
//						if (button.isSelected()) {
//							
//						}
//			}
//		});
	}
}


