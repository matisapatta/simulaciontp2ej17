public class Multiplicativo extends Generador {

    private double a;
    private double m;
    private double x;
    private int cant;
    private double max;

    public Multiplicativo(double x){
        this.a = 15;
        this.m = 100;
        this.max = m-1;
        this.x = x;
    }


    public void getNext(){
        calcular(this.x);
    }

    public void calcular(double x){
        double x1;
        double rand;
        this.max--;
        x1 = ((this.a*x))%m;
        rand = x1/this.m;
        if(!(rand==x/this.m||this.max==0)){
            System.out.println(rand);
            calcular(x1);
        }

    }
}
