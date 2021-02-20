package day13;
import java.util.*;
public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       LinkedList li=new LinkedList();
       li.add(2);
       li.add(5);
       li.addFirst(10);
       li.addLast(4);
       li.add(25);
       
       System.out.println("Linked list "+li);
       
       li.removeFirst();
       System.out.println("Linked list "+li);
       
       li.removeLast();
       System.out.println("Linked list "+li);
	}

}
