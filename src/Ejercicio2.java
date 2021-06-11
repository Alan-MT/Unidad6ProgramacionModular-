public class Ejercicio2{

    int[] ale = new int[10];

    public Ejercicio2(){
        llenar(ale);
        imprimir(ale);
        int numeroM = Mayor(ale);
        System.out.println("El numero mayor es: " +numeroM);
        int conta = repetidos(ale, numeroM);
        System.out.println("los numero repetidos son "+conta);
    }

    public static void main(String[] args) {
        Ejercicio2 e2 = new Ejercicio2();
    }
    public void llenar(int[] enteros){
        for(int i = 0; i < ale.length; i++){
            ale[i] = (int)(Math.random()*99);
        }

    }
    public void imprimir(int[]enteros){
        for(int i = 0; i < ale.length; i++)
        System.out.println(ale[i]);
    }

    public int Mayor(int[] enteros){
        int mayor = 0;
        for(int i = 0; i < enteros.length; i++){
            if (enteros[i]>mayor) {
                mayor = enteros[i];  
            }   
        }
        return mayor;
    }

    public int repetidos(int[] enteros, int repi){
        int repetidos = 0;
        for(int i = 0;i<ale.length; i++ ){
            if (repi == enteros[i]) {
                repetidos++;
            }
        }
        return repetidos;
        
    }

}