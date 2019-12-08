package GUI;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JList;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;

	public Chose() {
		setTitle("CHOOSE Classes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200,900, 500);
		setContentPane(contentPane);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWeights = new double[]{1.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.columnWidths = new int[]{190, 140, 0};
		gbl_contentPane.rowHeights = new int[]{60, 90, 0};
		contentPane.setLayout(gbl_contentPane);		
		Label label = new Label("Select Lesson\n\"You can only choose one class every time.\"");
		label.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 20));
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.gridy = 0;
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 0;
		contentPane.add(label, gbc_label);		
		DefaultListModel listModel=new DefaultListModel(); 
		JList list = new JList(listModel); 
		GridBagConstraints gbc_list = new GridBagConstraints();
		gbc_list.insets = new Insets(0, 0, 0, 9);
		gbc_list.fill = GridBagConstraints.BOTH;
		gbc_list.gridx = 0; 
		gbc_list.gridy = 1;
		contentPane.add(list, gbc_list);
		try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Kukdo\\Desktop\\Java\\Java实验\\实验5\\classes_teachers.txt"));
            String demo = br.readLine();
            br.close();
            String [] demoarray = demo.split(";"); 
            for (int i=0; i<demoarray.length ;i++) {
        		listModel.addElement(demoarray[i]); 
            }
        } catch (IOException e1) {
            e1.printStackTrace();
        }
		JButton btnNewButton = new JButton("Select");
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.gridx = 1;
		gbc_btnNewButton.gridy = 1;
		gbc_btnNewButton.gridwidth = 2;
		contentPane.add(btnNewButton, gbc_btnNewButton);
		btnNewButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				String chosen = (String)list.getSelectedValue()+";"; 
				 FileWriter writer; 
			        try {
			        	BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Desktop\\Java\\Java实验\\numbers.txt"));
			            String Student_num = br.readLine();
			            br.close();
			            writer = new FileWriter("C:\\Users\\Desktop\\Java\\Java实验\\" + Student_num +".txt",true);		            
			            writer.append(chosen); 
			            writer.close();
			        } catch (IOException e1) {
			            e1.printStackTrace();
			        }
					JOptionPane.showMessageDialog(null, "Successfully choose!"); 
				    System.exit(0);
	}
		});
}
	}
public class CHOOSE extends JFrame {	
	private JPanel contentPane;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CHOOSE frame = new CHOOSE();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
