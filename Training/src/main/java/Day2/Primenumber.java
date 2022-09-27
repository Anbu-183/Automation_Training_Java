package Day2;

import java.util.Scanner;

public class Primenumber {
    public static void main(String[]args){
        int i=2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        if (n/i==0){
            System.out.println(n+" Not a prime Number");
        }
        else {
            System.out.println(n+" Is prime number");
        }

    }
}
