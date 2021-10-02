package duplicate.fun.impl;

import java.util.HashSet;
import java.util.Set;

import duplicate.fun.DuplicateChecker;

/**
 * The interviewer suggested taking the size of the HashSet and comparing to the size of the String.
 * Which does work as we were discussing clever ways to detect duplicates. However, when I was implementing
 * this solution I noticed:
 * 
 * HashSet.add:
 * Adds the specified element to this set if it is not already present. 
 * More formally, adds the specified element e to this set if this set contains
 * no element e2 such that (e==null ? e2==null : e.equals(e2)).
 * If this set already contains the element, the call leaves the set unchanged and returns false.
 * 
 * So we can simply check if this method returns false. 
 */
public class HashSetSolution implements DuplicateChecker{

	@Override
	public boolean containsDuplicate(String input) {
		Set<Character> hashset = new HashSet<Character>();
		for(int i = 0; i < input.length(); i++) {
			if(hashset.add(input.charAt(i)) == false) {
				return true;
			}
		}
		return false;
	}

}
