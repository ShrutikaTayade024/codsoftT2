import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.border.LineBorder;

public class Student_Grade_calculator extends JFrame {

	private JPanel contentPane;
	private JTextField txtname;
	private JTextField txteng;
	private JTextField txtmar;
	private JTextField txthin;
	private JTextField txtsci;
	private JTextField txtmath;
	private JTextField txtttl;
	private JTextField txtper;
	private JTextField txtgrd;
	private JTextField txtpf;

	/**
	 * Launch the application.
	 */

	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Student_Grade_calculator frame = new Student_Grade_calculator();
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
	public Student_Grade_calculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1093, 820);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 240, 245));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(216, 191, 216));
		panel.setBounds(94, 13, 830, 74);
		contentPane.add(panel);
		
		JLabel Label1 = new JLabel("Student Grade Calculator");
		Label1.setFont(new Font("Times New Roman", Font.BOLD, 37));
		panel.add(Label1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 240, 245));
		panel_1.setBounds(30, 117, 795, 66);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNameOfStudent = new JLabel("Name of Student ");
		lblNameOfStudent.setFont(new Font("Times New Roman", Font.BOLD, 21));
		lblNameOfStudent.setBounds(12, 15, 181, 40);
		lblNameOfStudent.setVerticalAlignment(SwingConstants.TOP);
		panel_1.add(lblNameOfStudent);
		
		txtname = new JTextField();
		txtname.setHorizontalAlignment(SwingConstants.LEFT);
		txtname.setToolTipText("Write Name here");
		txtname.setFont(new Font("Tahoma", Font.PLAIN, 19));
		txtname.setBounds(223, 15, 536, 38);
		panel_1.add(txtname);
		txtname.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 240, 245));
		panel_2.setBounds(30, 203, 460, 505);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblEnglish = new JLabel("English");
		lblEnglish.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblEnglish.setBounds(31, 97, 118, 51);
		panel_2.add(lblEnglish);
		
		JLabel lblMarathi = new JLabel("Marathi");
		lblMarathi.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblMarathi.setBounds(31, 166, 118, 51);
		panel_2.add(lblMarathi);
		
		JLabel lblScience = new JLabel("Science");
		lblScience.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblScience.setBounds(31, 294, 118, 51);
		panel_2.add(lblScience);
		
		JLabel lblMathematics = new JLabel("Mathematics");
		lblMathematics.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblMathematics.setBounds(31, 359, 149, 51);
		panel_2.add(lblMathematics);
		
		JLabel lblHindi = new JLabel("Hindi");
		lblHindi.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblHindi.setBounds(31, 230, 118, 51);
		panel_2.add(lblHindi);
		
		JLabel lblNewLabel_1 = new JLabel("Marks");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 21));
		lblNewLabel_1.setBounds(295, 23, 118, 31);
		panel_2.add(lblNewLabel_1);
		
		txteng = new JTextField();
		txteng.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		txteng.setBounds(266, 114, 116, 22);
		panel_2.add(txteng);
		txteng.setColumns(10);
		
		txtmar = new JTextField();
		txtmar.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		txtmar.setColumns(10);
		txtmar.setBounds(266, 183, 116, 22);
		panel_2.add(txtmar);
		
		txthin = new JTextField();
		txthin.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		txthin.setColumns(10);
		txthin.setBounds(266, 245, 116, 22);
		panel_2.add(txthin);
		
		txtsci = new JTextField();
		txtsci.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		txtsci.setColumns(10);
		txtsci.setBounds(266, 311, 116, 22);
		panel_2.add(txtsci);
		
		txtmath = new JTextField();
		txtmath.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		txtmath.setColumns(10);
		txtmath.setBounds(266, 376, 116, 22);
		panel_2.add(txtmath);
		 
		JButton btnNewButton = new JButton("Show Result");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(255, 105, 180));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 21));
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					
				double english,marathi,hindi,science,maths,tot,per,avg;
				String grade = "Failed";
				
				english= Integer.parseInt( txteng.getText());
				
				marathi= Integer.parseInt( txtmar.getText());
				hindi= Integer.parseInt( txthin.getText());
				science= Integer.parseInt( txtsci.getText());
				maths= Integer.parseInt( txtmath.getText());
				
				tot=english+ marathi+ hindi + science + maths;
				
				per=tot/500*100;
				
				avg=tot/5;
				
				if(avg>=85) {
					grade="A";
				}
				
				else if(avg>=65) {
					grade="B";
				}
				else if(avg>=45) {
					grade="C";
				}
				
				else if(avg>=35) {
					grade="D";
				}
				
				txtttl.setText(String.valueOf(tot));
				txtper.setText(String.valueOf(per));
				txtgrd.setText(String.valueOf(grade));

				String val;
				
				if(per>=35) {
					val="YOU ARE PASSED";
				}else
				{
					val="YOU ARE FAILED";
				}
				txtpf.setText(val);
				
				 // Nullify subject text fields
		        txteng.setText(null);
		        txtmar.setText(null);
		        txthin.setText(null);
		        txtsci.setText(null);
		        txtmath.setText(null);
			}
			 ;
				
			
		});
		btnNewButton.setBounds(122, 442, 202, 50);
		panel_2.add(btnNewButton);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_4.setBackground(new Color(255, 240, 245));
		panel_4.setBounds(12, 13, 422, 71);
		panel_2.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Subject");
		lblNewLabel.setBounds(27, 13, 70, 27);
		panel_4.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 22));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(135, 206, 235));
		panel_3.setBounds(557, 203, 479, 505);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblTotalMarks = new JLabel("Total Marks");
		lblTotalMarks.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblTotalMarks.setBounds(38, 91, 143, 51);
		panel_3.add(lblTotalMarks);
		
		JLabel lblPercentage = new JLabel("Percentage");
		lblPercentage.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblPercentage.setBounds(38, 176, 118, 51);
		panel_3.add(lblPercentage);
		
		JLabel lblGrade = new JLabel("Grade");
		lblGrade.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblGrade.setBounds(38, 256, 118, 51);
		panel_3.add(lblGrade);
		
		txtttl = new JTextField();
		txtttl.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		txtttl.setColumns(10);
		txtttl.setBounds(265, 99, 158, 38);
		panel_3.add(txtttl);
		
		txtper = new JTextField();
		txtper.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		txtper.setColumns(10);
		txtper.setBounds(265, 184, 158, 38);
		panel_3.add(txtper);
		
		txtgrd = new JTextField();
		txtgrd.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		txtgrd.setColumns(10);
		txtgrd.setBounds(265, 269, 158, 38);
		panel_3.add(txtgrd);
		
		txtpf = new JTextField();
		txtpf.setForeground(new Color(0, 0, 0));
		txtpf.setFont(new Font("Times New Roman", Font.BOLD, 24));
		txtpf.setBounds(51, 438, 385, 54);
		panel_3.add(txtpf);
		txtpf.setColumns(10);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_5.setBounds(105, 13, 254, 38);
		panel_3.add(panel_5);
		panel_5.setLayout(null);
		
		JLabel lblResult = new JLabel("Result");
		lblResult.setBounds(94, 5, 65, 28);
		panel_5.add(lblResult);
		lblResult.setBackground(Color.PINK);
		lblResult.setFont(new Font("Times New Roman", Font.BOLD, 24));
	}
}
