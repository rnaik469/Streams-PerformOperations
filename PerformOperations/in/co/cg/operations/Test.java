package in.co.cg.operations;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		//adding 100 numbers into the list
	for (int i=1;i<=100;i++)
		{
			list.add(i);
		}
		
		//checking the Odd numbers
		list.stream().filter(Operations.isOdd()).forEach(System.out::println);
		
		System.out.println();
		
		//checking the Even numbers
		list.stream().filter(Operations.isEven()).forEach(System.out::println);
		
		System.out.println();
		
		//checking the number is Palindrome 
		list.stream().filter(Operations.isPalindrome()).forEach(System.out::println);

	}

}
