package day13;

import java.util.*;


public class CollectionDemo {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		
		list.add(1);
		list.add("sam");
		list.add(34.56);
		list.add(true);
		
		System.out.println("elements i arraylist:"+list);
		list.add(1, 10);
		System.out.println("elements i arraylist:"+list);
		list.set(3,"sarita");
		
		System.out.println("elements i arraylist:"+list);
		Set set= new HashSet();
		set.add(1);
		set.add("yellow");
		set.add(45.5);
		set.add(true);
		
		System.out.println("elements "+set);
		set.add(1);

	}

}
