package cn.ccsu.frame;
import java.awt.*;
import java.awt.event.*;

public class myFrame3 extends Frame implements ActionListener {
	Button bnSure ;
	Button bnReset;
	TextField user;
	TextField pass;
	public myFrame3(){
		super("�û������֤");
		Label username = new Label("�û���");
		Label password = new Label("����");
		 user = new TextField(10);
		 pass = new TextField(10);
		 pass.setEchoChar('*');//�������÷��� ʹ���벻�ɼ�
		 bnSure = new Button("ȷ��");
		 bnReset = new Button("����");
		setVisible(true);
		setBounds(100,100,200,200);
		setLayout(new FlowLayout());
		add(username);add(user);add(password);add(pass);add(bnSure);add(bnReset);
		bnSure.addActionListener(this);
		bnReset.addActionListener(this);

}
	public void actionPerformed (ActionEvent e){
		String users = new String("1234");
		String passw = new String("1234");
		
		String suser = user.getText();
		String pas = pass.getText();
		
		if(e.getActionCommand().equals("ȷ��"))
		{
			  if(passw.equals(pas)&&users.equals(suser))
			  {
				  user.setText("Welcome");
		          pass.setText("");
		          }
			  else
			  { 
				  user.setText("�û������������");
				  pass.setText("");
		      }
			  }
		else{
			 user.setText("");
			 pass.setText("");
		}
	}
	public static void main(String args[]){
		 myFrame3 a = new myFrame3();
		 a.addWindowListener(new WindowAdapter(){
			 public void windowClosing(WindowEvent e){
			     e.getWindow().dispose();
			 }
		 });
	}
}