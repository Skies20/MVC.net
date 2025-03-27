package RegistraionV1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JToggleButton;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.DefaultComboBoxModel;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;

public class RegistrationForm extends JFrame {

	    private static final long serialVersionUID = 1L;
	    private JPanel contentPane;
	    private JTextField txtfldName;
	    private JComboBox cbGrade;
	    private JComboBox cbStrand;
	    private JComboBox cbStatus;
	    private JComboBox cbTrack;  // Declare the track JComboBox

	    String[] column = {"Name", "Grade", "Strand", "Track", "Status"};
	    String[] grade = {"11", "12"};
	    String[] strand = {"TVL", "Stem", "Abm", "Humss", "Gas"};
	    String[] track = {"TVL", "Abm", "Sports"}; 
	    String[] Academic = {"Stem", "Humss", "Gas"};
	    String[] TVL = {"ICT", "HE", "IA"};
	    String[] Abm = {"Business man", "Accounting", "Entrep"};
	    String[] Sports = {"Officiating", "Coaching", "Physical Conditioning"};
	    String[] status = {"Regular", "Irregular"};

	    private JButton btnAdd;
	    private JScrollPane scrollPane1;
	    private DefaultTableModel registration;
	    
	    /**
	     * Launch the application.
	     */
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

	    /**
	     * Create the frame.
	     */
	    public RegistrationForm() {
	        setTitle("Registration form");
	        initComponent();
	        createEvent();
	    }

	    public void initComponent() {
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setBounds(100, 100, 477, 417);
	        contentPane = new JPanel();
	        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	        setContentPane(contentPane);
	        contentPane.setLayout(null);

	        txtfldName = new JTextField();
	        txtfldName.setBounds(62, 27, 302, 20);
	        contentPane.add(txtfldName);
	        txtfldName.setColumns(10);

	        JLabel lblName = new JLabel("Name");
	        lblName.setBounds(21, 30, 46, 14);
	        contentPane.add(lblName);

	        cbGrade = new JComboBox(grade);
	        cbGrade.setBounds(51, 70, 90, 22);
	        contentPane.add(cbGrade);

	        cbStrand = new JComboBox(strand);
	        cbStrand.setBounds(51, 120, 139, 22);
	        contentPane.add(cbStrand);

	        cbStatus = new JComboBox(status);
	        cbStatus.setBounds(297, 120, 117, 22);
	        contentPane.add(cbStatus);

	        JLabel lblGrade = new JLabel("Grade");
	        lblGrade.setBounds(10, 74, 46, 14);
	        contentPane.add(lblGrade);

	        JLabel lblStrand = new JLabel("Strand");
	        lblStrand.setBounds(10, 124, 46, 14);
	        contentPane.add(lblStrand);

	        btnAdd = new JButton("Add");
	        btnAdd.setBounds(186, 175, 89, 23);
	        contentPane.add(btnAdd);

	        scrollPane1 = new JScrollPane();
	        scrollPane1.setBounds(10, 215, 441, 152);
	        contentPane.add(scrollPane1);

	        JTable table = new JTable();
	        registration = new DefaultTableModel();
	        registration.setColumnIdentifiers(column);
	        table.setModel(registration);
	        scrollPane1.setViewportView(table);

	        JLabel lblTrack = new JLabel("Track");
	        lblTrack.setBounds(252, 74, 46, 14);
	        contentPane.add(lblTrack);

	        JLabel lblStatus = new JLabel("Status");
	        lblStatus.setBounds(252, 124, 46, 14);
	        contentPane.add(lblStatus);

	        // Initialize the track combo box
	        cbTrack = new JComboBox(track);  // Initialize cbTrack here with the default track options
	        cbTrack.setBounds(297, 70, 103, 22);
	        contentPane.add(cbTrack);
	    }

	    public void createEvent() {
	        // Event listener for the Strand JComboBox to update Track options
	        cbStrand.addItemListener(new ItemListener() {
	            public void itemStateChanged(ItemEvent e) {
	                if (cbStrand.getSelectedItem().equals("TVL")) {
	                    cbTrack.setModel(new DefaultComboBoxModel(TVL)); // Update to TVL options
	                } else if (cbStrand.getSelectedItem().equals("Abm")) {
	                    cbTrack.setModel(new DefaultComboBoxModel(Abm)); // Update to ABM options
	                } else if (cbStrand.getSelectedItem().equals("Sports")) {
	                    cbTrack.setModel(new DefaultComboBoxModel(Sports)); // Update to Sports options
	                } else {
	                    cbTrack.setModel(new DefaultComboBoxModel(track)); // Default options for other strands
	                }
	            }
	        });

	        btnAdd.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {                
	                String name = txtfldName.getText();
	                String grade = (String) cbGrade.getSelectedItem();
	                String strand = (String) cbStrand.getSelectedItem();
	                String track = (String) cbTrack.getSelectedItem();
	                String status = (String) cbStatus.getSelectedItem();

	                String[] registrationData = {name, grade, strand, track, status};            
	                registration.addRow(registrationData);
	            }
	        });
	    }
	}



