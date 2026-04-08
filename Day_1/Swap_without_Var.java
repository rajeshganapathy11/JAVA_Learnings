
import java.util.Scanner;

public class Swap_without_Var {

    public static void main(String args[]) {


        Scanner sc =  new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();


        a = a+b;

       b = a-b;

       a= a-b;

       System.err.println("A is "+a+" B is "+ b);

    }
}
