import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;
import javax.swing.JOptionPane;

import javax.naming.InitialContext;

/**
 * This class ilustrates a very simple chat application. Users will connect to
 * "topic0" and exchange messages. Please note that this program does not
 * perform any error checking.
 */

public class Chat {
	String _block = "";

	JFrame frame = new JFrame("Chat");
	JButton send = new JButton("Send");
	JMenuBar menu = new JMenuBar();	
	JTextArea incoming = new JTextArea();
	JTextArea outgoing = new JTextArea();
	JScrollPane scroll = new JScrollPane (incoming, 
			   JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
	public Chat() throws Exception
    {
       // create publisher and subscriber
                                                                        
       // create the gui
       incoming.setEditable(false);

                                                                          
       // add menu items
                                                                     
                                                                            
       // send message when user clicks the button
       send.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
             
             
                
          }
       });
                                                                          
       // setup rest of gui
       JPanel panel = new JPanel(new BorderLayout());
       panel.add(outgoing);
       panel.add(send, BorderLayout.EAST);
       JSplitPane split = new JSplitPane(JSplitPane.VERTICAL_SPLIT,
    		   scroll, panel);
       split.setDividerLocation(205);
                                                                          
       frame.getContentPane().setLayout(new BorderLayout());
       frame.getContentPane().add(split);
       frame.getContentPane().add(menu, BorderLayout.NORTH);
       frame.setSize(new Dimension(400,300));
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setVisible(true);
    }
	
}