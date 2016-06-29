import java.io.FileNotFoundException;
import java.io.IOException;

import org.alicebot.gui.SimpleConsole;
import org.alicebot.server.core.Bot;

public class MainAiml {

	public static void main(String[] args) throws IOException {
		try {
			AimlTample temp = new AimlTample();
			
			temp.addaiml("siema", "dupa");
		} catch (FileNotFoundException e) {
		System.err.println("nie ma poliku");
			e.printStackTrace();
		}
		//Bot bot = new Bot("Alice");
		SimpleConsole m= new SimpleConsole();
	
	
	}

}
