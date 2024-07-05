package collections;

import java.util.HashMap;
import java.util.Map;

public class SetExample {
	public static void main(String[] args) {
		Map<String, String> associatedArray = new HashMap<>();
		associatedArray.put("ben", "ten");
		associatedArray.put("delhi", "anan");
		associatedArray.put("delhi", "shar");
		associatedArray.put(null, "shar");
		
		System.out.println(associatedArray);
		
//		associatedArray.forEach((x, a )-> System.out.println(x +" "+ a));
		
		
		for (Map.Entry<String, String> input : associatedArray.entrySet()) {
            String key = input.getKey();
            String value = input.getValue();
            System.out.println(key + " " + value);
        }
		
	}
}
