#实验目的
<br>分析学生选课系统
使用GUI窗体及其组件设计窗体界面
完成学生选课过程业务逻辑编程
基于文件保存并读取数据
处理异常<br>
#实验要求
<br>
1、设计GUI窗体，支持学生注册、课程新加、学生选课、学生退课、打印学生选课列表等操作。
2、基于事件模型对业务逻辑编程，实现在界面上支持上述操作。
3、针对操作过程中可能会出现的各种异常，做异常处理
4、基于输入/输出编程，支持学生、课程、教师等数据的读写操作。
5、基于Github.com提交实验，包括实验SRC源文件夹程序、README.MD实验报告文档。
6、本次实验是综合性实验，在40%的实验成绩中占比最大，望同学们认真对待。
<br>
#流程图
![image](https://github.com/300tty/java-/blob/master/%E6%8D%95%E8%8E%B73.PNG)
#实验过程：
<br> 设计gui窗口后进行逻辑设计，并且做出异常处理，并写出读取程序，最后调试代码将他们结合在一起并且能成功运行。<br>
#核心代码：
<br>
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
			            writer = new FileWriter("C:\\Users\\Kukdo\\Desktop\\Java\\Java实验\\" + Student_num +".txt",true);
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
<br>
#实验截图
![image](https://github.com/300tty/java-/blob/master/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20191208225654.jpg)\
#实验心得
<br>这次实验是完善前几次实验，将他们结合起来，并且做出处理让他能使用更加灵活，几百行的代码很多很容易出错，很花时间而且也很难，但是需要自己去研究去解决。<br>
