package GUI;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JList;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
	public print() {
		setTitle("Print Classes");
		setBounds(200, 200, 700, 400);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setLayout(new FlowLayout());
		contentPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		{   	try {
			BufferedReader brs = new BufferedReader(new FileReader("C:\\Users\\Desktop\\Java\\Java实验\\numbers.txt"));
            String Student_num = brs.readLine();
            brs.close();
	        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Desktop\\Java\\Java实验\\" + Student_num +".txt"));
	        String demo = br.readLine();
       	    br.close();
	        JLabel lblNewLabel = new JLabel("You have chosen classes below:");
			lblNewLabel.setFont(new Font("微软雅黑", Font.BOLD | Font.ITALIC, 14));
			contentPanel.add(lblNewLabel);
	        {   
	        	DefaultListModel listModel=new DefaultListModel(); 
	        	JList list = new JList(listModel);
	        	contentPanel.add(list);
	             String [] demoarray = demo.split(";");
	             for (int i=0; i<demoarray.length ;i++) {
	         		listModel.addElement(demoarray[i]);
	             }
	        }
	    } catch (IOException e1) {
	        e1.printStackTrace();
	    }
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
				okButton.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e) {
						System.exit(0);
					}
			});
		}
	}
	}
}
public class print extends JDialog {
	private final JPanel contentPanel = new JPanel();
	public static void main(String[] args) {
		try {
			print dialog = new print();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}