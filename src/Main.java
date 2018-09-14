import org.lwjgl.opengl.Display;
import org.lwjgl.util.vector.Vector3f;
import org.lwjgl.util.vector.Vector4f;

import MainProgram.Window;
import MapStages.MeshMap;

public class Main {
	
	public static void main (String args []) {
		
		Window window = new Window (1000, 800, "TestWindow");
		
		MeshMap meshMap = new MeshMap (1000, 800, 100);
		
		while (!Display.isCloseRequested()) {
			
		}
		
	}

}
