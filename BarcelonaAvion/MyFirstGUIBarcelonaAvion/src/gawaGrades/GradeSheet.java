package gawaGrades;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GradeSheet extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfName;
	private JTextField tfMIL;
	private JTextField tfPS;
	private JTextField tfImmersion;
	private JTextField tfJava;
	private JTextField tfIIIR;
	private JTextField tfPE;
	private JTable table;
	String[] column = {"Name","MIL","P.S","Immersion","P.E","IIIR","Java"};
	private JButton btnAdd;
	private JScrollPane scrollPane;
	DefaultTableModel grades;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GradeSheet frame = new GradeSheet();
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
	public GradeSheet() {
		setTitle("Grade sheet");
		initComponent();
		createEvent();
	}
	public void initComponent() {
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 320);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tfName = new JTextField();
		tfName.setBounds(72, 21, 352, 20);
		contentPane.add(tfName);
		tfName.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setBounds(40, 24, 46, 14);
		contentPane.add(lblNewLabel);
		
		tfMIL = new JTextField();
		tfMIL.setBounds(70, 52, 123, 20);
		contentPane.add(tfMIL);
		tfMIL.setColumns(10);
		
		tfPS = new JTextField();
		tfPS.setColumns(10);
		tfPS.setBounds(60, 83, 133, 20);
		contentPane.add(tfPS);
		
		tfImmersion = new JTextField();
		tfImmersion.setColumns(10);
		tfImmersion.setBounds(70, 114, 118, 20);
		contentPane.add(tfImmersion);
		
		tfJava = new JTextField();
		tfJava.setColumns(10);
		tfJava.setBounds(292, 114, 123, 20);
		contentPane.add(tfJava);
		
		tfIIIR = new JTextField();
		tfIIIR.setColumns(10);
		tfIIIR.setBounds(302, 83, 122, 20);
		contentPane.add(tfIIIR);
		
		tfPE = new JTextField();
		tfPE.setColumns(10);
		tfPE.setBounds(292, 52, 132, 20);
		contentPane.add(tfPE);
		
		JLabel lblNewLabel_1 = new JLabel("MIL");
		lblNewLabel_1.setBounds(40, 55, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("P.S");
		lblNewLabel_1_1.setBounds(40, 86, 46, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Immersion");
		lblNewLabel_1_2.setBounds(10, 117, 62, 14);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Jabai");
		lblNewLabel_1_2_1.setBounds(265, 117, 46, 14);
		contentPane.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("IIIR");
		lblNewLabel_1_1_1.setBounds(265, 86, 46, 14);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_3 = new JLabel("P.E");
		lblNewLabel_1_3.setBounds(265, 55, 46, 14);
		contentPane.add(lblNewLabel_1_3);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 173, 414, 97);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		grades = new DefaultTableModel();
		table.setModel(grades);
		for(String c: column) {
			grades.addColumn(c);
		}
			
		
		btnAdd = new JButton("add");

		
		btnAdd.setBounds(170, 145, 89, 23);
		contentPane.add(btnAdd);
	}
	public void createEvent(){		
		btnAdd.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String name = tfName.getText();
			String mil = tfMIL.getText();
			String ps = tfPS.getText();
			String work = tfImmersion.getText();
			String pe = tfPE.getText();
			String iiir = tfIIIR.getText();
			String java = tfJava.getText();
			
			String[] gradesData = {name,mil,ps,work,pe,iiir,java,};
			grades.addRow(gradesData);
		}
		});
	}//createEvent
}
