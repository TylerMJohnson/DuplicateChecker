package duplicate.fun.impl;

import duplicate.fun.DuplicateChecker;

/**
 * This was my first solution to the problem.
 */
public class FunSolution implements DuplicateChecker{

	/**
	 * O(n)
	 */
	@Override
	public boolean containsDuplicate(String input) {
		char[] table = new char[26]; //Lowercase letters only in this example. 
		byte slot;
		for(int i = 0; i < input.length(); i++) {
			slot = (byte) (input.charAt(i) - 97);
			if(table[slot] == '\u0000'){
				table[slot] = 'f';
			} else {
				return true;
			}
		}
		return false;
	}
}
