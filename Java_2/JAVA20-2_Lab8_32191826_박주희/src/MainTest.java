//Lab8 32191826 π⁄¡÷»Ò  11/16
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class MainTest {

	public static void main(String[] args){
		//1.DynamicArray
		System.out.println("DynamicArray add&print");
		DataList<String> arr=new DynamicArray<>(5);
		arr.add("Seoul");
		arr.add("Tokyo");
		arr.add("Beijing");
		arr.add("New Delhi");
		arr.add("Manila");
		arr.add("Pyongyang");
		arr.add("Tehran");
		arr.add("Singapore");
		arr.add("Tehran");
		arr.add("Athens");
		arr.add("Copenhagen");
		arr.add("Berlin");
		arr.add("Moscow");
		arr.add("Monaco");
		System.out.println("DynamicArray Test Iterable<E>");
		arr.forEach(System.out::println);  //foreach
		System.out.println();
		
		System.out.println("DynamicArray Test remove by iterator");
		Iterator iter=arr.iterator();
		while(iter.hasNext()) {
			if(iter.next().equals("Tokyo")) {
				iter.remove();
			}
		}
		arr.print();
		System.out.println("DynamicArray Test remove all by iterator");
		while(iter.hasNext()) {   //while
			iter.next();
			iter.remove();
		}
		arr.print();
		System.out.println();
		
		System.out.println("Test insert");
		arr.add(0,"Bangkok");
		arr.add("Seoul");
		arr.add("Tokyo");
		arr.add("Beijing");
		arr.add("New Delhi");
		arr.add("Manila");
		arr.add(4,"Kuwait");
		arr.print();  //print method
		System.out.println();
		System.out.println("Test get");
		System.out.println("index 1="+arr.get(1));
		System.out.println("index 4="+arr.get(4));
		System.out.println();
		System.out.println("Test clear");
		arr.clear();
		
		
		//ArrayList
		System.out.println("\n\nAdapter ArrayList test add&print");
		DataList<String> arr2=new DataListAdapter<>(new ArrayList<>());
		arr2.add("Chicago");
		arr2.add("Athens");
		arr2.add("Tokyo");
		arr2.add("Pyongyang");
		arr2.add("Tehran");
		arr2.add("Singapore");
		arr2.print();
		System.out.println();
		Iterator iter2=arr2.iterator();
		while(iter2.hasNext()) {  //while
			if(iter2.next().equals("Tokyo")) {
				iter2.remove();
			}
		}
		for(int i=0;i<arr2.size();i++) {  //for
			System.out.println(arr2.get(i));
		}
		System.out.println("ArrayList Test remove all by iterator");
		for(Iterator<String> s=arr2.iterator();s.hasNext();) {
			String str=s.next();
			s.remove();
		}
		arr2.print();
		System.out.println();
		System.out.println("Add again and Test insert");
		arr2.add("Chicago");
		arr2.add("Pyongyang");
		arr2.add("Tehran");
		arr2.add("New Delhi");
		arr2.add(2,"Manaco");
		arr2.print();
		System.out.println();
		System.out.println("ArrayList Test get");
		System.out.println("index 0="+arr2.get(0));
		System.out.println("index 3="+arr2.get(3));
		System.out.println();
		System.out.println("ArrayList Test clear");
		arr2.clear();
		
		
		//LinkedList
		System.out.println("\n\nAdapter LinkedList test add&print");
		DataList<String> arr3=new DataListAdapter<>(new LinkedList<>());
		arr3.add("Juhee");
		arr3.add("Juyoung");
		arr3.add("Jungwoog");
		arr3.add("Geonwoo");
		arr3.add("Jessi");
		arr3.forEach(System.out::println);  //forEach
		System.out.println();
		Iterator iter3=arr3.iterator();
		while(iter3.hasNext()) {  //while
			if(iter3.next().equals("Jungwoog")) {
				iter3.remove();
			}
		}
		arr3.print();
		System.out.println("LinkedList Test remove all by iterator");
		for(Iterator<String> s=arr3.iterator();s.hasNext();) {
			String str=s.next();
			s.remove();
		}
		System.out.println();
		System.out.println("LinkedList Test insert");
		arr3.add("Juhee");
		arr3.add("Jungwoog");
		arr3.add("Joo");
		arr3.add(0,"Rosa");
		arr3.add(2,"Juyoung");
		arr3.print();
		System.out.println();
		System.out.println("LinkedList Test get");
		System.out.println("index 0="+arr3.get(0));
		System.out.println("index 1="+arr3.get(1));
		System.out.println();
		System.out.println("LinkedList Test clear");
		arr3.clear();
			
		
		//My code
		System.out.println("\n\nAdapter Vector test add&print");
		DataList<String> arr4=new DataListAdapter<>(new Vector<>());
		arr4.add("Cat");
		arr4.add("Dog");
		arr4.add("Monkey");
		arr4.print();
		System.out.println();
		Iterator iter4=arr4.iterator();
		while(iter4.hasNext()) {   //while
			if(iter4.next().equals("Cat")) {
				iter4.remove();
			}
		}
		arr4.print();
		System.out.println("Vector Test remove all by iterator");
		for(Iterator<String> s=arr4.iterator();s.hasNext();) {
			String str=s.next();
			s.remove();
		}
		System.out.println();
		System.out.println("Vector Test insert");
		arr4.add("Zebra");
		arr4.add("Butterfly");
		arr4.add("Bird");
		arr4.add(0,"Duck");
		arr4.add(3,"Koala");
		arr4.print();  //print method
		System.out.println();
		System.out.println("LinkedList Test get");
		System.out.println("index 3="+arr4.get(3));
		System.out.println("index 1="+arr4.get(1));
		System.out.println();
		
		System.out.println("LinkedList Test clear");
		arr4.clear();
		
		
	}

}
