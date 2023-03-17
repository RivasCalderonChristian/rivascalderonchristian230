import java.io.*;
class IntercambiarV2
  {
   public static void main(String[] args)
     { 
      int[]numerosA = {5, 9, 2};
      int[]numerosB = {0, 0, 0};
       
      for(int i = 0; i< 3; i++)
       {
      numerosB[i]=numerosA[i];
       }
     
      for(int i = 0; i< 3; i++)
       {

      
      System.out.println(+ numerosB[i]);
       }
      
     }
   }