import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a temperatura: ");
		double temperatura = sc.nextDouble();
		double c = (temperatura - 32) * 5 / 9;
		
		System.out.printf("A temperatura é de: %.3f\n " , c );
		
		
		sc.close();

	}

}
