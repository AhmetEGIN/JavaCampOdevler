package AbstractClasses;

public class Main {

	public static void main(String[] args) {
		// abstract sýnýflar asla newlenemez !!!
		GameCalculator calculators = new WomanGameCalculator();
		calculators.hesapla();
		 

	}

}
