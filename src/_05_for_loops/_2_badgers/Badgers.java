package _05_for_loops._2_badgers;

public class Badgers {
public static void main(String[] args) {
	String bad = "Badger";
	int count = 0;
	while (count <12) { 
		System.out.print(bad);
		if (count <11)
			System.out.print(", ");
		count++;
	}
	System.out.println();
	String Mush = "Mushroom";
	int secondCount = 0;
	while (secondCount <2) { 
		System.out.print(Mush);
		if (secondCount <1)
			System.out.print(", ");
		secondCount++;
	}
	System.out.println();
	System.out.println();
	int thirdCount = 0;
	while (thirdCount <12) {
		System.out.print(bad);
		if (thirdCount <11)
			System.out.print(", ");
		thirdCount++;
	}
	System.out.println();
	int fourthCount = 0;
	while (fourthCount <2) { 
		System.out.print(Mush);
		if (fourthCount <1) 
			System.out.print(", ");
		fourthCount++;
	}
	System.out.println();
	System.out.println();
	String sna = "A Snake!!!";
	System.out.println(sna);
	
}
}
