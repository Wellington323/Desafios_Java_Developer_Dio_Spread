import java.util.Scanner;

public class TrigoNoTabuleiro {

	public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);

	     int n = sc.nextInt();
	      for(int i=0 ; i<n ; i++) {
	        int x = sc.nextInt();
	        double valor = (Math.pow(2, x) / 12000);
	        long parteInteira = (long) valor;
	        System.out.println(parteInteira +" kg\n");   //Complete o código aqui.
	        sc.nextLine();
	      }
	      sc.close();
	  }
	}