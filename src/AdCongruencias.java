import java.util.ArrayList;

public class AdCongruencias extends Generador {

    private ArrayList x;
    private int m;
    private int seednumber;
    private int cant;
    private int contador;

    public AdCongruencias(ArrayList xac, int seednumber){
        this.x = (ArrayList)xac.clone();
        this.contador = 0;
        this.seednumber = seednumber;
        this.m = 100;
        this.cant = 10;
    }

    public void getNext(){
        calcular();
    }

    public void calcular(){

        double rand;
        int aux=0;

        for(int i = contador;i<contador+this.seednumber;i++){
            aux = aux+(int)this.x.get(i);
        }
        aux = aux%this.m;
        this.x.add(aux);
        rand = aux/(this.m-1);
        this.cant--;
        if(!(rand==((int)this.x.get(contador+seednumber))/this.m-1)||this.cant==0){
            System.out.println(rand);
            calcular();
        }


    }
}
