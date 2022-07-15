import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		double n1, n2, n3;
		double r1, r2, r3;
		double somaN = 0;
		double somaR = 0;
		double mediaN;
		double mediaR;
		
		System.out.println("Digite notas 1");
		n1 = sc.nextDouble();
		n2 = sc.nextDouble();
		n3 = sc.nextDouble();
		somaN = n1 + n2 + n3;
		mediaN = somaN / 3;
		
		System.out.println("Digite notas 2 ");
		r1 = sc.nextDouble();
		r2 = sc.nextDouble();
		r3 = sc.nextDouble();
		somaR = r1 + r2 + r3;
		mediaR = somaR / 3;
		
		
		System.out.printf("A media aritmetica de N é : %.2f\n" , mediaN);
		System.out.printf("A media aritmetica de R é: %.2f\n" , mediaR);
		System.out.printf("A Soma das Medias são : %.2f\n" , (mediaR + mediaN));
		System.out.printf("A Média da média é : %.2f\n" , (mediaR + mediaN)/ 6 );
		
		sc.close();
		
	}

}
