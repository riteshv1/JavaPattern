import java.util.*;
  class Pattern35
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
        for(int k=n;k>=1;k--)
        {
          System.out.print(k);
        }
        System.out.println();
      }
    }
}
