/*  ABCDE
    BCDE
    CDE
    DE
    E    */
import java.util.*;
  class Pattern8
  {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter number");
int n=sc.nextInt();


    for(int i=1;i<=n;i++)
    {
      for(int j=i;j<=n;j++)
      {
        System.out.print((char)(j+64)+"");
      }
      System.out.println();
    }
  }
}
