package day13;
import java.util.*;
public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ArrayList<String>javabatch=new ArrayList<String>();
      ArrayList<String>softskillbatch=new ArrayList<String>();
      
      javabatch.add("Aarti");
      javabatch.add("Abhay");
      javabatch.add("Deepa");
      javabatch.add("Rakhi");
      javabatch.add("Sarita");
      
      System.out.println(javabatch);
      
      softskillbatch.add("Anjali");
      softskillbatch.add("Nikil");
      softskillbatch.add("Deepa");
      softskillbatch.add("Aarti");
      softskillbatch.add("Pavan");
      
      softskillbatch.removeAll(javabatch);
      System.out.println(softskillbatch);
      
      softskillbatch.addAll(javabatch);
      System.out.println("Adding java batch to softskill batch"+softskillbatch);
      
      Collections.sort(softskillbatch);
      System.out.println(softskillbatch);
      
      //softskillbatch.remove("Deepa");
     // softskillbatch.remove("Aarti");
      
      
      
	}

}
