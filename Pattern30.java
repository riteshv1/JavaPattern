/*  123456789
     1234567
     12345
      123
       1
         */
import java.util.*;
  class Pattern30
  {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter number");
      int n=sc.nextInt();
      int st=2*n-1;
      for(int i=n;i>=1;i--)
      {
        for(int j=n;j>=i;j--)
        {
          System.out.print(" ");
        }
        for(int k=1;k<=st;k++)
        {
          System.out.print(k);
        }
        st=st-2;
        System.out.println();
      }
    }
  }
