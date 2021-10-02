package duplicate.fun.impl;

import java.util.HashSet;
import java.util.Set;

import duplicate.fun.DuplicateChecker;

/**
 * The interviewer suggested taking the size of the HashSet and comparing to the size of the String.
 * This is that solution.
 */
public class HashSetSolutionTwo implements DuplicateChecker{

	@Override
	public boolean containsDuplicate(String input) {
		Set<Character> hashset = new HashSet<Character>();
		for(int i = 0; i < input.length(); i++) {
			hashset.add(input.charAt(i));
		}
		if(input.length() != hashset.size()){
			return true;
		}
		return false;
	}

}