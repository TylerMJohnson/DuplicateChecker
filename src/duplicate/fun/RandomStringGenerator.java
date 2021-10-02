package duplicate.fun;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Random;

/**
 * Generates a Strings.txt file with random lower case letters 
 */
public class RandomStringGenerator {

	public static void main(String[] args) throws IOException {
		File fout = new File("Strings.txt");
		FileOutputStream fos = new FileOutputStream(fout);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
		Random r = new Random();
		StringBuilder sb = new StringBuilder();
		int high = 122;
		int low = 97; //a = 97 z = 122 
		for(int count = 0; count < 1000; count++) { //1000 lines of random strings
			for(int i = 0; i < 8; i++) { //8 is the length of the string
				sb.append((char) (r.nextInt(high-low) + low));
			}
			bw.write(sb.toString());
			bw.newLine();
			sb.setLength(0);
		}
		bw.close();
	}

}
