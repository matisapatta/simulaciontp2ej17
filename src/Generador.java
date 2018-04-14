public abstract class Generador {

     private int v1,v2,a;

    public abstract void getNext();

     public Generador(){
         v1=0;
         v2=0;
         a=0;
     }

     public void setV1 (int var1){
         v1=var1;
     }
     public int getV1(){
         return v1;
     }

     public void setV2 (int var2){
         v2=var2;
     }
     public int getV2(){
         return v2;
     }
     public void setA (int varA){
         a=varA;
     }
     public int getA(){
         return a;
     }


     public void cuadcent(int A){
         int A2;
         String S = new String();
         A = A*A;
         if(A>99 && A<1000){
             S = String.format("%04d", A);
         }
         System.out.println(S);
         A2 = Integer.parseInt(S);
         while(A!=A2)
             cuadcent(A);

     }
 }
