package GUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Label;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.Button;
import javax.swing.JList;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.EventQueue;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
	public Exit() {
		setTitle("Exit Classes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{809, 100, 0};
		gbl_contentPane.rowHeights = new int[]{53, 40, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);		
		Label label = new Label("Quit Lessons\n\"You can only quit one class every time.\"");
		label.setFont(new Font("Cambria", Font.BOLD | Font.ITALIC, 20));
		label.setAlignment(Label.CENTER);
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.fill = GridBagConstraints.HORIZONTAL;
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 0;
		gbc_label.gridy = 0;
		contentPane.add(label, gbc_label);	
		DefaultListModel listModel=new DefaultListModel(); 
		JList list = new JList(listModel);
		GridBagConstraints gbc_list = new GridBagConstraints();
		gbc_list.insets = new Insets(0, 0, 0, 5);
		gbc_list.fill = GridBagConstraints.BOTH;
		gbc_list.gridx = 0;
		gbc_list.gridy = 1;
		contentPane.add(list, gbc_list);		
		try {
			BufferedReader brs = new BufferedReader(new FileReader("C:\\Users\\Desktop\\Java\\Java实验\\numbers.txt"));
            String Student_num = brs.readLine();
            brs.close();
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Desktop\\Java\\Java实验\\" + Student_num +".txt"));
            String demo = br.readLine();
            br.close();
            String [] demoarray = demo.split(";");
            for (int i=0; i<demoarray.length ;i++) {
        		listModel.addElement(demoarray[i]);
            }
        } catch (IOException e1) {
            e1.printStackTrace();
        }
		Button button = new Button("Quit");
		button.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 18));
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.gridx = 1;
		gbc_button.gridy = 1;
		gbc_button.anchor = GridBagConstraints.WEST;
		contentPane.add(button, gbc_button);
		button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) { 
				DefaultListModel model = (DefaultListModel) list.getModel(); 
				int selectedIndex = list.getSelectedIndex();
				if (selectedIndex != -1) {
				    model.remove(selectedIndex); 
				} 
				String[] rewrite = new String[20]; 
				for(int i = 0; i< list.getModel().getSize();i++){
		            rewrite[i] = (String) list.getModel().getElementAt(i);
		        } 		
				FileWriter writer; 
		        try {
		        	BufferedReader brs = new BufferedReader(new FileReader("C:\\Users\\Desktop\\Java\\Java实验\\numbers.txt"));
			        String Student_num = brs.readLine();
			        brs.close();
			        brs.close();
		        	File file =new File("C:\\Users\\Desktop\\Java\\Java实验\\" + Student_num +".txt");
		            if(!file.exists()) {
		                file.createNewFile();
		            }
		            FileWriter fileWriter =new FileWriter(file);
		            fileWriter.flush();
		            fileWriter.close();
		            fileWriter.write(""); 
		        } catch (IOException e1) {
		            e1.printStackTrace();
		        }
			       try {
			    	    BufferedReader brs = new BufferedReader(new FileReader("C:\\Users\\Desktop\\Java\\Java实验\\numbers.txt"));
			            String Student_num = brs.readLine();
			            brs.close();
			            brs.close();
			            writer = new FileWriter("C:\\Users\\Desktop\\Java\\Java实验\\" + Student_num +".txt",true);
			            for(int i = 0; i< rewrite.length; i++) {
			            	if(rewrite[i] != null) {
								writer.append(rewrite[i]+";");
								}
			            }
				        writer.flush();
				        writer.close();
			       } catch (IOException e1) {
			             e1.printStackTrace();
			       }
				JOptionPane.showMessageDialog(null, "Successfully quit!"); 
				System.exit(0);
	}
		});
	}

}
public class exit extends JFrame {
	private JPanel contentPane;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					exit frame = new exit();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}