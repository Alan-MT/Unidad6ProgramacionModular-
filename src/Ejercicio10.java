import java.util.Scanner;

public class Ejercicio10 {
    Scanner sca = new Scanner(System.in);
    public Ejercicio10(){
        int[][] matriz = new int[3][4];
        int[][] matrizT = new int[matriz[0].length][matriz.length];
        llenar(matriz);
        tranpuesta(matriz, matrizT);
        imprimir(matriz, matrizT);
    }

    public static void main(String[] args) {
        Ejercicio10 e10 = new Ejercicio10();
    }

    public void llenar(int[][] colu) {
        for (int i = 0; i < colu.length; i++) {
            System.out.println("Fila " + (i + 1));
            for (int j = 0; j < colu[i].length;j++) {
                System.out.println("Columna " + (j + 1));
                System.out.println("Ingrese el numero");
                colu[i][j] = sca.nextInt();
            }
            System.out.println();
        }
    }

    public void tranpuesta(int[][] colu,int[][] colu2){
        for (int i=0; i < colu.length; i++) {
            for (int j=0; j < colu[i].length; j++) {
              colu2[j][i] = colu[i][j];
            }
          }
    }
     public void imprimir(int[][] colu,int[][] colu2){
        int colCountMatrizA = colu[0].length;
        for (int x1 = 0, x2 = 0; x1 < colu.length || x2 < colu2.length; x1++, x2++) {
            if (x1 < colu.length) {
                System.out.print("|");
                for (int y1 = 0; y1 < colu[x1].length; y1++) {
                    System.out.print(colu[x1][y1]);
                    if (y1 != colu[x1].length - 1) {
                        System.out.print("\t");
                    }
                }
                System.out.print("|");
            } else {
                for (int i = 0; i < colCountMatrizA - 1; i++) {
                    System.out.print("\t");
                }
            }
            if (x2 < colu2.length) {
                System.out.print("\t\t|");
                for (int y2 = 0; y2 < colu2[x2].length; y2++) {
                    System.out.print(colu2[x2][y2]);
                    if (y2 != colu2[x2].length - 1) {
                        System.out.print("\t");
                    }
                }
                System.out.println("|");
            }
        }
     }
}
