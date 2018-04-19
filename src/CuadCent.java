public class CuadCent extends Generador {

    private int seed;
    private int cifra;
    private int cant;

    public CuadCent(int seed, int cant){
        this.seed = seed;
        this.cifra = String.valueOf(seed).length();
        this.cant = cant;
    }

    public void getNext(){
        calcular(this.seed);
    }

    public void calcular(int seed){


        String auxS;
        int auxI;
        if(cifra==2) {
            auxS = String.format("%04d", seed * seed);
            auxS = auxS.substring(1,3);
        } else {
            auxS = String.format("%08d", seed * seed);
            auxS = auxS.substring(2,6);
        }
        auxI = Integer.parseInt(auxS);

        if(!(auxI==seed||this.cant==0)){
            cant--;
            System.out.println(auxI);
            calcular(auxI);
        }
        if(cant!=0){
            System.out.println("No se ha podido cumplir la cantidad porque se cumplió el ciclo primero");
            cant = 0;
        }




    }
}
