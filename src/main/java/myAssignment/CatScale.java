package myAssignment;

import java.util.Comparator;

public class CatScale implements Comparator<Cat> {
	public int compare(Cat c1, Cat c2) {
		int out = 0;
		int catAge1 = c1.getpAge();
		int catAge2 = c2.getpAge();
		out = (catAge1-catAge2);
		if(out==0) {
			out = c1.compareTo(c2);
		}
		return out;
	}

}
