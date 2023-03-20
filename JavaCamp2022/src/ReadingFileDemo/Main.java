package ReadingFileDemo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = null;
		int total = 0;
		try {
			reader = new BufferedReader(new FileReader("C:\\Users\\EGIN\\git\\repository\\JavaCamp2022\\src\\ReadingFileDemo\\sayilar.txt"));
			String line = null;
			while ((line = reader.readLine()) != null) {
				total += Integer.valueOf(line);
				// bir deðeri integera döndürmek için Integer.valueOf(deðer)  kullanýlýr
				
				
			}
			System.out.println("Toplam sayý: " + total);
		
		} catch (FileNotFoundException e) {
			//FileNotFoundException -- dosyanýn bulunamamasý durumunda çalýþýr.
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			reader.close();
			// finally bloðunda dosya okuyan thread'i kapatmamýz gerekiyor.
			// Fakat buradada unhandled exception ile karþýlaþýyoruz. Çünkü bu kodun çalýþmasý için dosyanýn açýlmýþ olmasý gerekir
			// Buradaki sorunu çözmek için class'ýn yanýna throws IOException ile hata alabileceðimiz belirtilir.
			// Bu yöntem yerine bu blok içerisine de try-catch yazýlabilir
		}
		

	}

}
