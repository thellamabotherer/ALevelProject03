package DataTypes;

public class Event {
	
<<<<<<< HEAD
	protected boolean isSiteEvent;
=======
	protected int x;
	protected int y;
	
	public Event (Integer x, Integer y) {
		this.x = (int)x;
		this.y = (int)y;
	}

	public int getY() {
		return this.y;
	}public int getX () {
		return this.x;
	}
>>>>>>> 06331f74996bc7fcc466d8737692b69d70451e2d

	public boolean type () {
		return this.isSiteEvent;
	}
	
}
