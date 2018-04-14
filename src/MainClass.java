import java.util.Scanner;

public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main( String[] args) {

        Scanner scan = new Scanner(System.in);
        int selector;
        int cant;
        Generador gen;


        System.out.println("Menú:\n"
                + "1. Método de Cuadrados Centrales\n"
                + "2. Método de Congruencias\n"
                + "3. Método Aditivo de Congruencias\n"
                + "4. Método multiplicativo\n"
                + "5. Método de Fibonacci\n");

        selector = scan.nextInt();

        switch (selector){
            case 1:
                int seed;
                do{
                    System.out.println("Ingrese semilla: ");
                    seed = (scan.nextInt());
                } while(String.valueOf(seed).length()!=2&&String.valueOf(seed).length()!=4);
                gen = new CuadCent(seed);
                break;
            case 2:
                gen = new Congruencias();
                break;
            case 3:
                gen = new AdCongruencias();
                break;
            case 4:
                gen = new Multiplicativo();
                break;
            case 5:
                int v1,v2,a;

                do {
                    do {
                        System.out.println("Ingrese v1: ");
                        v1 = (scan.nextInt());
                    } while(String.valueOf(v1).length()<3||String.valueOf(v1).length()>7);
                } while(!isPrime(v1));
                do {
                    do{
                        System.out.println("Ingrese v2: ");
                        v2 = (scan.nextInt());
                    } while(String.valueOf(v1).length()<3||String.valueOf(v1).length()>7);

                } while(!isPrime(v2));
                do {
                    do{
                        System.out.println("Ingrese A: ");
                        a = (scan.nextInt());
                    }while(String.valueOf(v1).length()<3||String.valueOf(v1).length()>7);

                } while(!isPrime(a));

                gen = new Fibonacci(v1,v2,a);
                break;
            default:    gen = new Fibonacci();




        }

        gen.getNext();

    }
    public static boolean isPrime(int n){
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

}