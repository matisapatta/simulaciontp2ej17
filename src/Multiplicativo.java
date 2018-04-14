public class Multiplicativo extends Generador {

    private double a;
    private double m;
    private double x;
    private int cant;

    public Multiplicativo(double x){
        this.a = 15;
        this.m = 100;
        this.x = x;
    }


    public void getNext(){
        for(int i=0;i<m-1;i++){
            calcular(this.x);
        }
    }

    public void calcular(double x){
        double x1;
        double rand;
        x1 = ((this.a*x))%m;
        rand = x1/(this.m-1);
        System.out.println(rand);
    }
}
