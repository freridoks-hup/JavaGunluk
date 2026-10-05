import java.util.Random;
import java.util.Scanner;

public class tahmin{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		System.out.println("Merhaba! Sayı Tahmin Oyununa Hoş Geldiniz!!!");
		int hak = 10;
		int rsayı = random.nextInt(100) +1;
		System.out.println("10 deneme hakkın var!");
		for (int i = 1; i < 11; i++){
			System.out.print("Bir sayı tahmin et.");
			int tahmin = scanner.nextInt();

			if (hak != 0){
				if (tahmin == rsayı){
					System.out.println("Doğru bildin!!!");
					break;
				}
				else{
					hak--;
					System.out.println("Bir daha dene! Kalan hakkın: " + hak);
				}
			}

			else{
				System.out.println("Hakkın bitti!");
				break;
			}
		}

	}


}
