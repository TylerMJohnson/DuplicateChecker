package duplicate.fun.impl;

import java.util.Arrays;

import duplicate.fun.DuplicateChecker;

public class SortFirstSolution implements DuplicateChecker{

	@Override
	public boolean containsDuplicate(String input) {
	    char[] chars = input.toCharArray();
	    Arrays.sort(chars);
		for(int i = 1; i < chars.length; i++) {
			if(chars[i - 1] == chars[i]){
				return true;
			}
		}
		return false;
	}

}
