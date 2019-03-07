
import java.util.Scanner;

public class Exercicio01{ 
	private static Scanner entrada;

	public static double calcular (double area, double r) {
		return area = 3.1415 * r * r;
	}

    public static void main(String[] args) {
       System.out.print("Escreva o valor do raio: ");
       entrada = new Scanner(System.in);
       double r = entrada.nextDouble();
       calcular(r, r);
       System.out.println("O valor da area é " + calcular(r, r));
    }
}