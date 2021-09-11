package FruitApp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		//Create arrayList of user-defined class objects
		List<Fruit> fl = new ArrayList<Fruit>();
		System.out.println("Fruit List (orderd by name)");
		
		Fruit f1 = new Fruit(101, "Apple", 1000);
		fl.add(f1); //adding Fruit class object
		Fruit f2 = new Fruit(102, "Orange", 1500);
		fl.add(f2);
		fl.add(new Fruit(103, "Kiwi", 2000));
		fl.add(new Fruit(104, "Cherry", 2500));
		fl.add(new Fruit(105, "Pear", 3000));
		fl.add(new Fruit(106, "Strewberry", 3500));
		fl.add(new Fruit(107, "Watermelon", 8000));
		fl.add(new Fruit(108, "Melon", 6000));
		fl.add(new Fruit(109, "Banana", 4000));
		fl.add(new Fruit(110, "Grape", 4500));
		
		Collections.sort(fl, new FruitComparator());
		//Traverse elements of arrayList (ordered)
		for(Fruit s : fl) {
			System.out.println(s.toString());
		}
		System.out.println("Fruit List (reverse ordered by name)");
		
		Collections.sort(fl, new FruitComparatorDesc());
		//Traverse elements of arrayList (reverse ordered)
		for(int i = 0; i < fl.size(); i++) {
			System.out.println(fl.get(i).toString());
		}
	}

}
