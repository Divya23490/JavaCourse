package arrayListPackage;

import java.util.ArrayList;
import java.util.Iterator;

public class TestCollection {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Vidhya");
		al.add("Olha");
		al.add("Santosh");
		
		System.out.println(al.size());
		
//		for(int i=0;i<al.size();i++) {
//			System.out.println(al.get(i));
//		}
//		
//		for(String obj: al) {
//			System.out.println(obj);
//		}
		
		Iterator itr= al.iterator();
		while(itr.hasNext()) {//boolean 
			System.out.println(itr.next());
		}
		
		al.remove(1);
		al.remove("Vidhya");
		System.out.println(al.size());
		for(String obj: al) {
			System.out.println(obj);
		}
				
	}

}
