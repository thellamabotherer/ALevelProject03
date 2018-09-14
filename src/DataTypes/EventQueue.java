package DataTypes;

public class EventQueue {
	
	private Event[] eventQueue;
	
	public EventQueue (int len) {
		this.eventQueue = new Event[len];
	}
	
	public void enQueue (Event event) {
	
		Event[] evQueue = new Event [this.getLength() + 1];
		for (int i = 0; i < this.getLength(); i++) {
			evQueue[i] = this.eventQueue[i];
		}evQueue[this.getLength() + 1] = event;
		
		this.eventQueue = evQueue;
		
	}public Event deQueue() {
		try {
			Event ev = eventQueue[0];
			Event[] evQueue = new Event[this.getLength() -1];
			for (int i = 1; i < this.getLength(); i++) {
				evQueue[i-1] = this.eventQueue[i];
			}
			this.eventQueue = evQueue;
		
			return ev;
		}catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("this queue is empty");
			return new Event();
		}
	}
	public int getLength () {
		return this.eventQueue.length;
	}

}
