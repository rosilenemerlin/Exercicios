import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite os lados do triângulo: ");
		double lado1 = sc.nextDouble();
		double lado2 = sc.nextDouble();
		double lado3 = sc.nextDouble();
		double perimetro = lado1 + lado2 + lado3;
		
		System.out.println("O perimetro do retângulo é: " + perimetro);
		
		sc.close();

	}

}
