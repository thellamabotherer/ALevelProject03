package DataTypes;

import java.util.ArrayList;

import org.lwjgl.util.vector.Vector3f;

import MainProgram.Window;

public class Polygon {
	
	private Vertex[] vertices;
	private boolean[][] adjacencies;
	
	public Polygon (ArrayList<Vertex> vertices) { // feeds in the coordinates in order
		this.vertices = new Vertex[vertices.size()];
		this.adjacencies = new boolean[vertices.size()][vertices.size()];
		
		for (int i = 0; i < vertices.size(); i++) {
			this.vertices[i] = vertices.get(i);
			for (int j = 0; j < this.adjacencies.length; j++) {
				if ((Math.abs( i - j )) == 1) {
					adjacencies[i][j%adjacencies.length] = true;
				}else {
					adjacencies[i][j%adjacencies.length] = false;
				}
			}
		}
		
		
	}

	public void render (Window window, Vector3f col) {
		
		for (int i = 0; i < vertices.length; i++) {
			for (int j = 0; j < adjacencies.length; j++) {
				if (adjacencies[i][j]) {
					window.beginLineRender();
					window.addVertex(this.vertices[i].getPos());
					window.addVertex(this.vertices[j].getPos());
					window.addVertex(this.vertices[i].getPos());
					window.endRender();
				}
			}
		}
		
	}

}
