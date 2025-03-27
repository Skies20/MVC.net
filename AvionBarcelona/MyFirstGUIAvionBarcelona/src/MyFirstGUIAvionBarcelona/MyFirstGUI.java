package MyFirstGUIAvionBarcelona;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class MyFirstGUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField input;
	private JButton clickAvion;
	private JButton clickBarcelona;
	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyFirstGUI frame = new MyFirstGUI();
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
	public MyFirstGUI() {
		initComponent();
		createEvent();
	}

	public void initComponent() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//		   x,   y, width, height
		setBounds(100, 100, 1700, 850);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel ourNames = new JLabel("Avion and Barcelona");
		ourNames.setHorizontalAlignment(SwingConstants.CENTER);
		ourNames.setFont(new Font("Times New Roman", Font.BOLD, 36 ));
				ourNames.setBounds(500, 10, 615, 70);
				contentPane.add(ourNames);				
		JLabel avion = new JLabel("Avion Rogelio R.");
		avion.setHorizontalAlignment(SwingConstants.CENTER);
		avion.setFont(new Font("Arial", Font.ITALIC, 36 ));
				avion.setBounds(500, 60, 615, 70);
				contentPane.add(avion);
		JLabel barcelona = new JLabel("Barcelona Ireneo");
		barcelona.setHorizontalAlignment(SwingConstants.CENTER);
		barcelona.setFont(new Font("Couriel", Font.PLAIN, 36 ));
				barcelona.setBounds(500,110, 615, 70);
				contentPane.add(barcelona);
				
//		input = new JTextField;
//		input.setBounds (500, 110, 615, 70);
		
	}
	
	public void createEvent() {
//		clickAvion.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				input.setText("Avion Rogelio R.");
//			}
//		});
//		
//		clickBarcelona.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				input.setText("Barcelona Ireneo");
//			}
//		});
	}
}

