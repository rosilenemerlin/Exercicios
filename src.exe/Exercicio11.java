import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite a nota da prova 1 e prova 2 do primeiro bimestre: ");
		double nota1 = sc.nextDouble();
		double nota2 = sc.nextDouble();
		
		System.out.println("Digite a nota da prova 1 e prova 2 do segundo bimestre: ");
		double notas1 = sc.nextDouble();
		double notas2 = sc.nextDouble();
		double media = (nota1 + nota2 + notas1 + notas2) / 4;
		
		System.out.println("A nota semestral do aluno é: " + media);
				
				
		sc.close();

	}

}
