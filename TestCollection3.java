package hashMapImpl;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class TestCollection3 {

	public static void main(String[] args) {
		HashMap<Integer, String> hm=new HashMap<Integer, String> ();
		hm.put(101, "Vidhya");//101--->Vidhya
		hm.put(102, "Mahua");
		hm.put(103, "Sahil");
		
		for(Map.Entry<Integer, String> m: hm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		for(Entry<Integer, String> m: hm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		hm.remove(102);
		hm.remove(103, "Sahil");
		for(Entry<Integer, String> m: hm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}

	}

}
