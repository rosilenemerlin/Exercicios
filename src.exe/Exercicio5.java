import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite um número: ");
		int numero = sc.nextInt();
		int sucessor = numero+1;
		
		
		System.out.println("O sucessor do numero " + numero +  " é: " + sucessor);
		
		sc.close();

	}

}
