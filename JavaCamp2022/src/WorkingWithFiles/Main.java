package WorkingWithFiles;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		createFile();
//		getFileInfo();
		// Dosya iþlemleri için Buffered kullanýlabilir. Buffered dosyayý belleðe
		// taþýyarak iþlem yapar.
		// File class'ý ise doðrudan dosya üzerinden iþlem yapar
		readFile();
		System.out.println("--------");
		writeFile();
		System.out.println("--------");
		readFile();
	}

	public static void createFile() {
		File file = new File("C:\\Users\\EGIN\\git\\repository\\JavaCamp2022\\src\\Files\\students.txt");
		// olan bir dosyanýn yolunu gösterip o dosyayý okuyabildiðimiz gibi, yeni bir
		// dosya da oluþturabiliriz

		try {
			if (!file.exists()) {
				file.createNewFile();
				System.out.println("Dosya oluþturuldu");
			} else {
				System.out.println("Dosya zaten mevcut");
			}
		} catch (Exception e) {
			e.printStackTrace(); // hata mesajýný yazdýrýr
			System.out.println(e.getMessage()); // sadece mesajý yazdýrýr
		}
	}

	public static void getFileInfo() {
		File file = new File("C:\\Users\\EGIN\\git\\repository\\JavaCamp2022\\src\\Files\\students.txt");
		if (file.exists()) {
			System.out.println("Dosya adý : " + file.getName()); // dosya adýný verir
			System.out.println("Dosya yolu: " + file.getPath());
			System.out.println("Dosya yolu: " + file.getAbsolutePath());
			System.out.println("Dosya yazýlabilir mi :" + file.canWrite());
			System.out.println("Dosya okunabilir mi :" + file.canRead());
			System.out.println("Dosya boyutu(byte): " + file.length());
			// System.out.println("Dosya boyutu(byte): " + file.getTotalSpace());

		}
	}

	public static void readFile() {
		File file = new File("C:\\Users\\EGIN\\git\\repository\\JavaCamp2022\\src\\Files\\students.txt");
		try {
			// Scanner class'ý sayesinde dosyayý okuyabiliriz
			Scanner reader = new Scanner(file);
			while(reader.hasNextLine()) {
				// bir sonraki satýrý okuyabildiði sürece devam eder
				char[] line = reader.nextLine().toCharArray();
				for(char karakter : line) {
					String control = " ";
					if (control.charAt(0) == karakter) {
						System.out.println("askl");
						
					}
				}
				
			}
			// Ýþlemlerimiz bittikten sonra dosyayý kapatmalýyýz
			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();  // dosya olmazsa kontrol altýna almak için kullanýlan catch bloðu

		}

	}
	
	public static void writeFile() {
		try {
			// Dosyaya yazmak için FileWriter class'ýna ihtiyacýmýz var
			BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\EGIN\\git\\repository\\JavaCamp2022\\src\\Files\\students.txt",true));
			// filewriter 'ýn sonuna append kýsmýna true eklersek dosyanýn üzerine yazar. Eðer yazmazsak dosya içerisindeki veriler kaybolur
			writer.newLine();  // yeni satýr oluþturur
			writer.write("Salih");
			System.out.println("Dosyaya yazýldý");
			writer.close();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
