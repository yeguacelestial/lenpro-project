import java.util.Scanner;

public class SumaDeMatrices {
    public static void main (String[] args){
        //VARIABLES DE ENTRADA
        int n, m;
        int i = 0;
        int j = 0;

        //VARIABLES DE LECTURA
        Scanner lect = new Scanner(System.in);

        System.out.print("Valor de n (filas): ");
        n = lect.nextInt();

        if (n == 0 || n < 0){
            System.out.println("[-]Error: cantidad n no valida. Saliendo...");
            System.exit(0);
        }

        System.out.print("Valor de m (columnas): ");
        m = lect.nextInt();

        if (m == 0 || m < 0){
            System.out.println("[-]Error: cantidad m no valida. Saliendo...");
            System.exit(0);
        }

        //MATRICES
        int[][] matriz1 = new int[n][m];
        int[][] matriz2 = new int[n][m];
        int[][] matriz_suma = new int[n][m];

        //CAPTURA DE VALORES

        //Matriz 1
        for (i=0;i<n;i++){
            for (j=0;j<m;j++){
                System.out.print("Matriz 1 - Posicion["+i+"]["+j+"] = ");
                matriz1[i][j] = lect.nextInt();
            }
        }

        //Matriz 2
        for (i=0;i<n;i++){
            for (j=0;j<m;j++){
                System.out.print("Matriz 2 - Posicion["+i+"]["+j+"] = ");
                matriz2[i][j] = lect.nextInt();
            }
        }

        //Suma de ambas matrices
        for (i=0;i<n;i++){
            for (j=0;j<m;j++){
                matriz_suma[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        //Impresion de matrices y suma
        System.out.println(" ");
        System.out.println("**RESULTADOS**:");
        //Impresion de matriz 1
        System.out.println("MATRIZ 1: ");
        for (i=0;i<n;i++){
            for (j=0;j<m;j++){
                System.out.print(matriz1[i][j] + " ");
            }
            System.out.println(" ");
        }

        System.out.println(" ");

        //Impresion de matriz 2
        System.out.println("MATRIZ 2: ");
        for (i=0;i<n;i++){
            for (j=0; j<m; j++){
                System.out.print(matriz2[i][j] + " ");
            }
            System.out.println(" ");
        }

        System.out.println(" ");

        //Impresion de matriz suma
        System.out.println("SUMA DE AMBAS MATRICES: ");
        for (i=0;i<n;i++){
            for (j=0; j<m; j++){
                System.out.print(matriz_suma[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}