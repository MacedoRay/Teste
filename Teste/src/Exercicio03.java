import java.util.Scanner;

public class Exercicio03 {
	
	private static Scanner temp_c;

	public static double calcular (double c, double f) {
		return (9*c/5)+32;
	}

	public static void main(String[] args) {
		System.out.print("Informe a temperatura em Celsius: ");
		temp_c = new Scanner(System.in);
		double c = temp_c.nextDouble();
		calcular (c,c);
		System.out.print("O equivalente em Fahrenheit é: " + calcular(c,c));

	}

}
