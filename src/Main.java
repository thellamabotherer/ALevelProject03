import org.lwjgl.opengl.Display;

import MainProgram.Window;

public class Main {
	
	public static void main (String args []) {
		
		Window window = new Window (1000, 800, "TestWindow");
		while (!Display.isCloseRequested()) {
			System.out.println("It's alive");
		}
		
	}

}
