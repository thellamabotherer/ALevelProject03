package DataTypes;

import java.util.ArrayList;

import org.lwjgl.util.vector.Vector3f;

public class Vertex {
	
	private Vector3f pos;
	
	public Vertex (Vector3f pos) {
		this.pos = pos;
	}

	public Vector3f getPos() {
		return this.pos;
	}
	
	public boolean isEqual (Vertex v) {
		if (( this.pos.x == v.getPos().x ) && ( this.pos.y == v.getPos().y ) && ( this.pos.z == v.getPos().z )) {
			return true;
		}return false;
	}

}
