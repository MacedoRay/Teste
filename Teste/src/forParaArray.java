import java.util.Scanner;

	public class forParaArray {
		public static void main(String[] args){
			int[] numero = new int[5];
			int soma=0;
			for(int cont=0 ; cont< numero.length ; cont++){
				System.out.print("Entre com o número "+(cont+1)+": ");
				numero[cont]=new Scanner(System.in).nextInt();
			}
			for(int cont : numero){
				soma += cont;
			}
			System.out.println("A soma dos números que você digitou é "+soma);
		}
}