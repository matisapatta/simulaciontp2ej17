public class Congruencias extends Generador {

    private double a;
    private double c;
    private double m;
    private double x;
    private int cant;


    public Congruencias(double x, int cant, double a, double c, double m){
        this.a = a;
        this.c = c;
        this.m = m;
        this.x = x;
        this.cant = cant;

    }

    public void getNext(){
        calcular(this.x);
    }

    public void calcular(double x){
        double x1;
        double rand;

        x1 = ((this.a*x)+this.c)%m;
        rand = x1/this.m;
        if(!(rand==x/this.m||this.cant==0)){
            cant--;
            System.out.println(rand);
            calcular(x1);
        }
        if(cant!=0){
            System.out.println("No se ha podido cumplir la cantidad porque se cumplió el ciclo primero");
            cant = 0;
        }


    }
}
