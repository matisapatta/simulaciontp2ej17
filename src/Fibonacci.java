public class Fibonacci extends Generador {

    private int v1,v2,a;

    public Fibonacci(){
        this.v1 = 0;
        this.v2 = 0;
        this.a = 0;
    }

    public Fibonacci(int v1, int v2,int a){
        this.v1 = v1;
        this.v2 = v2;
        this.a = a;

    }

    public void getNext(){
        calcular(this.v1,this.v2,this.a);
    }

    public void calcular(int v1, int v2,int a){
        int k;
        if((v1+v2)<=a)
            k = 0;
        else
            k = -1;
        int v3 = (v1+v2)+k*a;

        if (v3 != v2){
            System.out.println(v3);
            calcular(v2,v3,a);
        }

    }

}
