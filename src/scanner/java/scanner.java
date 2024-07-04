package scanner.java;

import java.util.Scanner;


public class scanner
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter you number");
        int number=sc.nextInt();
        if(number%2==0)
        {
            System.out.println("number is :"+number+"even number");
        }
        else
        {
            System.out.println("number is "+number+"odd number");
        }

    }
}
