/*         1
          222
         33333
        4444444
       555555555

                   */
import java.util.*;
  class Pattern29
  {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter number");
      int n=sc.nextInt();

      for(int i=1;i<=n;i++)
      {
        for(int j=1;j<=n-i;j++)
        {
          System.out.print(" ");
        }
        for(int k=1;k<=2*i-1;k++)
        {
          System.out.print(i);
        }
        System.out.println();
      }
    }
  }
