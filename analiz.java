import java.util.Scanner;
import java.io.File;
import java.io.FileReader;

public class analiz{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Hangi dosyayı okumak istersiniz");
		String dosyaadı = scanner.nextLine();
		File dosya = new File(dosyaadı);
		// if de dosya. için komuta baktım aklımda kalmamış daha ilk kez gördüm diye.
		if (dosya.exists() == true){
			if (dosya.isFile() == true){
				// yine kodlara baktım hafızam'da tam kayıt olmamışlar.
				String ad = dosya.getName();
				long boyut = dosya.length();
				System.out.println("Dosya ismi: " + ad + "| Dosya boyutu: " + boyut); 
			}
			else if(dosya.isDirectory() == true){
				System.out.println("Bu bir dosya değil, dizin.");
			}

		}
		else{
			System.out.println("Böyle bir dosya bulunamadı. Bir daha deneyiniz.");
		}



	}





}
