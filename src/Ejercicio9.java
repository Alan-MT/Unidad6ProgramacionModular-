import java.util.Scanner;

public class Ejercicio9 {
    final int fil = 3, col = 3;
    Scanner sca = new Scanner(System.in);

    public Ejercicio9() {
        int[][] matriz1 = new int[fil][col];
        int[][] matriz2 = new int[fil][col];
        System.out.println("matriz 1");
        llenar(matriz1);
        System.out.println("matriz 2");
        llenar(matriz2);
        imprimir(matriz1);
        imprimir(matriz2);
        int resul = sumar(matriz1, matriz2);
        System.out.println("la sumatoria de las dos matrices es "+resul);
    }

    public static void main(String[] args) {
        Ejercicio9 e9 = new Ejercicio9();
    }

    public void llenar(int[][] colu) {
        for (int i = 0; i < fil; i++) {
            System.out.println("Fila " + (i + 1));
            for (int j = 0; j < col; j++) {
                System.out.println("Columna " + (j + 1));
                System.out.println("Ingrese el numero");
                colu[i][j] = sca.nextInt();
            }
            System.out.println();
        }
    }
    public int sumar(int[][] colu1,int[][] colu2){
        int resultado = 0;
        int m1 = 0;
        int m2 = 0;
        for (int i=0;i<fil;i++){
            for (int j=0;j<col;j++){
                int suma = colu1[i][j];
                m1 += suma;
                int suma2 = colu2[i][j];
                m2 += suma2;    
            }
        }
        resultado = m2 + m1;
        return resultado;
    }
    public void imprimir(int[][] colu2){
        for (int i=0;i<fil;i++){
            for (int j=0;j<col;j++){
                System.out.print(colu2[i][j]+"+");
            }
        }
        
    }

}
