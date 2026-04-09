package Day_2;

import java.util.Scanner;

public class palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

int n = sc.nextInt();
int r=n;

int rev = 0;

        while(n!=0){

            int d = n%10;
            rev = rev*10 + d;
            n=n/10;

        }
     String result = (r==rev)? "ispalindrom":"not palindrome";
     System.out.println(result);
    }


}