import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o lado do quadrado: ");
		double lado = sc.nextDouble();
		double calculoArea = lado * lado;
		double calculoPerimetro = 4 * lado;
		
		System.out.println("A área do quadrado é: " + calculoArea);
		System.out.println("O perimetro do quadrado é: " + calculoPerimetro);
		
        sc.close();
	}

}
