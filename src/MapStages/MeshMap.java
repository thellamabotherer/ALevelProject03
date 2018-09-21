package MapStages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import org.lwjgl.util.vector.Vector3f;

import DataTypes.EventQueue;
import DataTypes.Polygon;
import DataTypes.SiteEvent;
import DataTypes.Vertex;
import MainProgram.StaticFunctions;
import MainProgram.Window;

public class MeshMap {
	
	private Polygon[] polyMap; // array of all the polyogns in the map 
	private int[][] adjacencies; // adjacency matrix 

	private EventQueue eventQueue;
	
	private ArrayList<Integer[]> getRidOfThisVarLater;

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
		
		this.getRidOfThisVarLater= sites;
		
		
		
		/*this.eventQueue = new EventQueue (sites.size());
		
		for (int i = 0; i < sites.size(); i++) {
			this.eventQueue.enQueue(new SiteEvent(sites.get(i)[0], ));
		}

		/*
		 * TODO Use fortune's algorithm to generate the Voronois 
		 */
		
		// put all the sites in a nicely indexed array
		
		/*while siteEventQueue not empty
		 * 
		 * 		look for intersections before next site
		 * 				
		 * 			recursive function to keep finding soonest intersection event and then process them in order
		 * 					
		 * 				process intersection events by adding a vertex to the correct two voronois
		 * 
		 * 		when processing site
		 * 
		 * 			add new parabola in the correct place on the beach line
		 * 
		 */
		
		// draw the polygons that have been produced
		
		

	}
	
	public void drawSites (Window window) {
		this.polyMap = new Polygon[0];
		Polygon[] mapBuffer;
		ArrayList<Vertex> bufferList;
		for (int i = 0; i < getRidOfThisVarLater.size() - 1; i++) {
			mapBuffer = new Polygon[this.polyMap.length + 1];
			for (int j = 0; j < polyMap.length; j++) {
				mapBuffer[j] = this.polyMap[j];
			}bufferList = new ArrayList();
			bufferList.add(new Vertex(new Vector3f(getRidOfThisVarLater.get(i)[0], getRidOfThisVarLater.get(i)[1], 0)));
			bufferList.add(new Vertex(new Vector3f(getRidOfThisVarLater.get(i)[0] - 1, getRidOfThisVarLater.get(i)[1] - 1, 0)));
			
			mapBuffer[mapBuffer.length - 1] = new Polygon(bufferList);
			this.polyMap = mapBuffer;
		}
		
		for (int i = 0; i < this.polyMap.length; i++) {
			this.polyMap[i].render(window, new Vector3f(1,1,1));
		}
	}

}
