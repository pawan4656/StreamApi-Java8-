package p2;

import java.util.List;
import java.util.stream.Collectors;

public class Test1 {

	public static void main(String[] args) {
		
		List<Integer> list = List.of(10,52,22,75,5);
		list.forEach(e->System.out.println(e));
		
		//Sorting
		List<Integer> sorted = list.stream().sorted().collect(Collectors.toList());
		System.out.println("SortedList:"+sorted);
		
		//Squares
         List<Integer> collect = list.stream().map(i->i*i).collect(Collectors.toList());
		System.out.println(collect);
		
		//Min
		Integer integer = list.stream().min((x,y)->x.compareTo(y)).get();
		System.out.println("MinValue:"+integer);
		
		//Max
		Integer integer2 = list.stream().max((x,y)->x.compareTo(y)).get();
		System.out.println("MaxValue:"+integer2);
         
		//Filtering e>10
		List<Integer> newList = list.stream().filter(e-> e > 10).collect(Collectors.toList());
		System.out.println("FilteredList:"+newList);
		
		//Filtering even numbers
		List<Integer> newlist2 = list.stream().filter(i-> i%2==0).collect(Collectors.toList());
        System.out.println("FilteredList2:"+newlist2);
        System.out.println("===============================================");
        
        List<String> list2= List.of("Pawan","Saurabh","Aman","Ankit","Ramu");
        list2.forEach(e->System.out.println(e));
        
        List<String> newlist3 = list2.stream().filter(e->e.startsWith("A")).collect(Collectors.toList());
        System.out.println("Startswith A:"+newlist3);
        
        
        
        
		
	}

}
