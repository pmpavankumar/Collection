package day13;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class MapDemo {

	public static void main(String[] args) {
		HashMap h=new HashMap();//we don't have add method ,put is used to insert element
		h.put("sachin","sachin is opening batsman");
		h.put( "rahul","middle order");
		h.put("pant", "wicket");
		h.put( "rahul","head coach");
		
		System.out.println(h);
		System.out.println(h.get("sachin"));
		System.out.println(h.containsKey("pant"));
		
		
		LinkedHashMap h1=new LinkedHashMap();
		
		h1.put("sachin","sachin is opening batsman");
		h1.put( "rahul","middle order");
		h1.put("pant", "wicket");
		h1.put( "rahul","head coach");
		
		
		System.out.println(h1);
		System.out.println(h1.get("sachin"));
		System.out.println(h1.containsKey("pant"));
		
		System.out.println(h1.keySet());
		System.out.println(h1.values());
		System.out.println(h1.entrySet());

	}

}
