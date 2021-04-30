package p15.textbook.exercise.ex09;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white",92);
		
		String name = null;
		int maxScore = 0;
		int totalScore = 0;
		
		Set<String> stringSet = map.keySet();
		for(int i = 0; i<map.size(); i++) {
			name++;
		System.out.println(stringSet);
		
		}
	}
}
