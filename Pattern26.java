/*      0
      0 1 0
    0 1 0 1 0
  0 1 0 1 0 1 0
0 1 0 1 0 1 0 1 0

                    */
import java.util.*;
  class Pattern26
  {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter number");
      int n=sc.nextInt();
      for(int i=1;i<=n;i++)
      {
        for(int j=1;j<=n-i;j++)
        {
          System.out.print("  ");
        }
        int x=0;
        for(int k=1;k<=2*i-1;k++)
        {

          System.out.print(x%2+" ");
          x++;
        }
        System.out.println();
      }
    }
  }
