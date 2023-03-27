import java.io.*;
class ParImpar
  {
   public static void main(String[] args)
   {
    int num = 11;
    int parimpar = 0;
    parimpar = num % 2;
    if(parimpar == 0)
      {
       System.out.print("PAR");
      }
    else
      {
       System.out.print("IMPAR");
      }
    }
   }