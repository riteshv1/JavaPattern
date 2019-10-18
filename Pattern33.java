/*        12345
           2345
            345
             45
              5
                    */
import java.util.*;
  class Pattern33
  {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter number");
      int n=sc.nextInt();
      for(int i=1;i<=n;i++)
      {
        for(int j=1;j<i;j++)
        {
          System.out.print(" ");
        }
        for(int k=i;k<=n;k++)
        {
          System.out.print(k);
        }
        System.out.println();
      }
    }
  }
