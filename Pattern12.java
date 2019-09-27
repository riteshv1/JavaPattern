/* 10101
   1010
   101
   10
   1     */
import java.util.*;
  class Pattern12
  {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter number");
int n=sc.nextInt();


    for(int i=n;i>=1;i--)
    {

      for(int j=1;j<=i;j++)
      {
      System.out.print(j%2+"");

      }
      System.out.println();
    }
  }
}
