import java.util.ArrayList;

import org.lwjgl.opengl.Display;
import org.lwjgl.util.vector.Vector3f;
import org.lwjgl.util.vector.Vector4f;

import DataTypes.Polygon;
import DataTypes.Vertex;
import MainProgram.Window;
import MapStages.MeshMap;

public class Main {
	
	public static void main (String args []) {
		
		Window window = new Window (1000, 800, "TestWindow");
		
		Vertex vertex01 = new Vertex (new Vector3f (200, 200, 0));
		Vertex vertex02 = new Vertex (new Vector3f (200, 400, 0));
		Vertex vertex03 = new Vertex (new Vector3f (400, 200, 0));
		Vertex vertex04 = new Vertex (new Vector3f (400, 400, 0));
		
		ArrayList<Vertex> vertlist = new ArrayList();
		vertlist.add(vertex01);
		vertlist.add(vertex02);
		vertlist.add(vertex04);
		vertlist.add(vertex03);
		
		
		Polygon polygon01 = new Polygon (vertlist); 
		
		MeshMap meshMap = new MeshMap (1000, 800, 100);
		
		while (run(60)) {
			
			polygon01.render(window, new Vector3f (1, 1, 1));
			meshMap.drawSites(window);
			
		}
		
	}
	
	public static boolean run (int fps) {
		if (Display.isCloseRequested()) {
			return false;
		}
		Display.sync(fps);
		Display.update();
		
		return true;
	}

}
