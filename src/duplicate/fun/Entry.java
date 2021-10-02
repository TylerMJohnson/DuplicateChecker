package duplicate.fun;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

import duplicate.fun.impl.FunSolution;
import duplicate.fun.impl.HashMapSolution;
import duplicate.fun.impl.HashSetSolution;
import duplicate.fun.impl.HashSetSolutionTwo;
import duplicate.fun.impl.SortFirstSolution;

/**
 * Could write a series of JUnit Tests in the future...
 */
public class Entry {
	
	public static void main(String[] args) {
		/**
		DuplicateChecker fs = new FunSolution();
		try (Stream<String> stream = Files.lines(Paths.get("Strings.txt"))) {
			stream.forEach(s -> {
				System.out.println("Is there a duplicate in " + s + " ? " + (fs.checkString(s) ?  "Yes" : "No"));
			});
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		**/
		
		String first = "abcdefghijklmnopqrstuvwxyz";
		String second = "aabcdefghijklmnopqrstuvwxyz";
		
		DuplicateChecker fs = new FunSolution();
		System.out.println(fs.getClass());
		System.out.println(fs.containsDuplicate(first));
		System.out.println(fs.containsDuplicate(second));
		
		DuplicateChecker hms = new HashMapSolution();
		System.out.println(hms.getClass());
		System.out.println(hms.containsDuplicate(first));
		System.out.println(hms.containsDuplicate(second));
		
		DuplicateChecker hss = new HashSetSolution();
		System.out.println(hss.getClass());
		System.out.println(hss.containsDuplicate(first));
		System.out.println(hss.containsDuplicate(second));
		
		DuplicateChecker hsst = new HashSetSolutionTwo();
		System.out.println(hsst.getClass());
		System.out.println(hsst.containsDuplicate(first));
		System.out.println(hsst.containsDuplicate(second));
		
		DuplicateChecker sfs = new SortFirstSolution();
		System.out.println(sfs.getClass());
		System.out.println(sfs.containsDuplicate(first));
		System.out.println(sfs.containsDuplicate(second));
	}
}
