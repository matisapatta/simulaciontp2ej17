public class CuadCent extends Generador {

    private int seed;
    private int cifra;

    public CuadCent(int seed){
        this.seed = seed;
        this.cifra = String.valueOf(seed).length();
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

        if(auxI!=seed){
            System.out.println(auxI);
            calcular(auxI);
        }




    }
}
