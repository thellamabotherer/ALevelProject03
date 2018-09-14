package MapStages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import DataTypes.EventQueue;
import DataTypes.SiteEvent;
import MainProgram.StaticFunctions;

public class MeshMap {

	private EventQueue eventQueue;

	public MeshMap(int xSize, int ySize, int numSites) { // args are settings that relate the number of sites. Later,
															// args may include number of Lloyd relaxations.

		/*
		 * TODO Generate a map of randomly distributed sites. Put the sites in an
		 * ordered list (by Y coord)
		 */

		Random rand = new Random();

		ArrayList<Integer[]> sites = new ArrayList();

		for (int i = 0; i < numSites; i++) {
			int x = rand.nextInt(xSize);
			int y = rand.nextInt(ySize);

			boolean valid = true;

			for (int j = 0; j < sites.size(); j++) {
				if (x == sites.get(j)[0] && y == sites.get(j)[1]) {
					valid = false;
				}
			}

			if (valid) {
				Integer[] loc = { x, y };
				sites.add(loc);
			} else {
				i--;
			}

		}
			
		this.eventQueue = new EventQueue (sites.size());
		
		for (int i = 0; i < sites.size(); i++) {
			this.eventQueue.enQueue(new SiteEvent(sites.get(i)[0], ));
		}

		/*
		 * TODO Use fortune's algorithm to generate the Voronois of every site Put the
		 * Voronois into a useful data structure
		 */
		
		int sweepLineY = 0;
		
		while (this.eventQueue.getLength() > 0) {
			
			
			
		}

	}

}
