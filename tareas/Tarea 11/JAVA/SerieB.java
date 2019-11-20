/* 
	Serie B:
	-1, 2, 2, -3, 4, 4, 4, -5, 6, 6, 6, 6, -7...
*/
import java.util.Scanner;

public class SerieB {
	public static void main(String[] args){
		//VARIABLES INICIALES
		int val_neg = -1; //Contador de valores negativos
		int val_pos = 2; //Contador de valores positivos
		int n; //Valor de entrada
		int cont_principal = 0; //Contador principal
		int cont_pos = 3; //Contador numeros positivos
		int valor; //Valor a imprimir
		int cantidad_pos; //Cantidad de veces a repetir

		//Variable de lectura
		Scanner lect = new Scanner(System.in);

		//Pedir n
		System.out.print("Valor de n: ");
		n = lect.nextInt();

		//Secuencia iterativa principal
		for (int i=0; i<n; i++){
			//Numeros impares negativos
			if (val_neg%2 != 0){
				valor = val_neg;
				if (i==n-1){
					System.out.print(valor + ".\n");
					System.exit(0);
				}
				System.out.print(valor + ", ");
				val_neg -= 2;
				cont_principal++;
			}

			//Numeros pares positivos
			if (val_pos%2 == 0){
				for (cantidad_pos = 0; cantidad_pos < cont_pos; cantidad_pos++){
						//El valor se repite antes de aumentar
						for (int in = 0; in < cont_pos; in++){
							valor = val_pos;
							
							if (in == cont_pos-1){
								valor = val_neg;
								val_neg -= 2;
							}

							//Si el contador principal llega a ser n, el programa finaliza.
							if (cont_principal == n-1){
								System.out.print(valor + ".\n");
								System.exit(0);
							}

							System.out.print(valor + ", ");
							cont_principal++;
						}

						//Aumentar dos unidades del valor
						val_pos+=2;
						cont_pos++;
				}
			}//Fin Numeros pares positivos
			
		}
	}
}
