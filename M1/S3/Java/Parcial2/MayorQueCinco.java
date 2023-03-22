import java.io.*;
class MayorQueCinco
    {
     public static void main(String[] args)
       {
         int[] listaNumeros = {15, 3, 2, 10, 18};
         int contar = 0;
         for(int i = 0; i < listaNumeros.length; i++)
           {
            if(listaNumeros[i] > 3)
               {
                contar++; 
               }
           }
        System.out.print(contar);
       }
    }