/*    1
     21
    321
   4321
  54321 */
import java.util.*;
  class Pattern34
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
        for(int k=i;k>=1;k--)
        {
          System.out.print(k);
        }
        System.out.println();
      }
    }
}
