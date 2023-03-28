import java.io.*;
class ParImparV2
  {
   public static void main (String[] args)
     {
      
      //ENTRADA DE DATOS

      int [] numeros = {3,9,4,6,12};
      int par = 0, impar = 0, parimpar = 0;


      //PROCESO

      int i = 0 ;
      while (i <= 4)
       { 
        parimpar = numeros[i] % 2;
        if (parimpar == 0)
          {
           par++;
          } //if
        else
           {
            impar++;
           } //else
        i++;
       } //while
      System.out.println("Cantidad de numeros PARES:" +par);
      System.out.println("Cantidad de numeros IMPARES:" +impar);
    }
  }