package Registration;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import ComboBox.comboBox;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JScrollPane;

public class RegistrationForm extends JFrame {
	public RegistrationForm() {
		setBackground(new Color(240, 240, 240));
		setTitle("Registration Form (Student)");
		getContentPane().setLayout(null);
		
		txtfldFName = new JTextField();
		txtfldFName.setBounds(10, 35, 211, 20);
		getContentPane().add(txtfldFName);
		txtfldFName.setColumns(10);
		
		txtfldMName = new JTextField();
		txtfldMName.setBounds(231, 35, 211, 20);
		txtfldMName.setColumns(10);
		getContentPane().add(txtfldMName);
		
		txtfldLName = new JTextField();
		txtfldLName.setBounds(452, 35, 211, 20);
		txtfldLName.setColumns(10);
		getContentPane().add(txtfldLName);
		
		cbExt = new JComboBox();
		cbExt.setBounds(673, 34, 67, 22);
		getContentPane().add(cbExt);
		
		JLabel lblNewLabel = new JLabel("Firstname");
		lblNewLabel.setBounds(10, 21, 61, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblLName = new JLabel("Lastname");
		lblLName.setBounds(455, 21, 46, 14);
		getContentPane().add(lblLName);
		
		JLabel lblMName = new JLabel("Middlename");
		lblMName.setBounds(233, 21, 70, 14);
		getContentPane().add(lblMName);
		
		JLabel lblNewLabel_3 = new JLabel("Sex");
		lblNewLabel_3.setBounds(20, 61, 46, 14);
		getContentPane().add(lblNewLabel_3);
		
		rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setBounds(20, 82, 109, 23);
		buttonGroup_1.add(rdbtnMale);
		getContentPane().add(rdbtnMale);
		
		rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setBounds(128, 82, 109, 23);
		buttonGroup_1.add(rdbtnFemale);
		getContentPane().add(rdbtnFemale);
		
		txtfldLrn = new JTextField();
		txtfldLrn.setBounds(281, 83, 238, 20);
		getContentPane().add(txtfldLrn);
		txtfldLrn.setColumns(10);
		
		JLabel lblnewjlable = new JLabel("Birthday");
		lblnewjlable.setBounds(529, 66, 67, 14);
		getContentPane().add(lblnewjlable);
		
		cbMonth = new JComboBox();
		cbMonth.setBounds(529, 82, 98, 22);
		cbMonth.setEnabled(false);
		cbMonth.setModel(new DefaultComboBoxModel(month));
		getContentPane().add(cbMonth);
		
		cbDate = new JComboBox();
		cbDate.setBounds(637, 82, 46, 22);
		cbDate.setModel(new DefaultComboBoxModel());
		getContentPane().add(cbDate);
		
		cbYear = new JComboBox();
		cbYear.setBounds(694, 82, 46, 22);
		cbYear.setModel(new DefaultComboBoxModel(year));
		getContentPane().add(cbYear);
		
		JLabel lblNewLabel_5 = new JLabel("Grade");
		lblNewLabel_5.setBounds(20, 112, 46, 14);
		getContentPane().add(lblNewLabel_5);
		
		rdbtnEleven = new JRadioButton("11");
		rdbtnEleven.setBounds(20, 133, 61, 23);
		buttonGroup.add(rdbtnEleven);
		getContentPane().add(rdbtnEleven);
		
		rdbtnTwelve = new JRadioButton("12");
		rdbtnTwelve.setBounds(128, 133, 61, 23);
		buttonGroup.add(rdbtnTwelve);
		getContentPane().add(rdbtnTwelve);
		
		cbTrack = new JComboBox();
		cbTrack.setBounds(281, 133, 230, 22);
		getContentPane().add(cbTrack);
		
		cbStrand = new JComboBox();
		cbStrand.setBounds(520, 133, 220, 22);
		getContentPane().add(cbStrand);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.setBounds(20, 166, 169, 23);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Edith");
		btnNewButton_1.setBounds(199, 166, 169, 23);
		getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Delete");
		btnNewButton_2.setBounds(392, 166, 169, 23);
		getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Clear");
		btnNewButton_3.setBounds(571, 166, 169, 23);
		getContentPane().add(btnNewButton_3);
		
		JLabel lblNewLabel_6 = new JLabel("LRN");
		lblNewLabel_6.setBounds(281, 66, 46, 14);
		getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Track");
		lblNewLabel_7.setBounds(281, 112, 46, 14);
		getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Strand");
		lblNewLabel_8.setBounds(564, 115, 46, 14);
		getContentPane().add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Ext");
		lblNewLabel_9.setBounds(673, 21, 55, 14);
		getContentPane().add(lblNewLabel_9);
	}

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtfldMName;
	private JTextField txtfldLName;
	private JTextField txtfldLrn;
	String[] ext = {"","Jr","I","II","III","IV","V"};
	String[] month = {"January","February","March","April","May","June","July","August","September","October","November","December"};
	String[] date30 = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24"
			,"25","26","27","28","29","30"};
	String[] date31 = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24"
			,"25","26","27","28","29","30","31"};
	String[] date28 = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24"
			,"25","26","27","28"};
	String[] date29 = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24"
			,"25","26","27","28","29"};
	String[] year = {"Year","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2015",
			"2016","2017","2018","2019","2020","2021","2022","2023","2024","2025"};
	
	private JTextField txtfldFName;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private JComboBox cbExt;
	private JRadioButton rdbtnMale;
	private JRadioButton rdbtnFemale;
	private JComboBox cbMonth;
	private JComboBox cbDate;
	private JComboBox cbYear;
	private JRadioButton rdbtnEleven;
	private JRadioButton rdbtnTwelve;
	private JComboBox cbTrack;
	private JComboBox cbStrand;
	private JTable table;
	private JScrollPane scrollPane;
	DefaultTableModel model;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistrationForm frame = new RegistrationForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void RegistrationForm() {
		initComponent();
		createEvent();
	}
    public void initComponent() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 228, 730, 169);
		getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
	}//closing ng initComponent
    public void createEvent() {
		cbMonth.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			int month = cbMonth.getSelectedIndex();
			if(month==4 ||month==6 || month==9 || month==11) {
				cbDate.setModel(new DefaultComboBoxModel(date30));
			}else if (month ==2) {
				cbDate.setModel(new DefaultComboBoxModel(date28));
			}else {
				cbDate.setModel(new DefaultComboBoxModel(date31));
			}
			}
		});
		
		cbYear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (cbYear.getSelectedIndex()>0) {
					cbMonth.enable(true);
				}
			}
		});
		
		cbMonth.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
    	
    }//closing ng createEvent
}
