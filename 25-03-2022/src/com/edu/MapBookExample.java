package com.edu;
import java.util.HashMap;
import java.util.Map;

class Book {    
int id;    
String name,author,publisher;    
int quantity;    
public Book(int id, String name, String author, String publisher, int quantity) {    
    this.id = id;    
    this.name = name;    
    this.author = author;    
    this.publisher = publisher;    
    this.quantity = quantity;    
}    
}    
public class MapBookExample {
public static void main(String[] args) {    
    //Creating map of Books    
   HashMap<Integer,Book> map=new HashMap<Integer,Book>();    
    //Creating Books    
   Book b1=new Book(432,"War and Peace","Leo Tolstoy","Simon",3);    
   Book b2=new Book(786,"My Experiments with Truth","Mahatma Gandhi","Jaico",5);    
   Book b3=new Book(187,"Wings of Fire","A.P.J Abdul Kalam","Universities Press",8);    
    //Adding Books to map   
    map.put(1,b1);  
    map.put(2,b2);  
    map.put(3,b3);
//Traversing map  
    for(Map.Entry<Integer, Book> entry:map.entrySet()){    
        int key=entry.getKey();  
        Book b=entry.getValue();  
        System.out.println(key+" Details:");  
        System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);   
    }    
}    
}
