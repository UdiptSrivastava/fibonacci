import java.util.*;
class Fibo
{
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int n;
         System.out.println("enter limit");
         n=sc.nextInt();
        int t1 = 0, t2 = 1;
        System.out.print("First " + n + " terms: ");

        for (int i = 1; i <= n; ++i)
        {
            System.out.print(t1 + "  ");

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }
}
