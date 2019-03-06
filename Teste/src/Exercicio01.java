
import java.util.Scanner;

public class Exercicio01{ 
	public static double calcular (double area, double r) {
		return area = 3.1415 * r * r;
	}

    public static void main(String[] args) {
       System.out.println("Escreva o valor do raio: ");
       Scanner scan = new Scanner(System.in);
       double raio = scan.nextDouble();
       calcular(raio, raio);
       System.out.println("O valor da area é " + calcular(raio,raio));
    }
}