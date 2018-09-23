package DataTypes;

public class SiteEvent extends Event {

	private int x;
	private int y;
	
	public SiteEvent (int x, int y) {
		this.x = x;
		this.y = y;
		this.isSiteEvent = true;
	}

	
}
