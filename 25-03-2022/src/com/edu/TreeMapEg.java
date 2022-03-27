package com.edu;
import java.util.TreeMap;
import java.util.Map;




public class TreeMapEg {
	public static void main(String[] args) {
		TreeMap<Integer, String> hob=new TreeMap<Integer, String>();
		hob.put(1, "Kavitha");
		hob.put(2, "Kiran");
		hob.put(3, "Abhinaya");
		hob.put(4, "Bhavani");
		hob.put(5, "Ramesh");
		hob.put(8, "Saghanaa");
		hob.put(7, "Gomu");
		hob.put(6, "Kavi");
		hob.put(9, "Gopi");
		hob.put(10, "Viji");
		
		System.out.println(hob);
		
		System.out.println("");
        for(Map.Entry<Integer, String> m:hob.entrySet()){  
   System.out.println(m.getKey()+" "+m.getValue()); 

	}
}
	
}



