/*  54321
    4321
    321
    21
    1   */
import java.util.*;
  class Pattern19
  {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter number");
int n=sc.nextInt();


    for(int i=n;i>=1;i--)
    {
      int x=i;
      for(int j=i;j>=1;j--)
      {
      System.out.print(x+"");
      x--;

      }
      System.out.println();
    }
  }
}
