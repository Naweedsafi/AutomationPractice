package Class3;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		TreeMap<Integer, String> tmap = new TreeMap();
		tmap.put(22, "Kelly");
		tmap.put(21, "Ahmad");
		tmap.put(23, "John");
		tmap.put(24, "William");
		tmap.put(25, "Naweed");
		System.out.println(tmap);
		for(Map.Entry<Integer, String> entry : tmap.entrySet()){
			Integer key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + " " + value);
		}
		if(tmap.containsKey(6)) {
			System.out.println("TMap has a given key ");
		}else {
			System.out.println("TMap has not given key");
		}
		tmap.clear();
		if(tmap.isEmpty()) {
			System.out.println("TMap is Empty");
		}
	}

}
