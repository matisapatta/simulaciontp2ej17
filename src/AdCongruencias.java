import java.util.ArrayList;

public class AdCongruencias extends Generador {

    private ArrayList x;
    private int m;
    private int seednumber;
    private int cant;
    private int contador;

    public AdCongruencias(ArrayList xac, int seednumber, int cant){
        this.x = (ArrayList)xac.clone();
        this.contador = 0;
        this.seednumber = seednumber;
        this.m = 100;
        this.cant = seednumber;
    }

    public void getNext(){
        calcular();
    }

    public void calcular(){

        double rand;
        int aux=0;
        aux = (int)x.get(contador)+(int)x.get(seednumber-1+contador);
        contador++;
        aux = aux%this.m;
        this.x.add(aux);
        rand = (double)aux/(this.m-1);

        if(this.cant!=0){
            this.cant--;
            System.out.println(rand);
            calcular();
        }
        if(cant!=0){
            System.out.println("No se ha podido cumplir la cantidad porque se cumplió el ciclo primero");
            cant = 0;
        }


    }
}
