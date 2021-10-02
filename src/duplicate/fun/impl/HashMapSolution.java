package duplicate.fun.impl;

import java.util.HashMap;
import java.util.Map;

import duplicate.fun.DuplicateChecker;

public class HashMapSolution implements DuplicateChecker{

	/**
	 * O(n)
	 */
	@Override
	public boolean containsDuplicate(String input) {
		Map<Character, Integer> hashmap = new HashMap<Character, Integer>();
		for(int i = 0; i < input.length(); i++) {
			char cur = input.charAt(i);
			if(hashmap.containsKey(cur)){
				return true;
			} else {
				hashmap.put(cur, 1);
			}
		}
		return false;
	}

}
