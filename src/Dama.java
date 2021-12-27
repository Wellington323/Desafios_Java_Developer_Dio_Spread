import java.util.Scanner;

public class Dama {

	static int  absoluto(int valor) {
	    if(valor > 0){
	        return valor;
	    }
	    else {
	        return -valor;
	    }
	  }

	  public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);

	    int x1,y1,x2,y2,diff1, diff2;
	    //se estiver na mesma linha ou mesma coluna ou mesma diagonal, gasta 1 movimento
	    //se estiver em qualquer outra posi��o, a rainha gastar� 2 movimentos!


	    while(true){
	      x1 = sc.nextInt();
	      y1 = sc.nextInt();
	      x2 = sc.nextInt();
	      y2 = sc.nextInt();
	      if(x1 == 0 && y1 == 0 && x2 == 0 && y2 == 0) break; //condi��o de parada
	      if( x1 == x2 && y1 == y2){
	          System.out.println("0");
	      }
	      else if(x1 == x2 || y1 == y2){
	          System.out.println("1");
	      }
	      else{
	        diff1 = absoluto(x1 - x2);
	        diff2 = absoluto(y1 - y2);

	        if(diff1 - diff2 == 0){
	            System.out.println("1");
	        }
	        else{
	            System.out.println("2");
	        }
	      }
	    }
	    sc.close();
	  }
	}