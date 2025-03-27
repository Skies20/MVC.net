package gatasKape;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JSplitPane;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class gatasKapeV2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfName;
	private final ButtonGroup tip = new ButtonGroup();
	private JComboBox cbProduct;
	private JComboBox cbSize;
	private JComboBox cbPayment;
	private JCheckBox chckbxPearl;
	private JCheckBox chckbxCheese;
	private JCheckBox chckbxWit;
	private JRadioButton rdbtnTipTen;
	private JRadioButton rdbtnTipTwenty;
	private JRadioButton rdbtnTipThirty;
	String[] payment = {"Cash","Gcash","Credit Card","Debit Card",};
	String[] product = {"Milktea","Ice coffee","Hot coffee","Fruittea",};
	String[] size = {"8 oz","10 oz","12 oz","16 oz"};
	String[] column = {"Customer","Payment","Product","Size","Add-on","Tip"};
	String[] order01 = {"Mam Lou","Cash","MilkTea","12 oz","None","30 Pesos"};
	DefaultTableModel sales;
	private JTable table;
	private JButton btnOrder;
	private JScrollPane scrollPane;
	protected AbstractButton pearl;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gatasKapeV2 frame = new gatasKapeV2();
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
	public gatasKapeV2() {
		initComponent();
		createEvent();
	}
	public void initComponent() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 359);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tfName = new JTextField();
		tfName.setBounds(41, 30, 160, 20);
		contentPane.add(tfName);
		tfName.setColumns(10);
		
		cbPayment = new JComboBox();
		cbPayment.setModel(new DefaultComboBoxModel(payment));
		cbPayment.setBounds(240, 29, 160, 22);
		contentPane.add(cbPayment);
		
		cbProduct = new JComboBox();
		cbProduct.setModel(new DefaultComboBoxModel(product));
		cbProduct.setBounds(41, 73, 160, 22);
		contentPane.add(cbProduct);
		
		cbSize = new JComboBox();
		cbSize.setModel(new DefaultComboBoxModel(size));
		cbSize.setBounds(41, 119, 160, 22);
		contentPane.add(cbSize);
		
		chckbxPearl = new JCheckBox("New check box");
		chckbxPearl.setBounds(240, 58, 97, 23);
		contentPane.add(chckbxPearl);
		
		chckbxCheese = new JCheckBox("New check box");
		chckbxCheese.setBounds(240, 84, 97, 23);
		contentPane.add(chckbxCheese);
		
		chckbxWit = new JCheckBox("New check box");
		chckbxWit.setBounds(240, 119, 97, 23);
		contentPane.add(chckbxWit);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(41, 152, 46, 14);
		contentPane.add(lblNewLabel);
		
		rdbtnTipTen = new JRadioButton("10");
		rdbtnTipTen.setActionCommand("10");
		tip.add(rdbtnTipTen);
		rdbtnTipTen.setBounds(146, 148, 55, 23);
		contentPane.add(rdbtnTipTen);
		
		rdbtnTipTwenty = new JRadioButton("20");
		rdbtnTipTwenty.setActionCommand("20");
		tip.add(rdbtnTipTwenty);
		rdbtnTipTwenty.setBounds(200, 148, 55, 23);
		contentPane.add(rdbtnTipTwenty);
		
		rdbtnTipThirty = new JRadioButton("30");
		rdbtnTipThirty.setActionCommand("30");
		tip.add(rdbtnTipThirty);
		rdbtnTipThirty.setBounds(262, 148, 55, 23);
		contentPane.add(rdbtnTipThirty);
		
		btnOrder = new JButton("Order");
		btnOrder.setBounds(335, 148, 89, 23);
		contentPane.add(btnOrder);
		
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 198, 414, 111);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);


		sales = new DefaultTableModel();
		table.setModel(sales);
			for(String c:column) {
				sales.addColumn(c);
			}
	}
	
	public void createEvent() {
		btnOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String c = tfName.getText();
				String p = String.valueOf(cbPayment.getSelectedItem());
				String pd = String.valueOf(cbProduct.getSelectedItem());
				String s = String.valueOf(cbSize.getSelectedItem());
				String t = String.valueOf(tip.getSelection().getActionCommand());
//				String a, pearl,cream,wit;
//				if(pearl.isSelected());
				String[] order = {c,p,pd,"niga",s,t};
				sales.addRow(order);
						
			}
		});
	}
}
