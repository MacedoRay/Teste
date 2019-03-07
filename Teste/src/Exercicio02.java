import java.util.Scanner;

public class Exercicio02 {
	
	private static Scanner temp_f;

	public static double calcular (double c, double f) {
		return ((f-32)*5)/9;
	}

	public static void main(String[] args) {
		System.out.print("Informe a temperatura em Fahrenheit: ");
		temp_f = new Scanner(System.in);
		double f = temp_f.nextDouble();
		calcular (f,f);
		System.out.print("O equivalente em Celsius é: " + calcular(f,f));

	}

}
