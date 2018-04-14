 /*
  * To change this license header, choose License Headers in Project Properties.
  * To change this template file, choose Tools | Templates
  * and open the template in the editor.
  */
 /**
  *
  * @author PCGUEST
  */
 public class Generador {

     private int v1,v2,a;

     public boolean isPrime(int n){
         for(int i=2;i<n;i++){
             if(n%i==0){
                 return false;
             }
         }
         return true;
     }

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

     public int fibonacci(int v1, int v2,int a){

         int k;
         if((v1+v2)<=a)
             k = 0;
         else
             k = -1;
         int v3 = (v1+v2)+k*a;
         System.out.println(v3);
         if (v3 != v2)
             fibonacci(v2,v3,a);
         return 1;
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
