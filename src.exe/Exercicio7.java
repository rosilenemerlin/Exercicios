import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite sua idade em dias: ");
		int idade = sc.nextInt();
		
		int ano = idade / 365;
		int mes = (idade % 365 ) / 30 ;
		int totalDia = (idade % 365) % 30;
		
		
		System.out.println("Tem: " + ano + " anos " + mes + " meses " + totalDia + " dias. ");
		
		
		sc.close();

	}

}
