package p1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class MainStd {

	public static void main(String[] args) {
		
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student(101,"Abhishek", "Engineering",745588855));
		list.add(new Student(102,"Aakash", "Engineering",99588855));
		list.add(new Student(103,"Pawan", "Engineering",88584455));
		list.add(new Student(104,"Sanskar", "Engineering",663388855));
		list.add(new Student(105,"Ajay", "Engineering",910588855));
		list.add(new Student(106,"Lalak", "Commerce",985888550));
		
		list.forEach(k->{
			System.out.println(k);
		});
		System.out.println("=================================");
		
		List<Student> collect = list.stream().filter(k->k.getName().startsWith("P")).collect(Collectors.toList());
		System.out.println(collect);
		
		System.out.println("===============================");
		List<Student> collect2 = list.stream().sorted((e1,e2)->e1.getName().compareTo(e2.getName())).collect(Collectors.toList());
        Iterator<Student> iterator = collect2.iterator();
        while(iterator.hasNext()) {
        	System.out.println(iterator.next());
        }

	}

}
