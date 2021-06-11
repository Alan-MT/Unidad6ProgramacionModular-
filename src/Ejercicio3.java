import java.util.Scanner;

public class Ejercicio3 {
    int [] arreglo = new int[8];
    Scanner sca = new Scanner(System.in);

    public Ejercicio3(){
        llenar(arreglo);
        System.out.print("\nIngresa el numero que desee buscar: ");
        int buscar = sca.nextInt();
        boolean dc = buscar(buscar);
        if (dc == true) {
            System.out.println("El numero fue encontrado");
        }else {
            System.out.println("Este numero no esta en el listado");
        }
        
    }

    public static void main(String[] args) {
        Ejercicio3 e3 = new Ejercicio3();
    } 
    
    public void llenar(int[] llenar){
        for(int i = 0; i < llenar.length; i++){
            System.out.print("Ingrese el numero "+(i+1)+"; ");
            llenar[i] = sca.nextInt();
        }

    }

    public boolean buscar(int num){
        boolean busca=false;
        for(int i = 0; i<arreglo.length;i++){
            if (num == arreglo[i]) {
                busca = true;
                break;
            } 
        }
        return busca;
    }
}
