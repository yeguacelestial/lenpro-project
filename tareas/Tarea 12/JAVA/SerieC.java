/*
    Serie C:
    2, -3, -5, -7, 4, 6, -9, -11, -13, 8, 10, 12, -15, -17, -19, 14
 */

import java.util.Scanner;

public class SerieC {
    public static void main(String[] args){
        //VARIABLES
        int i, n;
        int valor_pos = 2;
        int valor_neg = -3;
        int valor = 0;
        int cont_pos = 0;
        int cont_principal = 0;
        Scanner lect = new Scanner(System.in);

        //ENTRADA
        System.out.print("Valor de n: ");
        n = lect.nextInt();

        //Secuencia iterativa principal
        for (i=0;i<n;i++){

            //Contador números par positivos:
            if (valor_pos%2 == 0){
                //Contador - imprimir numeros positivos 1 vez con incremento de 1
                for (int pos = 0; pos <= cont_pos; pos++){
                    valor = valor_pos;
                    if (cont_principal == n-1){
                        System.out.print(valor + ". \n");
                        System.exit(0);
                    }
                    System.out.print(valor + ", ");
                    valor_pos += 2;
                    cont_principal++;
                }

                cont_pos++;
            }

            //Contador números impar negativos:
            if (valor_neg%2 != 0){
                //Contador - imprimir numeros negativos 3 veces
                for (int neg = 0; neg < 3; neg++){
                    valor = valor_neg;
                    if (cont_principal == n-1){
                        System.out.print(valor + ". \n");
                        System.exit(0);
                    }
                    System.out.print(valor + ", ");
                    valor_neg -= 2;
                    cont_principal++;
                }
            }

        } //FIN SECUENCIA ITERATIVA PRINCIPAL

        //Salto de línea final
        System.out.println(" ");

    }
}