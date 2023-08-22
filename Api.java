package queue1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Api {

	public static void main(String[] args) {

		// Stream API :
		
		/*
		 * 1) java 8 provides new additional package called java.util.stream
		 * 
		 * 2) This package consiste collection of class, interface and enum 
		 * to implement functional style operation or functionla programming 
		 * 
		 * 3) A Stream is sequence of object that supports various method which
		 * can be pipelined to produce the desired result.
		 * 
		 * 4)Using stream API java enters in functional programming.
		 * 
		 * 5) stream provides a several programming operation 
		 * *) non-turminal operation are:
		 * *) filter(Predicate<T>)
		 * *) map(function<T>)
		 * *) flat map(Function<T>)
		 * *)sorted(Comparator<T>)
		 * 
		 * 
		 *
		 * 
		 * 
		 * 
		 * */

		List<Integer> marks = new ArrayList();
		marks.add(10);
		marks.add(20);
		marks.add(30);
		marks.add(40);
		marks.add(50);
		marks.add(60);
		marks.add(70);
		Stream<Integer> streamofMarks = marks.stream();
		streamofMarks.forEach(m->System.out.println(m));
		// i wont to fetch all marks
		System.out.println("All Passing Marks");
		Predicate<Integer> predicate=(m)->{
			if(m>35) {return true;}return false;};
		Consumer<Integer> consumer = m-> System.out.println(m);
		marks.stream().
		filter(predicate).
		forEach(consumer);
		
		//Printing only first 3 object frome the list
		System.out.println("Printing only first 3 object frome the list");
		marks.stream().limit(3).forEach(m->System.out.println(m));
		
		System.out.println("Skipping 4 object frome the list");
		marks.stream().skip(4).forEach(m->System.out.println(m));
		
		
		
	}

}
