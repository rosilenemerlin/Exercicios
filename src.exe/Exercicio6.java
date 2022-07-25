import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o valor do dividendo: ");
		int num1 = sc.nextInt();
		System.out.println("Digite o valor do divisor: ");
		int num2 = sc.nextInt();
		
		int quociente = num1 / num2;
		int resto = num1 % num2;
		
		System.out.println("O quociente de é " + quociente);
		System.out.println("O resto da divisão é " + resto);
		
		
		sc.close();

	}

}
