package collectionPack;

import java.util.function.Function;

public class FunctionalInterfaceConcept {

	public static void main(String[] args) {

		/**
		 * Interface Function<T,R>
		   Type Parameters:
T - the type of the input to the function
R - the type of the result of the function
		 */
		
		Function<String, Integer> func = x->x.length();
		int len = func.apply("I am learning Java - 8");
		System.out.println(len);

		//Chaining function
		Function<Integer, Integer> func2 = x->x * 2;
		int chainLen = func.andThen(func2).apply("I am Harishd");
		System.out.println("chainLen - "+chainLen);
	}

}
