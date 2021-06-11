public class Ejercicio6 {
    int[][] matriz = new int[3][3];
    
    public Ejercicio6(){
        inicializar(matriz);
        multiplicar(matriz);

    }

    public static void main(String[] args) {
        Ejercicio6 e6 = new Ejercicio6();
    }
    public void multiplicar(int[][] matriz){
        System.out.println("Matriz multiplicada por 2");
        for (int i=0;i<matriz.length;i++){
            for (int j=0;j<matriz.length;j++){
                matriz[i][j]*=2;
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }

    }

    public void inicializar(int[][] matriz){
        matriz[0][0]= 5;
        matriz[0][1]= 6;
        matriz[0][2]= 13;
        matriz[1][0]= 14;
        matriz[1][1]= 2;
        matriz[1][2]= 4;
        matriz[2][0]= 21;
        matriz[2][1]= 7;
        matriz[2][2]= 6;
        System.out.println("Matriz 1");
        for (int i=0;i<matriz.length;i++){
            for (int j=0;j<matriz.length;j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }

    }
    
}
