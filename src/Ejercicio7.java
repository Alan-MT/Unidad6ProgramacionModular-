public class Ejercicio7 {
    final int Filas =4, Columnas =3;
    int[][] array = new int[Filas][Columnas]; 
    public Ejercicio7(){
        llenar();
        System.out.println("Las filas par son");
        FilaPar();

    }

    public static void main(String[] args) {
        Ejercicio7 e7 = new Ejercicio7();
    }
    
    public void llenar(){
        System.out.println("Matriz 1");
        for (int i=0;i<Filas;i++){
            for (int j=0;j<Columnas;j++){
                array[i][j] = (int)(Math.random()*555+1);
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
    public void FilaPar(){
        System.out.println();
        int i = 0;
        int suma = 0 ; 
        for (i=0;i<Filas;i++){
            if (i%2==0) {
                System.out.print("\nFila "+(i+1+1));
                suma = 0;
            }
            for (int j=0;j<Columnas;j++){
                if ((1+i)%2==0) {
                System.out.print(array[i][j]+" ");
                int sumar = array[i][j];
                suma += sumar;
                }   
            }
            System.out.println();
            if ((i+1)%2==0) {
                System.out.print("La suma es "+suma);
            }
            
        }

    }
}
