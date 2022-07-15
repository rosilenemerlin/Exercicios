
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int ano = sc.nextInt();
		int mes = sc.nextInt();
		int dia = sc.nextInt();

		int dias = 30 - dia;
		int mesTotal = 30 * mes;
		int totalDia = (ano * 365) + mesTotal + dia;

		System.out.println(ano + " Ano," + mes + " Meses, " + dias + " Dias, " + totalDia + " Dias.");

		sc.close();
	}

}
