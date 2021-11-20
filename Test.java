package ThrowsKeyword;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader ("C:\\Users\\DELL\\Desktop\\coverletter.txt");
		
		BufferedReader bfr = new BufferedReader(fr);
		System.out.println(bfr.readLine());
		bfr.close();
	}

}
