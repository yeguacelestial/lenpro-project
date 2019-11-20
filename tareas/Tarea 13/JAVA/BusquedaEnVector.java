//TAREA 13
//Busqueda en Vector

import java.util.Scanner;

public class BusquedaEnVector {
    public static void main (String[] args){
        //Contador
        int cont = 0;

        //Posicion
        int pos;

        //Variable de lectura de datos
        Scanner lect = new Scanner (System.in);

        //CREACION DE VECTOR
        int[] vector;

        System.out.print("Tamaño del arreglo: ");
        int tamaño = lect.nextInt();

        if (tamaño < 0){
            System.out.print("[-]No puede ser un tamaño negativo. Saliendo...");
            System.out.println("");
            System.exit(0);
        }

        else if (tamaño == 0){
            System.out.print("[-]No puede haber una cantidad igual a 0. Saliendo..");
            System.out.println("");
            System.exit(0);
        }

        vector = new int[tamaño];

        //Secuencia iterativa para indices en el vector
        for (int i=0;i<vector.length;i++){
            System.out.print("Posicion ["+ i + "]: ");
            pos = lect.nextInt();
            vector[i] = pos;
        }

        //BÚSQUEDA DEL NÚMERO
        //Lectura
        System.out.print("Valor a buscar: ");
        int valor = lect.nextInt();

        //Recorrer vector
        for (int i=0;i<vector.length;i++){
            if (valor == vector[i]){
                cont++;
            }
        }

        //Impresion
        System.out.print("El numero " + valor + " aparece " + cont + " veces.");
        //Salto de linea
        System.out.println("");

    }
}