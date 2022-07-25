import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o raio: ");
		double raio = sc.nextDouble();
		System.out.println("Digite a altura: ");
		double altura = sc.nextDouble();

		double volume = 3.14159;
		double volTotal = volume * raio * altura;
		
		System.out.printf("O volume da lata de óleo é: %.2f\n " , volTotal);

		
		sc.close();
	}

}
