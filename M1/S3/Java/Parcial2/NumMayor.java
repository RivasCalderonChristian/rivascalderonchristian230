import java.io.*;
class NumMayor
    {
     public static void main(String[] args)
       {
        int[] Numeros = {11, 7, 13};
        int numeromayor = 0;
        for(int i = 0; i <= 2 ; i++)
           {
            if(numeromayor > Numeros[i])
               {
                numeromayor = numeromayor;
               }
             else
               {
                numeromayor = Numeros[i];
               }
            }
        System.out.println(numeromayor);
       }
    }