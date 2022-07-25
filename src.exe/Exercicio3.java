import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o raio do circulo: ");
		final double PI = Math.PI;
		double raio = sc.nextDouble();
		double area = PI * (raio * raio);
		double perimetro = 2* PI * raio;
		
		System.out.printf("A área do circulo é: %.2f\n" , area);
	    System.out.printf("O perimetro do circulo é: %.2f\n" , perimetro);
	    
	    sc.close();
	}

}
