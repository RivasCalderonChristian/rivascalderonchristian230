import java.io.*;
class VectorBuscarV2
    {
     public static void main(String[] args)
       {
         int[] listaNumeros = {15, 3, 1};
         int encontrado = 0, numBuscado = 1;
         for(int f = 0; f < listaNumeros.length; f++)
          {
            if(numBuscado == listaNumeros[f])
             encontrado=1;
          }
         if(encontrado==1)
           System.out.print("Numero:"+numBuscado+", encontrado");
         else
           System.out.print("Numero:"+numBuscado+",NO encontrado");
       }
    }