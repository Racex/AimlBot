import java.io.FileNotFoundException;
import java.io.IOException;
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
			    new Thread(new SyncPipe(p.getErrorStream(), System.err)).start();
			    new Thread(new SyncPipe(p.getInputStream(), System.out)).start();
			    PrintWriter stdin = new PrintWriter(p.getOutputStream());
			    stdin.println("cd c:\\ab");//\ /A /Q
			    stdin.println(" java -cp lib/Ab.jar Main bot=test action=chat trace=false");
			    //java -cp lib/Ab.jar Main bot=test action=chat trace=false
			    
			    // write any other commands you want here
			    stdin.close();
			    int returnCode = 0;
				try {
					returnCode = p.waitFor();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			    System.out.println("Return code = " + returnCode);
		
	//	Bot bot = new Bot("Alice");
	//	SimpleConsole m= new SimpleConsole();
	
	
	}

}
