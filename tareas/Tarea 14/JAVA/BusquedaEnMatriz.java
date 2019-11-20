
import java.util.Scanner;

public class BusquedaEnMatriz {
    public static void main (String[] args){
        //VARIABLES
        int elemento,in,im;
        int contador = 0;
        Scanner lect = new Scanner(System.in);

        //Filas
        int n;

        //Columnas
        int m;

        //Pedir n (filas)
        System.out.print("Tamaño de n: ");
        n = lect.nextInt();

        if (n==0 || n<0){
            System.out.print("[-]Valor de n no valido. Saliendo...");
            System.out.println("");
            System.exit(0);
        }

        //Pedir m (columnas)
        System.out.print("Tamaño de m: ");
        m = lect.nextInt();

        if (m==0 || m<0){
            System.out.print("[-]Valor de m no valido. Saliendo...");
            System.out.println("");
            System.exit(0);
        }

        //Creacion de vector
        int[][] vector = new int[n][m];

        //Entrada de arreglos
        //Filas
        for (in=0;in<n;in++){
            //Columnas
            for (im=0;im<m;im++){
                System.out.print("Posicion["+in+"]["+im+"]: ");
                vector[in][im] = lect.nextInt();
            }
        }

        //IMPRESION DE INDICES EN EL ARREGLO
        for (in=0;in<n;in++){
            for (im=0;im<m;im++){
                System.out.print(vector[in][im] + ", ");
            }
            //Salto de linea al acabar una fila
            System.out.println("");
        }
        System.out.println("");

        //Numero a comparar
        System.out.print("Elemento a buscar: ");
        elemento = lect.nextInt();

        for (in=0;in<n;in++){
            for (im=0;im<m;im++){
                if (vector[in][im] == elemento){
                    contador++;
                }
            }
        }

        System.out.print("El elemento " + elemento + " aparece " + contador + " veces.");
        System.out.println("");
    }
}