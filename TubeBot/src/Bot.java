import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Bot extends JFrame{
	private JTextArea Chatarea = new JTextArea();
	private JTextField chatbox=new JTextField();
	public Bot() {
		JFrame frame=new JFrame();
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setLayout(null);
		frame.setSize(600 , 600);
        frame.setTitle("ChatBot");
        frame.add(Chatarea);
        frame.add(chatbox);
        //for text area
        Chatarea.setSize(500 , 400);
        Chatarea.setLocation(2, 2);
        //for text field
        chatbox.setSize(500 , 30);
        chatbox.setLocation(2, 500);
        
        chatbox.addActionListener(new ActionListener(){
        	
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String gtext = chatbox.getText().toLowerCase();
				Chatarea.append("YOU ->" +gtext + "\n");
				chatbox.setText("");
				
				if(gtext.contains("hi")) {
					bot("hello....how can i help U");
					
				}else {
					int rand = (int) (Math.random()* 3 +1);
					if(rand ==1 ) {
					bot("I dont understand you");
				}
				else if(rand==2) {
					bot("I dont understand you bro");
				}
				else if(rand==1) {
					bot("please come again");
			}
				}	
			}
        });
	}
	private void bot(String string){
		Chatarea.append("BOT ->" +string + "\n");
    
    }
        
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Bot();

	}

}
