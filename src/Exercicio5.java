import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		double salarioMinimo = 0;
		double salarioUsuario = 0;
		
		System.out.println("insira o valor do sal�rio minimo ");
		salarioMinimo = sc.nextDouble();
		
		System.out.println("Insira o valor do sal�rio do usu�rio ");
		salarioUsuario = sc.nextDouble();
		
		int total = (int) (salarioUsuario / salarioMinimo);
		System.out.println(" Ganha " + total + "sm" + " = " + salarioMinimo);
		
		sc.close();

	}

}