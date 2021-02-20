package day13;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<Integer>();

		list.add(1);
		list.add(13);
		list.add(4);
		list.add(2);
		System.out.println("elements i arraylist:"+list);
		
		Collections.sort(list);
		
		System.out.println("elements i arraylist:"+list);
		
		Collections.reverse(list);
		System.out.println("elements i arraylist:"+list);
		
		System.out.println("max value "+Collections.max(list));
		System.out.println("min value "+Collections.min(list));
		
		Collections.sort(list);
		System.out.println("elements i arraylist:"+list);//list should be in sorted order
		
		int index=Collections.binarySearch(list,2);
		System.out.println("element found at "+index);

	}

}
