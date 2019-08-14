package capgemini.collections;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class _ArrayList2 {
	public static void main(String[] args) {
		// ArrayList<String> list = new ArrayList<String>(3);
		// LinkedList<String> list = new LinkedList<String>();
		Vector<String> list = new Vector<String>();
		System.out.println("size:" + list.size() + "\t" + list);
		list.add(null);
		list.add(null);// multiple nulls are allowed
		list.add("Sun");
		list.add("Mon");
		list.add("Wed");
		System.out.println("size:" + list.size() + "\t" + list);
		// added based on index
		list.add(2, "Tue");
		System.out.println("size:" + list.size() + "\t" + list);
		list.add("Thu");
		list.add("Free");
		list.add("Sat");
		list.add("Soon");
		System.out.println("size:" + list.size() + "\t" + list);
		int index = list.indexOf("Free");
		if (index != -1) {
			list.set(index, "Fri");// modified value
		}

		if (list.contains("Free")) {
			list.set(list.indexOf("Free"), "Fri");// modified value
			System.out.println("size:" + list.size() + "\t" + list);
		}
		// searching a string
		/*
		 * if(list.contains("Free")) list.set(5, "Fri");//modigfied value
		 * System.out.println("size:"+list.size()+"\t"+list);
		 */

		if (list.contains("Soon"))
			list.remove("Soon");
		System.out.println("size:" + list.size() + "\t" + list);
		// iterating
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		// enhanced for loop
		for (String value : list) {
			System.out.println(value);
		}
		ListIterator<String> listIterator = list.listIterator();
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		while (listIterator.hasPrevious()) {
			System.out.println("*" + listIterator.previous());
		}

	}
}