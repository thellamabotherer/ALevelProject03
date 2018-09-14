package MainProgram;

import static org.lwjgl.opengl.GL11.*;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.vector.Vector3f;
import org.lwjgl.util.vector.Vector4f;

public class Window {

	private int WIDTH;
	private int HEIGHT;
	private String title;
	
	public Window (int width, int height, String Title) {
		
		this.WIDTH = width;
		this.HEIGHT = height;
		this.title = Title;
		
		try {
			
			Display.setDisplayMode(new DisplayMode(this.WIDTH, this.HEIGHT));
			Display.setTitle(this.title);
			Display.create();
			glClearColor(1.0f, 1.0f, 1.0f, 0.0f);
			glDisable(GL_LIGHTING);
			
		}catch (LWJGLException e) {
			
			e.printStackTrace();
			System.out.println("Could not initialise display for some hitherto unknown reason.");
			
		}
		
		glMatrixMode(GL_PROJECTION);
		glLoadIdentity();
		glOrtho(0, Display.getWidth(), 0, Display.getHeight(), 0, 100);
		glTranslatef(1.5f, 0.0f, 0.0f);
		
		glClearDepth(100.0f);
		glEnable(GL_DEPTH_TEST);
		glDepthFunc(GL_LEQUAL);
		glShadeModel(GL_SMOOTH);
		glHint(GL_PERSPECTIVE_CORRECTION_HINT, GL_NICEST);
		
	}
	
}
