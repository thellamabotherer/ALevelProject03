package DataTypes;

public class SiteEvent extends Event {

<<<<<<< HEAD
	private int x;
	private int y;
=======
	public SiteEvent(Integer x, Integer y) {
		super(x, y);
	}
	
	

>>>>>>> 06331f74996bc7fcc466d8737692b69d70451e2d
	
	public SiteEvent (int x, int y) {
		this.x = x;
		this.y = y;
		this.isSiteEvent = true;
	}

	
}
