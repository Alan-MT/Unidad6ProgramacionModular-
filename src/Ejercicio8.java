import java.util.Scanner;

public class Ejercicio8 {


    public Ejercicio8(){
        String [] num1 = new String[5];
        String [] num2 = new String[5];
        System.out.println("ingrese la primera lista");
        llenar(num1);
        System.out.println("ingrese la segunda lista");
        llenar(num2);
        Comparacion(num1,num2);
    }



    public static void main(String[] args) {
        Ejercicio8 e8 = new Ejercicio8();
    }

    public void llenar(String[] llenar){
        Scanner sca = new Scanner(System.in);
        for(int i = 0; i < llenar.length; i++){
            System.out.println("Ingrese la palabra "+(i+1));
           llenar[i] = sca.nextLine();
        }
    }
    private void Comparacion(String[] num1, String[] num2) {
        int compa1 = 0;
        int compa2 = 0;
        System.out.println();
        for (int i = 0; i < num2.length; i++) {
            System.out.println("indice "+(1+i));
            String m = num1[i];
            compa1 = m.length();
            String n = num2[i];
            compa2 = n.length();
            System.out.println("Tamaño "+compa1);
            if(compa1 == compa2){
                System.out.println("Son iguales");

            }else{
                System.out.println("no son iguales");
            }
        }
    }
    
}
