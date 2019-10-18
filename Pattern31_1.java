/*             *       *
               **     **
               ***   ***
               **** ****
               *********
                              */
import java.util.*;
  class Pattern31_1
  {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter number");
      int n=sc.nextInt();
      for(int i=1;i<=n;i++)
      {
        for(int j=1;j<=i;j++)
        {    System.out.print ("*");    }
        for(int k=1;k<2*n+2*i;k++)
        {
          System.out.print(" ");
        }
        for(int x=1;x<=i;x++)
        {
          if(x<n)

        System.out.print("*");
        }
        //else
      //  System.out.print(" ");
      System.out.println();
    }
  }
}
