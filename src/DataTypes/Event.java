package DataTypes;

public class Event {
	
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

}
