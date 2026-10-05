import java.util.Scanner;

public class deneme{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("İlk sayınızı giriniz.");
		int sayibir = scanner.nextInt();
		System.out.print("İkinci sayınızı giriniz");
		int sayiiki = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Hangi işlem olsun '+,-,*,/'");
		String işlem = scanner.nextLine();
		if (işlem.equals("+")){
			System.out.println("Sonuç =" + (sayibir + sayiiki));
		}
		else if (işlem.equals("-")){
			System.out.println("Sonuç =" + (sayibir - sayiiki));
		}
		else if (işlem.equals("*")){
			System.out.println("Sonuç =" + (sayibir * sayiiki));
		}
		else if (işlem.equals("/")){
			if (sayiiki == 0){
				System.out.println("İkinci sayı ya '0' diyemezsiniz.");
			}
			else{
				System.out.println("Sonuç =" + (sayibir / sayiiki));
			}
		}

		scanner.close();
	} 
}
