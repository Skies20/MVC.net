package studentForm;

import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class StudentForm extends JFrame {
	String[] Ext = {" ","Sr","Jr","I","II","III","IV","V"};
	String[] month = {"Month","January","February", "March","April","May","June","July","August","September","October","November","December"};
	String[] day31 = {"Date","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
	String[] day30 = {"Date","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30"};
	String[] day29 = {"Date","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29"};
	String[] day28 = {"Date","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28"};
	String[] Year = {"Year","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020","2021","2022","2023","2024","2025"
			};
	String[] track = {"Track","Academics","Sports","ABM","TVL"};
	String[] Academics = {"HUMSS","STEM"};
	String[] Sports = {"Sports fundamentals","Human movement","Safety and first aid","Sports officiating","Coaching","Fitness testing","sychosocial aspects of sport"};
	String[] ABM = {"Marketing","Accountancy","Entrepreneurship","Banking and Finance","Business Administration","Business Administration","Hospitality Management","Management Accounting"};
	String[] TVL = {"HE","IA","ICT"};

	String[] column = {"First Name","Middle Name","Last Name","Ext","Sex","LRN","Birthday","Grade","Track","Strand"};
	String[] studentData01= 
			 {"Ireneo","Magbanua","Barcelona","III","Mail","136635120599","December 1, 2006","18","TVL","ICT"};
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField mnTextField;
	private JTextField lnTextField;
	private JTextField fnTextField;
	private JComboBox extCB;
	private JLabel Sex;
	private JTextField lrnTextField;
	private final ButtonGroup kasarian = new ButtonGroup();
	private final ButtonGroup gradeGroup = new ButtonGroup();
	private JRadioButton maleRadioBtn;
	private JRadioButton femaleRadioBtn;
	private JComboBox monthCB;
	private JComboBox dayCB;
	private JComboBox yearCB;
	private JComboBox strandCB;
	private JComboBox trackCB;
	private JRadioButton grade12Btn;
	private JRadioButton grade11Btn;
	private JTable table;
	private JScrollPane scrollPane;
	private JButton addBtn;
	private JButton editBtn;
	private JButton deleteBtn;
	private JButton clearBtn;
	DefaultTableModel student;
	private Component frame;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentForm frame = new StudentForm();
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
	public StudentForm() {
		setTitle("REGISTRATION FORM");
		initComponent();
		createEvent();
		
	}//registration
	
	public void initComponent() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1043, 576);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel firstName = new JLabel("First Name");
		firstName.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		firstName.setBounds(27, 10, 112, 14);
		contentPane.add(firstName);
		
		JLabel middleName = new JLabel("Middle Name\r\n");
		middleName.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		middleName.setBounds(332, 10, 129, 14);
		contentPane.add(middleName);
		
		JLabel lastName = new JLabel("Last Name\r\n");
		lastName.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		lastName.setBounds(630, 10, 129, 14);
		contentPane.add(lastName);
		
		fnTextField = new JTextField();
	
		fnTextField.setBounds(27, 26, 295, 20);
		contentPane.add(fnTextField);
		fnTextField.setColumns(10);
		
		mnTextField = new JTextField();
		mnTextField.setColumns(10);
		mnTextField.setBounds(332, 26, 288, 20);
		contentPane.add(mnTextField);
		
		lnTextField = new JTextField();
	
		lnTextField.setColumns(10);
		lnTextField.setBounds(630, 26, 288, 20);
		contentPane.add(lnTextField);
		
		extCB = new JComboBox();
		extCB.setModel(new DefaultComboBoxModel(new String[] {" ", "Sr", "Jr", "II", "III", "IV", "V"}));
		extCB.setBounds(928, 24, 89, 22);
		contentPane.add(extCB);
		
		Sex = new JLabel("Sex\r\n");
		Sex.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		Sex.setBounds(27, 69, 35, 14);
		contentPane.add(Sex);
		
		maleRadioBtn = new JRadioButton("Male\r\n");
		maleRadioBtn.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		maleRadioBtn.setActionCommand("Male");
		kasarian.add(maleRadioBtn);
		maleRadioBtn.setBounds(27, 90, 61, 23);
		contentPane.add(maleRadioBtn);
		
		femaleRadioBtn = new JRadioButton("Female\r\n");
		femaleRadioBtn.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		femaleRadioBtn.setActionCommand("Female");
		kasarian.add(femaleRadioBtn);
		femaleRadioBtn.setBounds(148, 90, 72, 23);
		contentPane.add(femaleRadioBtn);
		
		JLabel LRN = new JLabel("LRN\r\n");
		LRN.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		LRN.setBounds(278, 69, 35, 14);
		contentPane.add(LRN);
		
		lrnTextField = new JTextField();
		lrnTextField.setColumns(10);
		lrnTextField.setBounds(278, 92, 342, 20);
		contentPane.add(lrnTextField);
		
		JLabel birthday = new JLabel("Birthday");
		birthday.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		birthday.setBounds(629, 65, 78, 22);
		contentPane.add(birthday);
		
		monthCB = new JComboBox();
	
		monthCB.setModel(new DefaultComboBoxModel(month));
		monthCB.setBounds(763, 92, 123, 22);
		contentPane.add(monthCB);
		
		dayCB = new JComboBox();
	    dayCB.setBounds(894, 92, 123, 22);
	    dayCB.setEnabled(false); // Disable the day combo box initially
	    contentPane.add(dayCB);
		
		yearCB = new JComboBox();

		yearCB.setModel(new DefaultComboBoxModel(Year));
		yearCB.setBounds(630, 92, 123, 22);
		contentPane.add(yearCB);
		
		JLabel Grade = new JLabel("Grade");
		Grade.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 16));
		Grade.setBounds(27, 130, 61, 14);
		contentPane.add(Grade);
		
		grade11Btn = new JRadioButton("11");
		grade11Btn.setFont(new Font("Tahoma", Font.PLAIN, 14));
		grade11Btn.setActionCommand("11");
		gradeGroup.add(grade11Btn);
		grade11Btn.setBounds(27, 151, 49, 23);
		contentPane.add(grade11Btn);
		
		grade12Btn = new JRadioButton("12");
		grade12Btn.setFont(new Font("Tahoma", Font.PLAIN, 14));
		grade12Btn.setActionCommand("12");
		gradeGroup.add(grade12Btn);
		grade12Btn.setBounds(148, 151, 55, 23);
		contentPane.add(grade12Btn);
		
		JLabel Track = new JLabel("Track");
		Track.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		Track.setBounds(278, 130, 49, 14);
		contentPane.add(Track);
		
		trackCB = new JComboBox();
		trackCB.setModel(new DefaultComboBoxModel(track));
		trackCB.setBounds(279, 151, 341, 22);
		contentPane.add(trackCB);
		
		JLabel Strand = new JLabel("Strand\r\n");
		Strand.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		Strand.setBounds(630, 130, 61, 14);
		contentPane.add(Strand);
		
		strandCB = new JComboBox();
		strandCB.setBounds(630, 151, 387, 22);
		contentPane.add(strandCB);
		
		addBtn = new JButton("Add");
		
		
		addBtn.setBounds(27, 216, 233, 34);
		contentPane.add(addBtn);
		
		editBtn = new JButton("Edith");
		editBtn.setBounds(280, 216, 233, 34);
		contentPane.add(editBtn);
		
		deleteBtn = new JButton("Delete");
		deleteBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		deleteBtn.setBounds(534, 216, 233, 34);
		contentPane.add(deleteBtn);
		
		clearBtn = new JButton("Clear");
		clearBtn.setBounds(784, 216, 233, 34);
		contentPane.add(clearBtn);
		
		JLabel Suffix = new JLabel("Suffix");
		Suffix.setFont(new Font("Sitka Display", Font.BOLD, 16));
		Suffix.setBounds(928, 10, 78, 14);
		contentPane.add(Suffix);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(27, 273, 990, 253);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		student = new DefaultTableModel();
		table.setModel(student);
		for(String c: column) {
			student.addColumn(c);
		}
		student.addRow(studentData01);
		
	}//initComponent
	
	public void createEvent() {
	    monthCB.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	            if (monthCB.getSelectedIndex() > 0 && yearCB.getSelectedIndex() > 0) {
	                dayCB.setEnabled(true); // Enable day combo box only if both month and year are selected
	                int month = monthCB.getSelectedIndex();

	                if (month == 4 || month == 6 || month == 9 || month == 11) {
	                    dayCB.setModel(new DefaultComboBoxModel(day30));
	                } else if (month == 2) {
	                    int year = Integer.parseInt((String) yearCB.getSelectedItem());
	                    int leapYear = year % 4;
	                    if (leapYear == 0) {
	                        dayCB.setModel(new DefaultComboBoxModel(day29));
	                    } else {
	                        dayCB.setModel(new DefaultComboBoxModel(day28));
	                    }
	                } else {
	                    dayCB.setModel(new DefaultComboBoxModel(day31));
	                }
	            } else {
	                dayCB.setEnabled(false); // Disable day combo box if month or year is not selected
	            }
	        }
	    });

	    yearCB.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	            if (yearCB.getSelectedIndex() > 0 && monthCB.getSelectedIndex() > 0) {
	                dayCB.setEnabled(true); // Enable day combo box only if both month and year are selected
	            } else {
	                dayCB.setEnabled(false); // Disable day combo box if month or year is not selected
	            }
	        }
	    });
		
		trackCB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(trackCB.getSelectedItem().equals("Academics")) {
					strandCB.setModel(new DefaultComboBoxModel(Academics));
				}else if(trackCB.getSelectedItem().equals("Sports")) {
					strandCB.setModel(new DefaultComboBoxModel(Sports));
				}else if(trackCB.getSelectedItem().equals("TVL")) {
					strandCB.setModel(new DefaultComboBoxModel(TVL));
				}else if(trackCB.getSelectedItem().equals("ABM")) {
					strandCB.setModel(new DefaultComboBoxModel(ABM));
				}
				
			}
		});
		
		addBtn.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent e) {
				String fn = fnTextField.getText();
				String mn = mnTextField.getText();
				String ln = lnTextField.getText();
				String ext = String.valueOf(extCB.getSelectedItem());
				String sex = String.valueOf(kasarian.getSelection().getActionCommand());
				String LRN = lrnTextField.getText();
				String month = String.valueOf(monthCB.getSelectedItem());
				String day = String.valueOf(dayCB.getSelectedItem());
				String year = String.valueOf(yearCB.getSelectedItem());
				String bd = month +" "+ day + ", "+ year;
				String grade = String.valueOf(gradeGroup.getSelection().getActionCommand());
				String track = String.valueOf(trackCB.getSelectedItem());
				String strand = String.valueOf(strandCB.getSelectedItem());
				if(fn=="" || mn=="" || ln=="" || ext=="") {
					JOptionPane.showMessageDialog(frame, "Please Complete the name!",
							"asdf", JOptionPane.WARNING_MESSAGE);
				}else if(sex=="") {
					JOptionPane.showMessageDialog(frame, "Please Complete the name!",
							"asdf", JOptionPane.WARNING_MESSAGE);
				}else if (fnTextField.getText()=="") {
					
				}
				String[] studentData = {fn,mn,ln,ext,sex,LRN,bd,grade,track,strand };
				student.addRow(studentData);
			}
		});
		
	}//createEvent
}
