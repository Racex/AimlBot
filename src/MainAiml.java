import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;

import org.alicebot.gui.SimpleConsole;
import org.alicebot.server.core.Bot;

public class MainAiml {

	public static void main(String[] args) throws IOException {
		try {
			AimlTample temp = new AimlTample();
			
		//	temp.addaiml("siema", "dupa");
		} catch (FileNotFoundException e) {
		System.err.println("nie ma poliku");
			e.printStackTrace();
		}
		 String[] command =
			    {
			        "cmd",
			    };
			    Process p = Runtime.getRuntime().exec(command);
			    PrintWriter stdin = new PrintWriter(p.getOutputStream());
			    InputStream is = p.getInputStream();
			    BufferedReader br = new BufferedReader(new InputStreamReader(is));
			    stdin.println("cd c:\\ab");//\ /A /Q
			    stdin.println(" java -cp lib/Ab.jar Main bot=test action=chat trace=false");
			    //java -cp lib/Ab.jar Main bot=test action=chat trace=false
			    stdin.flush();
			    try{
					Chat chat=new Chat(stdin);
					new Thread(()->{
						while(true)
						try {
							Thread.sleep(100);
							
							chat.incoming.setText(chat.incoming.getText()+"\n"+br.readLine());
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}).start();
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
		
			  
				
		
	//	Bot bot = new Bot("Alice");
	//	SimpleConsole m= new SimpleConsole();
	
	
	}

}
