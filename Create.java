package GUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Button;
import java.awt.Label;
import java.awt.Font;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.TextField;
public class create extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					create frame = new create();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public Create() {
		setTitle("创建课程");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 550, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWeights = new double[]{1.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.columnWidths = new int[]{100, 150, 170, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);		
		Label label = new Label("Class Number: ");
		label.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 12));
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.insets = new Insets(0, 0, 10, 10);
		gbc_label.gridy = 1;
		gbc_label.gridx = 0;
		contentPane.add(label, gbc_label);
		TextField textField = new TextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.fill = GridBagConstraints.BOTH;
		gbc_textField.insets = new Insets(0, 0, 10, 10);
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 1;
		contentPane.add(textField, gbc_textField);
		Label label_1 = new Label("课程名字 ");
		label_1.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 12));
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.insets = new Insets(0, 0, 10, 10);
		gbc_label_1.gridy = 2;
		gbc_label_1.gridx = 0;
		contentPane.add(label_1, gbc_label_1);		
		TextField textField_1 = new TextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.fill = GridBagConstraints.BOTH;
		gbc_textField_1.insets = new Insets(0, 0, 10, 10);
		gbc_textField_1.gridx = 1;
		gbc_textField_1.gridy = 2;
		contentPane.add(textField_1, gbc_textField_1);		
		Label label_2 = new Label("课程地点 ");
		label_2.setFont(new Font("Cambria", Font.BOLD | Font.ITALIC, 12));
		GridBagConstraints gbc_label_2 = new GridBagConstraints();
		gbc_label_2.insets = new Insets(0, 0, 10, 1-);
		gbc_label_2.gridx = 0;
		gbc_label_2.gridy = 3;
		contentPane.add(label_1, gbc_label_1);		
		TextField textField_1= new TextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.fill = GridBagConstraints.BOTH;
		gbc_textField_1.insets = new Insets(0, 0, 10, 10);、
		gbc_textField_1.gridy = 3;
		gbc_textField_1.gridx = 1;
		contentPane.add(textField_2, gbc_textField_2);		
		Label label_3 = new Label("课程时间 ");
		label_3.setFont(new Font("Cambria", Font.BOLD | Font.ITALIC, 12));
		GridBagConstraints gbc_label_3 = new GridBagConstraints();
		gbc_label_3.insets = new Insets(0, 0, 5, 5);
		gbc_label_3.gridx = 0;
		gbc_label_3.gridy = 4;
		contentPane.add(label_3, gbc_label_3);	
		TextField textField_3 = new TextField();
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.fill = GridBagConstraints.BOTH;
		gbc_textField_3.insets = new Insets(0, 0, 5, 5);
		gbc_textField_3.gridx = 1;
		gbc_textField_3.gridy = 4;
		contentPane.add(textField_3, gbc_textField_3);		
		Label label_4 = new Label("课程信誉: ");
		label_4.setFont(new Font("Cambria", Font.BOLD | Font.ITALIC, 12));
		GridBagConstraints gbc_label_4 = new GridBagConstraints();
		gbc_label_4.insets = new Insets(0, 0, 10, 10);
		gbc_label_4.gridx = 0;
		gbc_label_4.gridy = 5;
		contentPane.add(label_4, gbc_label_4);	
		TextField textField_4 = new TextField();
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.fill = GridBagConstraints.BOTH;
		gbc_textField_4.insets = new Insets(0, 0, 10, 10);
		gbc_textField_4.gridx = 1;
		gbc_textField_4.gridy = 5;
		contentPane.add(textField_4, gbc_textField_4);		
		Label label_5 = new Label("课程老师: ");
		label_5.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 12));
		GridBagConstraints gbc_label_5 = new GridBagConstraints();
		gbc_label_5.insets = new Insets(0, 0, 10, 10);
		gbc_label_5.gridx = 0;
		gbc_label_5.gridy = 6;
		contentPane.add(label_5, gbc_label_5);		
		TextField textField_5 = new TextField();
		GridBagConstraints gbc_textField_5 = new GridBagConstraints();
		gbc_textField_5.fill = GridBagConstraints.BOTH;
		gbc_textField_5.insets = new Insets(0, 0,10, 10);
		gbc_textField_5.gridy = 6;
		gbc_textField_5.gridx = 1;
		contentPane.add(textField_5, gbc_textField_5);
		Button button = new Button("创建课程"); 
		button.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 18)); 
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.fill = GridBagConstraints.BOTH; 
		gbc_button.gridx = 2;
		gbc_button.gridy = 7; 
		contentPane.add(button, gbc_button);
		button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				String s= textField.getText();
				String s1= textField_1.getText();
				String s2= textField_2.getText();
				String s4= textField_4.getText();
				String s5= textField_5.getText(); 
				String s3= textField_3.getText();
				String s6 = "Number: "+ s + " Name: "+ s1 +" Place: "+ s2 +" Time: " + s3 +" Credit: "+ s4 + " Teacher: "+ s5+ ";"; 
				if(textField.getText().trim().length()==0||textField_1.getText().trim().length()==0||textField_2.getText().trim().length()==0||
						textField_3.getText().trim().length()==0||textField_4.getText().trim().length()==0||textField_5.getText().trim().length()==0) {
					JOptionPane.showMessageDialog(null, "内容不能为空");
				}
				else {
			    FileWriter writer;
		        try {
		            writer = new FileWriter("C:\\Users\\Desktop\\Java\\Java实验\\classes_teachers.txt",true);
		            writer.append(s6); 
		            writer.flush();
		            writer.close();
		        } catch (IOException e1) {
		            e1.printStackTrace();
		        }
				JOptionPane.showMessageDialog(null, "Success Create!");
			    System.exit(0);
			}
			}
		});
	}
}
