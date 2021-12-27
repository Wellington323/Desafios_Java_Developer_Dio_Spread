import java.util.Scanner;

public class FusoHorario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int horasaida = sc.nextInt();
    int tempoviagem = sc.nextInt();
    int fuso = sc.nextInt();

    //Escreva a sua lógica aqui
    int ajuste = horasaida + tempoviagem + fuso;
    if(ajuste > 24){
        ajuste = ajuste - 24;
    }
    else if( ajuste < 0 ){
        ajuste = 24 + ajuste;
    }
    
    System.out.println(ajuste);

    sc.close();
	}
}