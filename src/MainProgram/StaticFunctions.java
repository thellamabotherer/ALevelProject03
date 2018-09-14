package MainProgram;

import java.util.ArrayList;

public class StaticFunctions {
	
	public static ArrayList<Integer[]> sortSiteArray (ArrayList<Integer[]> list) {
	
		ArrayList<Integer[]> sortedList = new ArrayList();
		
		while (list.size() > 0) {
			int firstIndex = -1;
			Integer[] first = {Integer.MAX_VALUE,Integer.MAX_VALUE};
			for (int i = 0; i < list.size(); i++) {
				
				if (list.get(i)[1] < first[1]) {
					first = list.get(i);
					firstIndex = i;
				}
			}
			
			list.remove(firstIndex);
			sortedList.add(first);
			
		}
		
		return sortedList;		
	}

}
