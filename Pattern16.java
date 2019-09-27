/*  ABCDE
    FGHI
    JKL
    MN
    O    */
import java.util.*;
  class Pattern17
  {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter number");
int n=sc.nextInt();

   int x=1;
    for(int i=1;i<=n;i++)
    {

      for(int j=1;j<=i;j++)
      {
      System.out.print(x+"");
      x++;;
      if(x>9)
      x=1;
      }
      System.out.println();
    }
  }
}
