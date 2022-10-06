package Overriding;

public class Main {

	public static void main(String[] args) {
		BaseKrediManager[] krediManagers = new BaseKrediManager[] { new OgretmenKrediManager(), new TarimKrediManager(),
				new OgrenciKrediManager() };

		for (BaseKrediManager kredi : krediManagers) {
			System.out.println(kredi.hesapla(10000));
		}

	}

}
