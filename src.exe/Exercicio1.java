import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		double base = sc.nextDouble();
		double altura = sc.nextDouble();
		double area = base * altura;
		double perimetro = (2 * base) + (2 * altura);
		
		System.out.println("A área do retângulo é : " + area);
		System.out.println("O perimetro do retângulo é: " + perimetro);
		
		sc.close();
		

	}

}
