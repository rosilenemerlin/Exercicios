import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor ");
		
		double valor = sc.nextDouble();
		double porcentagem = 1.0 / 100.0;
		double valorTotal = valor + (porcentagem * valor);

		System.out.println("O valor final é: " + valorTotal);

		sc.close();

	}

}
