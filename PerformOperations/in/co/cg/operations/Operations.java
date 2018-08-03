package in.co.cg.operations;

import java.util.function.Predicate;

public class Operations {

	/**
	 * @return true if odd
	 */
	public static Predicate<Integer> isOdd() {
		Predicate<Integer> predicate = (value) -> {
			return (value % 2 == 0) ? false : true;

		};

		return predicate;
	}

	/**
	 * @return true if even
	 */
	public static Predicate<Integer> isEven() {
		Predicate<Integer> predicate = (value) -> {
			return (value % 2 == 0) ? true : false;
		};
		return predicate;
	}

	/**
	 * @return true if palindrome
	 */
	public static Predicate<Integer> isPalindrome() {
		Predicate<Integer> predicate = (value) -> {
			return (Integer.toString(value)).equals(new StringBuilder(Integer.toString(value)).reverse().toString());
		};
		return predicate;
	}
}
