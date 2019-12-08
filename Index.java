package GUI;
import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
public index() {
	setTitle("index");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(150, 150, 500, 350);
	contentPane = new JPanel();
	contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
	setContentPane(contentPane);
	contentPane.setLayout(null);
	JButton btnNewButton = new JButton("exit");
	btnNewButton.setBounds(0, 110, 100, 30);
	contentPane.add(btnNewButton);
	btnNewButton.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {
			Exit exit = new Exit();
			exit.setVisible(true);
			}
		});
	JButton btnNewButton_1 = new JButton("Chose");
	btnNewButton_1.setBounds(350, 110, 100, 30);
	contentPane.add(btnNewButton_1);
	btnNewButton_1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {
			chose chose = new chose();
			chose.setVisible(true); 
			}
		});
	JButton btnNewButton_3 = new JButton("Print");
	contentPane.add(btnNewButton_3);
	btnNewButton_3.setBounds(180, 110, 100, 30);
	btnNewButton_3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {
			Print print = new Print();
			print.setVisible(true);
			}
		});
	}

}
public class index extends JFrame {
	private JPanel contentPane;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					index frame = new index();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
