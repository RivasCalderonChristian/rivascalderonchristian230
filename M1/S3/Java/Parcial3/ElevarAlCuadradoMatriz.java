import java.io.*;
class ElevarAlCuadradoMatriz
  {
   public static void main  (String[] args)
     {
       int A [][]= {{5,1,0},{5,2,0},{5,3,0}};
       //System.out.println("valores introducidos:");
       for(int f=0; f<A.length; f++)
        {
         for(int c=0; c<A[f].length; c++)
          {
            A[f][c] = A[f][c] * A[f][c];

            System.out.print(A[f][c]+" ");         
          }
         //System.out.println(A[f][c]);
        }
     }
  }
