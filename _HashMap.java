package capgemini.collections;

import java.util.HashMap;
import java.util.Iterator;

public class _HashMap {
public static void main(String[] args) {
	HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
	System.out.println("size:"+hashMap.size()+"\t"+hashMap);
	hashMap.put(null, null);
	hashMap.put(null, null); // allows only one null key
	hashMap.put(0, null); //allows many null values
	hashMap.put(1, "Mon");//duplicate keys are not allowed
	hashMap.put(1, "Jan");
	hashMap.put(1, "Feb");
	hashMap.put(1, "Mar");
	
	System.out.println("size:"+hashMap.size()+"\t"+hashMap);
	//hashMap.iterator(); do not get iterator directly...
	Iterator<Integer> itrKeys = hashMap.keySet().iterator(); //iterator
	System.out.println("printing keys");
	while(itrKeys.hasNext()){
		System.out.println(itrKeys.next());
		
	}
	Iterator<String> itrValues = hashMap.values().iterator(); //iterator
	System.out.println("printing values");
	while(itrValues.hasNext()){
		System.out.println(itrValues.next());
		
	}
	System.out.println("printing key:values...");
	
	Iterator<Integer> itrKeys2 = hashMap.keySet().iterator(); //iterator keys and values
	System.out.println("printing values");
	while(itrKeys2.hasNext()){
		Integer key = itrKeys2.next();
		System.out.println(key+":"+hashMap.get(key));
		
	}
}
}
