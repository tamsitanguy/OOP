package myAssignment;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Arrays;

public class AnimalCollectionDriver {

	public static void main(String[] args) {
		
		animalCollectionDemo();
		
		
	}
	
	public static void animalCollectionDemo() {
		List<Cat>catList = new ArrayList<Cat>();
		catList.add(new Cat());
		catList.add(new Cat("chat1", 2, 34.7));
		catList.add(new Cat("chat2", 4));
		catList.add(new Cat("chat3"));
		catList.add(new Cat("chat4", 3, 21.2));
		
		//printing the list of cats
		System.out.println("The list of all the cats is:..... ");
		System.out.println(catList);
		
		SortedSet<Cat>sortedCatSet = new TreeSet<Cat>(catList);
		
		//System.out.println("Here is the list of sorted cats: ///////////");
		System.out.println(sortedCatSet);
		
		System.out.println("Sorting by age:*********************************************************************");
		SortedSet<Cat>ageSortedCat = new TreeSet<Cat>(new CatScale());
		ageSortedCat.addAll(catList);
		
		System.out.println(ageSortedCat);
	}
	

}
