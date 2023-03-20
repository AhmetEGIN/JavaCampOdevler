package FileDemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\EGIN\\git\\repository\\JavaCamp2022\\src\\Files\\JavaFileDemo.txt");
//		 System.out.println(file.getName());
		try {
			Scanner reader = new Scanner(file);
			int m = 0;
			while (reader.hasNextLine()) {
				int index = 0;
//				if (m == 0) {
//					m += 1;
//				} 
//			 {
					List<Integer> blankIndex = new ArrayList<Integer>();
					char[] line = reader.nextLine().toCharArray();
					char control = ' ';
					for (char character : line) {
					if (m == 0) {
						m += 1;
						continue;
					} 
						if (control == character) {
							blankIndex.add(index);
						}
						index += 1;
					}
					System.out.println(blankIndex);
					
				}
//			}

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
