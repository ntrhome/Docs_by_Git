package my.rundog;

import java.util.Arrays;

public class Main {
	private static int []dog; 
	
	public static void main(String[] args) {
		dog = new int[10];
		dog[0] = 1;
		
		dogDoWhile();
		
		dogRecursion(0, 1);

	}

	
	
	private static void dogDoWhile() {
		int i = 0;
		do {
			System.out.println(Arrays.toString(dog));
			dog[  i] = 0;
			dog[++i] = 1;
		} while (i < dog.length-1);
		System.out.println(Arrays.toString(dog));
		do {
			dog[  i] = 0;
			dog[--i] = 1;
			System.out.println(Arrays.toString(dog));
		} while (i > 0);
	}

	private static void dogRecursion(int place, int step) {
		System.out.println(Arrays.toString(dog));
		if(step == 1) {
			if(place == dog.length-1) step = -1;	
		} else {
			if(place == 0) return;
		}
		dog[place] = 0;
		place += step;
		dog[place] = 1;
		dogRecursion(place, step);
	}

	
}
