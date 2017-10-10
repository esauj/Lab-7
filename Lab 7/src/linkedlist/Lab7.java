package linkedlist;

import java.util.LinkedList;
import java.util.ListIterator;


public class Lab7 {

	public static void main(String[] args) {
		LinkedList<String> first = new LinkedList<String>();
		LinkedList<String> second = new LinkedList<String>();
		LinkedList<String> secondCopy = new LinkedList<String>();
		
		first.add("Tulsa");
		first.add("Ada");
		first.add("Broken Arrow");
		first.add("Owasso");
		first.add(1, "OKC");
		
		second.add("74104");
		second.add("74135");
		second.add("foo");
		second.add("hello world");
		second.add("777");
		
		ListIterator<String> iter1 = first.listIterator();
		ListIterator<String> iter2 = second.listIterator();
		
		while(iter2.hasNext()){
			first.add(iter2.next());
		}
				
		while(iter1.hasNext()){
			String next = iter1.next();
			String nextNext = iter1.next();
			first.remove(iter1.next());	
		}

//		System.out.println(first);
//		
//		int x = 1;
//		
//		for(int i = 0; i < first.size(); i++) {
//			if(x > 0 && i == x) {
//				first.remove(x);
//				x++;
//			}
//		}
		
		while(iter2.hasNext()) {
			secondCopy.add(iter2.next());			
		}
	}
}
