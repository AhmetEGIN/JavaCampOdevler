package StaticDemo;

public class ProductValidator {
	// araç amacý olan bir class kullanýmýnda static keywordü kullanýlýr.
	// Peki niye bütün metotlarý static yapmýyoruz:
	// bir class ý newlediðimizde onun bir örneði oluþur. Bu örneðin iþi bittiðinde bellekten atýlýr
	// Fakat static tanýmlanýnca bellekten atýlmaz
	
	// bir class ýn içerisinde hem static hem de static olmayan metotlar olabiilr
	// c# 'ta static fonksiyon çalýþtýrýldýðýnda o class'ýn constructor'ý da çalýþýr. Java'da çalýþmaz
	// Bu yüzden Java'da static constructor tanýmlanmasý gerekir.
	
	static {
		System.out.println("Static yapýcý blok çalýþtý");
	}
	public ProductValidator() {
		System.out.println("Yapýcý blok çalýþtý");
	}
	
	public static boolean isValid(Product product) {
		if (product.price > 0 && !product.name.isEmpty()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void bisey() {
		
	}
	
	
	
}
