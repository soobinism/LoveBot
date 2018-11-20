import java.util.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.text.DefaultCaret;

public class Lovebot extends JFrame
{
	
	// Typing area
	private JTextField textEnter;
	
	// Chat area
	private JTextArea textChat;
	
	JScrollPane scroll;
	
	//Constructor
	public Lovebot() 
	{
		// Frame's Attributes:
		textEnter = new JTextField();
		textChat = new JTextArea();
		scroll = new JScrollPane(textChat);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 600);
        this.setResizable(false);
        this.setLayout(null);
        this.setTitle("LoveBot");
        

        // textEnter's attributes
        textEnter.setLocation(2, 540);
        textEnter.setSize(590, 30);
        
       
	
      //Add Items To Frame:
    
        
        // The logic of our chat bot. 
        textEnter.addActionListener(new ActionListener()
        {
        	@Override
        	public void actionPerformed (ActionEvent arg0) 
        	{
		
        			//Getting the Strings from the user.
        			String user = textEnter.getText();
        			
        			//The user's side of the text chat.
        			textChat.append("You: " + user + "\n");
        			
        			//Queries were updated 11/20/2018
        			if (user.startsWith("hey") || user.startsWith("hello") || user.startsWith("hi") || user.startsWith("hola")) {
        				botSay("Hey there! How can I help you?");
        			} else if (user.contains("crush") || user.contains("approach") || user.contains("lik") || user.contains("talk") || user.contains("feeling") || user.contains("scar") || user.contains("afraid") || user.contains("too good") || user.contains("league")) {
        				botSay("Don’t be afraid to approach them! The worst is rejection and you move on with life." + "\n" + "Anything else?");
        			} else if (user.contains("cheat") || user.contains("broke up") || user.contains("heartbroken") || user.contains("hurt") || user.contains("left") || user.contains("leav") || user.contains("abus") || user.contains("toxic") || user.contains("ignor") || user.contains("mad") || user.contains("angr") || user.contains("break")) {
        				botSay("Leave them behind! Nobody deserves to be treated like that." + "\n" + "Anything else?");
        			} else if (user.contains("better") || user.contains("improv") || user.contains("strengthen") || user.contains("bond") || user.contains("close") || user.contains("make up") || user.contains("distan") || user.contains("apart")) {
        				botSay("Communication is key." + "\n" +"Anything else?");
        			} else if (user.contains("ex")) {
        				botSay("Stop talking to them. There’s a reason why you aren’t together anymore." + "\n" + "Anything else?");
        			} else if (user.contains("first") || user.contains("dat") || user.contains("out") || user.contains("eat") || user.contains("food") || user.contains("place") || user.contains("special")) {
        				botSay("Movies, Golf, Chipotle, Mall, Park, Walmart. Your choice." + "\n" + "Anything else?");
        			} else if (user.contains("ok") || user.contains("okay") || user.contains("thank you") || user.contains("thanks") || user.contains("oh") || user.contains("thx")) {
        				botSay("No problem!" + "\n" + "Anything else?");
        			} else if (user.contains("no") || user.contains("nah") || user.contains("naw") || user.contains("nope")) {
        				botSay("Okay. Say \"end chat\" to close this chat");
        			} else if (user.contains("abuse") || user.contains("hit") || user.contains("pain") || user.contains("scared") || user.contains("kick") || user.contains("punch")) {
        				botSay("Here is the number for the Pennsylvania Coalition Against Domestic Violence: 1-800-799-SAFE(7233). Please know that you do not have to stay in an unhealthy and potentially dangerous situation" + "\n" + "Anything else?");
        			} else if (user.contains("marriage") || user.contains("children") || user.contains("commitment") || user.contains("forever") || user.contains("sacred")) {
        				botSay("Proceed with caution! Serious relationships require a lot of commitment and are serious. Make sure you are comfortable with yourself first before jumping in" + "\n" + "Anything else?");
        			} else if (user.contains("advice")) {
        				botSay("I'd be happy to help. What do you need advice for?");	
        				
        			//More recently added queries
        			} else if (user.contains("lonely")) {
        				botSay("Attend every party or event you can. Go anywhere where you can meet and interact with likeminded people. Why not try volunteering?");
        			} else if (user.contains("meet") && user.contains("people")) {
        				botSay("Attend every party or event you can. Go anywhere where you can meet and interact with likeminded people. Why not try volunteering?");
        			} else if (user.contains("need") && user.contains("girlfriend")) {
        				botSay("Meeting people is a good first step.");
        			} else if (user.contains("need") && user.contains("boyfriend")) {
        				botSay("Meeting people is a good first step.");
        			} else if (user.contains("who") && user.contains("you")) {
        				botSay("I'm the LoveBot. I give relationship advice. Nice to meet you. :)");
        			} else if (user.contains("what") && user.contains("you")) {
        				botSay("I'm a chatbot named LoveBot. I give relationship advice. Nice to meet you. :)");
        	
        			//End Chat prompt
        			} else if (user.contains("end chat") || user.contains("endchat")) {
						botSay("Goodbye!");
						System.exit(0);
        			}
        			
        			
			
        			// Failed to read prompt - default message.
        			else 
        			{
        				botSay("Sorry, didn't get that. Please try again, or type 'End chat' to exit.");
        			}
        			
        			
					//Resetting "text entering field" with a blank spot to allow for more chatting
        			textChat.setCaretPosition(textChat.getDocument().getLength());
        			textEnter.setText("");
        		}
        	

		
			
        });
	
        // TextChat's attributes
        textChat.setLocation(15, 5);
        textChat.setSize(560, 500);
        textChat.setEditable(false);
        scroll.setBounds(10, 11, 570, 500);
        
        // Add text field and scrollpane to the content pane.
        getContentPane().add(textEnter);
        
        getContentPane().add(scroll);
                          
        // Set the content pane to be visible.
 		this.setVisible(true);

	}
	
	//Bot's side of the chat
	public void botSay(String s) 
	{
		textChat.append("LoveBot: " + s + "\n");
	}


	
	
}
