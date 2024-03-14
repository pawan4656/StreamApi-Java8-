package p1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		 
		ArrayList<Employe> list = new ArrayList<Employe>();
		list.add(new Employe(101,"Kamal","Male",36, 78551.22,2020));
		list.add(new Employe(102,"Shamaita","Female",26, 50551.22,2022));
		list.add(new Employe(103,"Aniket","Male",25, 32551.22,2023));
		list.add(new Employe(104,"Smriti","Female",38, 55551.55,2020));
		list.add(new Employe(101,"Pawan","Male",24, 90551.45,2018));
		
		//list.forEach(k->System.out.println(k));
		
		List<Employe> collect = list.stream().filter(e->e.getAge()<28).collect(Collectors.toList());
		collect.forEach(e->System.out.println(e));
		System.out.println("==============================================");

		List<Employe> collect2 = list.stream().sorted(Comparator.comparingDouble(Employe::getSalary)).collect(Collectors.toList());
		collect2.forEach(e1->System.out.println(e1));
		System.out.println("=================================================");
		
		List<Employe> collect3 = list.stream().sorted(Comparator.comparingInt(Employe::getId)).collect(Collectors.toList());
		collect3.forEach(e1->System.out.println(e1));
		System.out.println("==================================================");
		
		List<Employe> collect4 = list.stream().sorted((e1,e2)->e1.getName().compareTo(e2.getName())).collect(Collectors.toList());
		collect4.forEach(k->System.out.println(k));
		System.out.println("===================================================");
		
		List<Employe> collect5 = list.stream().filter(e->e.getYearOfJoining()<2020).collect(Collectors.toList());
		System.out.println("Joining before 2020:"+collect5);
		System.out.println("===================================================");
		
		long count = list.stream().count();
		System.out.println("ListCountNumber:"+count);
        System.out.println("===================================================");
        
        List<Employe> collect6 = list.stream().sorted(Comparator.comparingDouble(Employe::getSalary)).collect(Collectors.toList());
        collect6.forEach(e->System.out.println(e));
		
	}

}
