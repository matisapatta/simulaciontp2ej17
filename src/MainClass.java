import java.util.Scanner;

public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main( String[] args) {

        Scanner scan = new Scanner(System.in);
        int selector,V1=0,V2=4,A=4;
        Generador gen = new Generador();

        System.out.println("Menú:\n"
                + "1. Método de Cuadrados Centrales\n"
                + "2. Método de Congruencias\n"
                + "3. Método Aditivo de Congruencias\n"
                + "4. Método multiplicativo\n"
                + "5. Método de Fibonacci\n");

        selector = scan.nextInt();

        if(selector==1){
            System.out.println("Ingrese semilla: ");
            A = (scan.nextInt());
            gen.cuadcent(A);


        } else if(selector==2){
            gen= new Generador();
        } else if(selector==3){
            gen= new Generador();
        } else if(selector==4){

        } else if(selector==5){
            while(!gen.isPrime(V1)){
                System.out.println("Ingrese v1: ");
                V1 = (scan.nextInt());
            }
            while(!gen.isPrime(V2)){
                System.out.println("Ingrese v2: ");
                V2 = (scan.nextInt());
            }
            while(!gen.isPrime(A)){
                System.out.println("Ingrese A: ");
                A = (scan.nextInt());
            }
            gen.fibonacci(V1, V2, A);
        }





    }

}