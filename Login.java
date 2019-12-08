package GUI;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
public Login() {
	setTitle("Welcome");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(110, 110, 500, 400);
	contentPane = new JPanel();
	contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
	gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
	setContentPane(contentPane);
	GridBagLayout gbl_contentPane = new GridBagLayout();
	gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
	gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0};
	gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	contentPane.setLayout(gbl_contentPane);	
	JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Student");
	GridBagConstraints gbc_rdbtnNewRadioButton_1 = new GridBagConstraints();
	gbc_rdbtnNewRadioButton_1.insets = new Insets(0, 0, 10, 10);
	gbc_rdbtnNewRadioButton_1.gridy = 0;
	gbc_rdbtnNewRadioButton_1.gridx = 1;
	contentPane.add(rdbtnNewRadioButton_1, gbc_rdbtnNewRadioButton_1);			  
	JLabel lblNewLabel = new JLabel("Number");
	GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
	gbc_lblNewLabel.gridheight = 2;
	gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
	gbc_lblNewLabel.insets = new Insets(0, 0, 10, 10);
	gbc_lblNewLabel.gridx = 0;
	gbc_lblNewLabel.gridy = 1;
	contentPane.add(lblNewLabel, gbc_lblNewLabel);	
	Number = new JTextField();
	contentPane.add(lblNewLabel_1, gbc_lblNewLabel_1);		
	Passwords = new JPasswordField();
	GridBagConstraints gbc_Passwords = new GridBagConstraints();
	gbc_Passwords.gridx = 1;
	gbc_Passwords.gridy = 3;
	contentPane.add(Passwords, gbc_Passwords);
	GridBagConstraints gbc_Number = new GridBagConstraints();
	gbc_Number.gridwidth = 2;
	gbc_Number.gridheight = 2;
	gbc_Number.insets = new Insets(0, 0, 10, 0);
	gbc_Passwords.gridwidth = 2;
	gbc_Passwords.gridheight = 2;
	gbc_Passwords.insets = new Insets(0, 0, 10, 0);
	gbc_Passwords.fill = GridBagConstraints.BOTH;
	gbc_Passwords.gridx = 1;
	gbc_Passwords.gridy = 3;
	contentPane.add(Passwords, gbc_Passwords);	
	contentPane.add(lblNewLabel_1, gbc_lblNewLabel_1);		
	Passwords = new JPasswordField();
	GridBagConstraints gbc_Passwords = new GridBagConstraints();
	contentPane.add(Passwords, gbc_Passwords);	
	gbc_Passwords.gridwidth = 2;
	gbc_Passwords.gridheight = 2;
	gbc_Passwords.insets = new Insets(0, 0, 10, 0);
	gbc_Passwords.fill = GridBagConstraints.BOTH;	gbc_Passwords.gridwidth = 2;
	gbc_Passwords.gridheight = 2;
	gbc_Passwords.insets = new Insets(0, 0, 10, 0);
	gbc_Passwords.fill = GridBagConstraints.BOTH;
	gbc_Passwords.gridx = 1;
	gbc_Passwords.gridy = 3;
	contentPane.add(lblNewLabel_1, gbc_lblNewLabel_1);		
	Passwords = new JPasswordField();
	GridBagConstraints gbc_Passwords = new GridBagConstraints();
	gbc_Passwords.gridwidth = 2;
	gbc_Passwords.gridheight = 2;
	gbc_Passwords.insets = new Insets(0, 0, 10, 0);
	gbc_Passwords.fill = GridBagConstraints.BOTH;
	gbc_Number.fill = GridBagConstraints.BOTH;
	gbc_Number.gridx = 1;
	gbc_Number.gridy = 1;
	contentPane.add(Number, gbc_Number);
	Number.setColumns(10);		
	JLabel lblNewLabel_1 = new JLabel("password");
	GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
	gbc_lblNewLabel_1.gridheight = 2;
	gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
	gbc_lblNewLabel_1.insets = new Insets(0, 0, 10, 10);
	gbc_lblNewLabel_1.gridy = 3;
	gbc_lblNewLabel_1.gridx = 0;
	Passwords.setColumns(10);		
	JButton btnNewButton = new JButton("Create");
	btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String s= Number.getText(); 
				if(Number.getText().trim().length()==0||new String(Passwords.getPassword()).trim().length()==0){
						JOptionPane.showMessageDialog(null, "Accounts&Passwords can't be empty");
						return;
						}
			 if(rdbtnNewRadioButton_1.isSelected()){String s0 = s + "]" + new String(Passwords.getPassword()) + ";"; //add together
		System.out.println(s0);   
		       try {

		            writer = new FileWriter("C:\\Users\\Desktop\\Java\\Java实验\\accounts.txt",true);
		            writer.append(s0); 
		            writer.flush();
		            writer.close();
		        } catch (IOException e1) {
		            e1.printStackTrace();
		        }
				JOptionPane.showMessageDialog(null, "Success Create Account!");
			    System.exit(0);
			}
				 }
		});
	JButton btnNewButton_1 = new JButton("Login");
	btnNewButton_1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
						try {
							    FileWriter numbers;
							    String s= Number.getText();
					          numbers = new FileWriter("C:\\Users\\Desktop\\Java\\Java实验\\numbers.txt");
					           numbers.write(s); 
					           numbers.flush();
					           numbers.close();
					            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Desktop\\Java\\Java实验\\accounts.txt"));
					            String demo = br.readLine();
					            br.close();
					            String [] demoarray = demo.split(";"); 
					            if(Number.getText().trim().length()==0||new String(Passwords.getPassword()).trim().length()==0){
									JOptionPane.showMessageDialog(null, "Number&Password can't be empty");
									return;
								}
					           if(!(Number.getText().trim().length()==0)&&!(new String(Passwords.getPassword()).trim().length()==0)){
				        		}
				        	if(rdbtnNewRadioButton_1.isSelected()){
					           for (int i=0; i<demoarray.length ;i++) {
					            	String [] verify = demoarray[i].split("]");					        		
					        		 for (int j=0; j<verify.length ;j=j+2) {
					        			if(Number.getText().trim().equals(verify[j])&&
					        					new String(Passwords.getPassword()).trim().equals(verify[j+1])){					 				        	
										JOptionPane.showMessageDialog(null, "Login Successfully");
										setVisible(false);
							            Index index = new index();
							            index.setVisible(true);	
							            break jzp;
					        			}
					        			if(j == verify.length-2) {
							        		 JOptionPane.showMessageDialog(null, "Name or Password Error");
							        		 return;
					        			}
					        			else {
					        				JOptionPane.showMessageDialog(null, "Name or Password Error");
							        		 return;
					        			}
					            }
							}					        
					    }
							}
						catch (IOException e1) {
							      e1.printStackTrace();
					        }
}
		});
	GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
	gbc_btnNewButton_1.gridwidth = 3;
	gbc_btnNewButton_1.insets = new Insets(0, 0, 10, 0);
	gbc_btnNewButton_1.gridx = 0;
	gbc_btnNewButton_1.gridy = 7;
	contentPane.add(btnNewButton_1, gbc_btnNewButton_1);
	GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
	gbc_btnNewButton.gridwidth = 3;
	gbc_btnNewButton.gridx = 0;
	gbc_btnNewButton.gridy = 8;
	contentPane.add(btnNewButton, gbc_btnNewButton);
	}

}
public class login extends JFrame {

	private JPanel contentPane;
	private JTextField Number;
	private JPasswordField Passwords;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}