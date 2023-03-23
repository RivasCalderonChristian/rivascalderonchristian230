import java.io.*;
class VectorIncrementar
    {
     public static void main(String[] args)
       {
         int[] listaNumeros = {0, -9, 4, -1, 3, 7};
         // Ciclo para mostrar arreglo original. 
         for (int i = 0; i < listaNumeros.length; i++) {
           System.out.print(" "+listaNumeros[i]);
           }
     
         // Ciclo para modificar el arreglo original (sumar el valor de 3 a cada valor) 
         for (int i = 0; i < listaNumeros.length; i++) {
         listaNumeros[i] = listaNumeros[i] + 3; 
         }
    
         System.out.println(" ");
         // Ciclo para mostrar arreglo modificado. 
         for (int i = 0; i < listaNumeros.length; i++) {
           System.out.print(" "+listaNumeros[i]);
           }
        }
     }