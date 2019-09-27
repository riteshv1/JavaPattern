/*  A
    BC
    CDE
    DEFG
    EFGHI   */
import java.util.*;
  class Pattern10
  {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter number");
      int n=sc.nextInt();

    for(int i=1;i<=n;i++)
    {
      int k=i;
      for(int j=1;j<=i;j++)
      {
        System.out.print((char)(k+64)+"");
        k++;
      }
      System.out.println();
    }
  }
}
