import java.io.*;
class MatrizBuscar
    {
     public static void main(String[] args)
       {
         int[][] listaNumeros = {{15, 3, 1},{7,0,9},{6,8,19}};
         int encontrado = 0, numBuscado = 1;
         for(int f = 0; f < listaNumeros.length; f++)
          {
            for(int c = 0; c < listaNumeros[f].length; c++)
            {
             if(numBuscado == listaNumeros[f][c])
               encontrado=1;
             }
          }
         if(encontrado==1)
           System.out.print("Numero:"+numBuscado+", encontrado");
         else
           System.out.print("Numero:"+numBuscado+",NO encontrado");
       }
    }