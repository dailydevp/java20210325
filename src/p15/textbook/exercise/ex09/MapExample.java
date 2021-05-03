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
		
		Set<String> keys = map.keySet();
		
		for(String key : keys) {
			int value = map.get(key);
			
			if(value>maxScore) {
				maxScore = value;
				name = key;
			}
			
			totalScore += value;		
		}
		
		System.out.println("평균점수:"+((double)totalScore / map.size()));
		System.out.println("최고점수:" + maxScore);
		System.out.println("최고점수를 받은 아이디: " + name);
	}
}
