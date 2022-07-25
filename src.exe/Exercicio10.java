import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite um numero menor que 32: ");
		int numero = sc.nextInt();
		
		if(numero < 32) {
		String result =	Integer.toBinaryString(numero);
		System.out.println("O binário é: " + result);
		}else {
		System.out.println("Numero digitado maior que 32!");
		}
		
		sc.close();

	}

}
