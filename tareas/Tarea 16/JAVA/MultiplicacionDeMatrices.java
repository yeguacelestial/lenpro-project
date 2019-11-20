//MULTIPLICACION DE DOS MATRICES
import java.util.Scanner;

public class MultiplicacionDeMatrices {
    public static void main (String[] args){
        //Variable de lectura
        Scanner lect = new Scanner(System.in);

        //Variables de tamaños de matrices e iteración
        int n1,m1,n2,m2,i1,j1,i2,j2;

        //Preguntar por el tamaño de matrices
        System.out.print("MATRIZ 1 - Filas (n1): ");
        n1 = lect.nextInt();
        System.out.print("MATRIZ 1 - Columnas (m1): ");
        m1 = lect.nextInt();

        System.out.print("MATRIZ 2 - Filas (n2): ");
        n2 = lect.nextInt();
        System.out.print("MATRIZ 2 - Columnas (m2): ");
        m2 = lect.nextInt();

        //CONDICION PARA QUE SE PUEDA HACER LA MULTIPLICACION:
        //m1 = n2
        //De lo contrario, se invalida el programa

        if (m1 == n2){
            //ESTRUCTURA PRINCIPAL DEL PROGRAMA

            //Creacion de matrices
            int[][] matriz1 = new int[n1][m1];
            int[][] matriz2 = new int[n2][m2];
            int[][] matriz_resultante = new int[n1][m2];

            //Secuencia iterativa para introducir datos en matrices:
            for (i1 = 0;i1<n1;i1++){ //Filas matriz 1
                for (j1=0;j1<m1;j1++){ //Columnas matriz 1
                    System.out.print("M1 - Posicion["+i1+"]["+j1+"] = ");
                    matriz1[i1][j1] = lect.nextInt();
                }
            }

            for (i2=0;i2<n2;i2++){ //Filas matriz 2
                for (j2=0;j2<m2;j2++){ //Columnas matriz 2
                    System.out.print("M2 - Posicion["+i2+"]["+j2+"] = ");
                    matriz2[i2][j2] = lect.nextInt();
                }
            }

            //MATRIZ RESULTANTE
            for (i1=0;i1<n1;i1++){
                for (j2=0;j2<m2;j2++){
                    matriz_resultante[i1][j2] = 0;
                    for (int k=0;k<m1;k++){
                        matriz_resultante[i1][j2] += matriz1[i1][k] * matriz2[k][j2];
                    }
                }
            }

            //Impresion de matrices

            //MATRIZ 1
            System.out.println("MATRIZ 1: ");
            for (i1=0;i1<n1;i1++){
                for(j1=0;j1<m1;j1++){
                    System.out.print(matriz1[i1][j1] + " ");
                }
                System.out.println(" ");
            }
            System.out.println(" ");

            //MATRIZ 2
            System.out.println("MATRIZ 2: ");
            for (i2=0;i2<n2;i2++){
                for (j2=0;j2<m2;j2++){
                    System.out.print(matriz2[i2][j2] + " ");
                }
                System.out.println(" ");
            }
            System.out.println(" ");

            //MATRIZ RESULTANTE:
            System.out.println("MATRIZ RESULTANTE: ");
            for (i1=0;i1<n1;i1++){
                for (j2=0;j2<m2;j2++){
                    System.out.print(matriz_resultante[i1][j2] + " ");
                }
                System.out.println(" ");
            }

        }

        else {
            System.out.print("[-]Error: m1 debe ser igual a n2.");
            System.out.print("Saliendo...");
            System.out.println(" ");
            System.exit(0);
        }

    }
}