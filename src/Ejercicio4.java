public class Ejercicio4 {

    int[] ale = new int[10];

    public Ejercicio4(){
        llenar(ale);
        imprimir(ale);
        int numeroM = Mayor(ale);
        System.out.println("El numero mayor es: " +numeroM);
        diferencia(numeroM, ale);

    }

    public static void main(String[] args) {
        Ejercicio4 e4 = new Ejercicio4();
    }
    public void llenar(int[] enteros){
        for(int i = 0; i < ale.length; i++){
            ale[i] = (int)(Math.random()*50);
        }

    }
    public void imprimir(int[]enteros){
        for(int i = 0; i < ale.length; i++)
        System.out.print(ale[i]+",");
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

    public void diferencia(int entero, int[] arr){
        int dife = 0;
        for (int i = 0; i < arr.length; i++) {
            dife = entero - arr[i]; 
            System.out.println("la diferencia entre "+entero+" y "+arr[i]+" es "+dife);
        }
    }
}
