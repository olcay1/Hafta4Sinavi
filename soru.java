import java.util.Random;

public class soru {

	public static void main(String[] args) {

		Random rnd = new Random();
		int islemSayisi = rnd.nextInt(5);

		Faktoriyel faktoriyel = new Faktoriyel();
		Fonksiyon fonksiyon = new Fonksiyon();
		// islemTuru = 0;
		System.out.println("iþlem sayýsý="+ islemSayisi);

		for (int i = 0; i < islemSayisi; i++) {
			int islemTuru = rnd.nextInt(2);
			System.out.println("iþlem türü="+islemTuru);
			switch (islemTuru) {
			case 0:

				int sayi1 = rnd.nextInt(10);
				int sonuc1 = faktoriyel.faktoriyelAl(sayi1);
				System.out.println(sayi1 + " Faktoriyel=" + sonuc1);

				break;

			case 1:
				int sayi2 = rnd.nextInt(10);
				int sonuc2 = fonksiyon.fonksiyonAl(sayi2);
				System.out.println(sayi2 + " Fonksiyon=" + sonuc2);

				break;

			default:
				break;
			}
		}
	}

}
