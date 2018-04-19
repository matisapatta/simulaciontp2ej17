public class Multiplicativo extends Generador {

    private double a;
    private double m;
    private double x;
    private int cant;

    public Multiplicativo(double x, int cant){
        this.a = 15;
        this.m = 100;
        this.x = x;
        this.cant = cant;
    }


    public void getNext(){
        calcular(this.x);
    }

    public void calcular(double x){
        double x1;
        double rand;
        x1 = ((this.a*x))%m;
        rand = x1/this.m;
        if(!(rand==x/this.m||this.cant==0)){
            this.cant--;
            System.out.println(rand);
            calcular(x1);
        }

    }
}
