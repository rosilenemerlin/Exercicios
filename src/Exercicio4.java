import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite o código da peça 1 " );
		int codigo1 = sc.nextInt();
		double valor1 = sc.nextDouble();
		int quantidade1 = sc.nextInt();
		
		System.out.println("Digite o código da peça 2 ");
		int codigo2 = sc.nextInt();
		double valor2 = sc.nextDouble();
		int quantidade2 = sc.nextInt();
		
		double valorTotal = ((valor1 * quantidade1) + (valor2 * quantidade2));
		double valorIpi = ((valorTotal * 35) / 100);
		double valorFinal =  valorIpi + valorTotal;
				
		System.out.println("O valor total é de: " + valorFinal);
		sc.close();

	} 

}
