public class Congruencias extends Generador {

    private double a;
    private double c;
    private double m;
    private double x;
    private int cant;
    private double max;

    public Congruencias(double x){
        this.a = 15;
        this.c = 10;
        this.m = 100;
        this.x = x;
        this.max = 10;

    }

    public void getNext(){
        calcular(this.x);
    }

    public void calcular(double x){
        double x1;
        double rand;
        this.max--;
        x1 = ((this.a*x)+this.c)%m;
        rand = x1/this.m;
        if(!(rand==x/this.m||this.max==0)){
            System.out.println(rand);
            calcular(x1);
        }

    }
}
