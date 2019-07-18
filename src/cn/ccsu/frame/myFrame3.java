package cn.ccsu.frame;
import java.awt.*;
import java.awt.event.*;

public class myFrame3 extends Frame implements ActionListener {
	Button bnSure ;
	Button bnReset;
	TextField user;
	TextField pass;
	public myFrame3(){
		super("用户身份验证");
		Label username = new Label("用户名");
		Label password = new Label("密码");
		 user = new TextField(10);
		 pass = new TextField(10);
		 pass.setEchoChar('*');//这里设置符号 使密码不可见
		 bnSure = new Button("确定");
		 bnReset = new Button("重置");
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
		
		if(e.getActionCommand().equals("确定"))
		{
			  if(passw.equals(pas)&&users.equals(suser))
			  {
				  user.setText("Welcome");
		          pass.setText("");
		          }
			  else
			  { 
				  user.setText("用户名或密码错误");
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