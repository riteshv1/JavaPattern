/* 10101
  01010
  10101
  01010
  10101 */
import java.util.*;
  class Pattern1
  {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter number");
int n=sc.nextInt();

  int x=1;
    for(int i=1;i<=n;i++)
    {
      for(int j=1;j<=n;j++)
      {

      System.out.print(x%2+"");
      x++;
      }
      System.out.println();
    }
  }
}
