package Exception;
import java.util.*;
public class Ex6 {
public static void main(String[]args) {
	HashMap<String,Integer> map=new HashMap<>();
	//Adding Key-value pairs
	map.put("Apple",3);
	map.put("Banana",2);
	map.put("Orange",5);
	System.out.println("HashMap:"+map);
	System.out.println("apple count:"+map.get("Apple"));
//checking if a key exists
	if(map.containsKey("Banana")) {
		System.out.println("Banana is in the map");
	}
	//remove
	map.remove("Orange");
	System.out.println(map);
	//size of hash map
	System.out.println("Size of the map:"+map.size());
	
		
	}
}

