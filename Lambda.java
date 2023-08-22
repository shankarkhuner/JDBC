package queue1;

import java.util.function.Function;
import java.util.function.Predicate;

public class Lambda {

	// Predicate interface
	public static void main(String[] args) {
		Predicate<String> pre = (name)->{return name.length()>=5 && name.length()<=20;};
		boolean status = pre.test("Rah");
		if(status) {
			System.out.println("Valid Name");
		}
		else {
			System.out.println("Invalide name");
		}
		// Functional interface
		// apply (T t)--r r
		Function<Integer, String> fun=(input)->{if(input%2==0) {
			return "The even number is"+" "+ input;
			
		}
		else{
			return "Number is odd";
		}};
			
			//String msg = fun.apply(msg);
			//System.out.println();
			//consumer
			//Consumer<Double> con =(salary)=>{System.out.println(salary*015);};
			
		
		
			
			
			
		}

	}


