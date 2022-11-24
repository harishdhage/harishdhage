package collectionPack;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Person> people = new ArrayList<>();
		people.add(new Person("Ratan Tata", 190));
		people.add(new Person("Mukesh Ambani", 590));
		people.add(new Person("Aditya Birla", 160));
		people.add(new Person("Anil Ambani", -50));
		
		/*List<Person> hundredBillionClub = new ArrayList<>();
		
				
		for(Person p : people){
			if(p.billion >= 100){
				hundredBillionClub.add(p);
			}
		}
		
		hundredBillionClub.forEach(person -> System.out.println(person.name));*/
		
		//Same above for each loop we can achieve through streams
		
		List<Person> hundredBillionClub = people.stream().filter(person -> person.billion >= 100).collect(Collectors.toList());
		hundredBillionClub.forEach(person -> System.out.println(person.name));
		System.out.println("\n*************************************\n");
		List<Person> sortedName = people.stream().sorted(Comparator.comparing(person -> person.name)).collect(Collectors.toList());
		sortedName.forEach(person -> System.out.println(person.name));
		System.out.println("\n*************************************\n");
		List<Person> hundredBillionClubWithSorted = people.stream().filter(person -> person.billion >= 100).sorted(Comparator.comparing(person -> person.name)).collect(Collectors.toList());
		hundredBillionClubWithSorted.forEach(person -> System.out.println(person.name));
		
		
	}
	
	static class Person{
		String name;
		int billion;
		
		public Person(String name, int billion){
			this.name = name;
			this.billion = billion;
		}
	}

}
